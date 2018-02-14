/*
 * Copyright (c) Apoc- 2018
 *
 * File last modfied: 01.02.18 12:54
 */

package amber.parser;

import amber.annotations.VariableModifier;
import amber.model.AnnotationModel;
import amber.model.AnnotationType;
import cherry.model.*;
import cherry.platform.CodeUnitBuilderUtils;
import com.github.javaparser.ast.Modifier;
import com.github.javaparser.ast.body.FieldDeclaration;
import com.github.javaparser.ast.body.VariableDeclarator;
import com.github.javaparser.ast.expr.AnnotationExpr;
import com.github.javaparser.resolution.types.ResolvedType;

import java.util.EnumSet;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FieldAnnotationParser extends AnnotationParser {
	private void parseVariableModifierAnnotation(FieldDeclaration declaration, AnnotationModel model) {
		Optional<AnnotationExpr> anno = declaration.getAnnotationByClass(VariableModifier.class);
		if(anno.isPresent()) {
			model.addVariabilityAnnotation(AnnotationType.VARIABLE_MODIFIERS);
		} else {
			model.getDefaultCodeUnit().addCodeUnitDatum(CodeUnitDatumType.MODIFIER, getModifier(declaration));
		}
	}

	private void parseFixedCodeUnitHasGetterAnnotation(FieldDeclaration declaration, CodeUnit cu) {
		Optional<AnnotationExpr> anno = declaration.getAnnotationByClass(amber.annotations.HasGetter.class);
		if(anno.isPresent()) {
			VariableDeclarator vd = declaration.getVariable(0);
			String typeName = resolveVariableType(vd);
			String identifier = getFieldIdentifier(vd);

			CodeUnit method = CodeUnitBuilderUtils.createGetterCodeUnit(identifier, typeName);

			cu.addSubCodeUnit(method);
		}
	}

	private void parseFixedCodeUnitHasSetterAnnotation(FieldDeclaration declaration, CodeUnit cu) {
		Optional<AnnotationExpr> anno = declaration.getAnnotationByClass(amber.annotations.HasSetter.class);
		if(anno.isPresent()) {
			VariableDeclarator vd = declaration.getVariable(0);
			String identifier = getFieldIdentifier(vd);
			String typeName = resolveVariableType(vd);

			CodeUnit method = CodeUnitBuilderUtils.createSetterCodeUnit(identifier, typeName);

			cu.addSubCodeUnit(method);
		}
	}

	private void parseVariableTypeAnnotation(FieldDeclaration declaration, AnnotationModel model) {
		Optional<AnnotationExpr> anno = declaration.getAnnotationByClass(amber.annotations.VariableType.class);
		if(anno.isPresent()) {
			model.addVariabilityAnnotation(AnnotationType.VARIABLE_DATATYPE);
		} else {
			//todo refactor
			CodeUnit codeUnit = model.getDefaultCodeUnit();
			VariableDeclarator vd = declaration.getVariable(0);
			String declaringClassName = resolveDeclaringClassName(vd);
			String variableTypeName = resolveVariableType(vd);

			codeUnit.addCodeUnitDatum(CodeUnitDatumType.DATA_TYPE, variableTypeName);

			handleClassReference(codeUnit, declaringClassName, variableTypeName);
		}
	}

	public void parseCodeUnitAnnotation(FieldDeclaration declaration, List<AnnotationModel> models) {
		Optional<AnnotationExpr> anno = declaration.getAnnotationByClass(amber.annotations.CodeUnit.class);
		anno.ifPresent(annotationExpr -> {
			AnnotationModel model = new AnnotationModel();
			CodeUnit cu = new FieldCodeUnit(CodeUnitType.FIELD);
			model.setDefaultCodeUnit(cu);

			setIdentifier(model, annotationExpr);

			parseVariableModifierAnnotation(declaration, model);
			parseVariableTypeAnnotation(declaration, model);
			parseHasGetterAnnotation(declaration, model);
			parseHasSetterAnnotation(declaration, model);

			models.add(model);
		});
	}

	private void parseHasGetterAnnotation(FieldDeclaration declaration, AnnotationModel model) {
		Optional<AnnotationExpr> anno = declaration.getAnnotationByClass(amber.annotations.HasGetter.class);
		if(anno.isPresent()) {
			model.addExtensionAnnotation(AnnotationType.HAS_GETTER);
		}
	}

	private void parseHasSetterAnnotation(FieldDeclaration declaration, AnnotationModel model) {
		Optional<AnnotationExpr> anno = declaration.getAnnotationByClass(amber.annotations.HasSetter.class);
		if(anno.isPresent()) {
			model.addExtensionAnnotation(AnnotationType.HAS_SETTER);
		}
	}

	public void parseFixedCodeUnitAnnotation(FieldDeclaration declaration, AnnotationModel model) {
		Optional<AnnotationExpr> anno = declaration.getAnnotationByClass(amber.annotations.FixedCodeUnit.class);
		anno.ifPresent(annotationExpr -> {
			CodeUnit cu = model.getDefaultCodeUnit();

			VariableDeclarator vd = declaration.getVariable(0);
			String declaringClassName = resolveDeclaringClassName(vd);
			String variableTypeName = resolveVariableType(vd);

			CodeUnit subCodeUnit = CodeUnitBuilder
					.createWithIdentifier(getFieldIdentifier(vd))
					.setCodeUnitType(CodeUnitType.FIELD)
					.withModifiers(getModifier(declaration))
					.withDataType(variableTypeName)
					.end();

			handleClassReference(subCodeUnit, declaringClassName, variableTypeName);

			parseFixedCodeUnitHasGetterAnnotation(declaration, cu);
			parseFixedCodeUnitHasSetterAnnotation(declaration, cu);


			cu.addSubCodeUnit(subCodeUnit);
		});
	}

	private String resolveDeclaringClassName(VariableDeclarator vd) {
		return vd.resolve()
				.declaringType()
				.getQualifiedName();
	}

	//todo refactor NodeWithModifier!
	private CodeUnitModifier[] getModifier(FieldDeclaration fd) {
		EnumSet<Modifier> mods = fd.getModifiers();

		return mods
				.stream()
				.map(modifier -> CodeUnitModifier.valueOf(modifier.name()))
				.collect(Collectors.toList())
				.toArray(new CodeUnitModifier[mods.size()]);
	}

	private String getFieldIdentifier(VariableDeclarator vd) {
		return vd.getNameAsString();
	}

	private String resolveVariableType(VariableDeclarator vd) {
		ResolvedType rt = vd.resolve().getType();

		return getTypeName(rt);
	}
}
