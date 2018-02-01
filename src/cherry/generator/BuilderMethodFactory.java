/*
 * Copyright (c) Apoc- 2018
 *
 * File last modfied: 05.01.18 19:44
 */

package cherry.generator;

import amber.model.AnnotationModel;
import com.squareup.javapoet.ArrayTypeName;
import com.squareup.javapoet.ClassName;
import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeName;
import cherry.model.CodeUnit;
import cherry.model.CodeUnitDatumType;
import cherry.model.CodeUnitModifier;

import javax.lang.model.element.Modifier;

public class BuilderMethodFactory {
	private String builderClassIdentifier;
	private String packageIdentifier;

	public BuilderMethodFactory(AnnotationModel annotationModel, String targetPackage) {
		this.builderClassIdentifier = annotationModel.getIdentifier() + "UnitBuilder";
		this.packageIdentifier = targetPackage;
	}

	public MethodSpec createForType(BuilderMethodType builderMethodType) {
		MethodSpec createdMethodSpec = null;
		TypeName builderTypeName = ClassName.get(packageIdentifier, builderClassIdentifier);

		switch(builderMethodType) {
			case CREATE_WITH_IDENTIFIER:
				createdMethodSpec = createCreateWithIdSpec(builderMethodType.toString(), builderTypeName);
				break;
			case WITH_DATA_TYPE:
				createdMethodSpec = createWithDataTypeSpec(builderMethodType.toString(), builderTypeName);
				break;
			case WITH_MODIFIERS:
				createdMethodSpec = createWithModsSpec(builderMethodType.toString(), builderTypeName);
				break;
			case WITH_SUB_CODEUNIT:
				createdMethodSpec = createWithSubCodeUnitSpec(builderMethodType.toString(), builderTypeName);
				break;
			case END:
				createdMethodSpec = createEndSpec(builderMethodType.toString());
				break;
		}

		return createdMethodSpec;
	}

	private MethodSpec createCreateWithIdSpec(String identifier, TypeName builderType) {
		return MethodSpec.methodBuilder(identifier)
				.addModifiers(Modifier.PUBLIC, Modifier.STATIC)
				.returns(builderType)
				.addParameter(String.class, "identifier")
				.addStatement("$T cub = new $T()", builderType, builderType)
				.addStatement("cub.codeUnit.addCodeUnitDatum($T.$L, identifier)", CodeUnitDatumType.class, "IDENTIFIER")
				.addStatement("return cub")
				.build();
	}

	private MethodSpec createWithModsSpec(String identifier, TypeName builderType) {
		return MethodSpec.methodBuilder(identifier)
				.addModifiers(Modifier.PUBLIC)
				.returns(builderType)
				.addParameter(ArrayTypeName.get(CodeUnitModifier[].class), "modifiers")
				.varargs()
				.addStatement("this.codeUnit.addCodeUnitDatum($T.$L, modifiers)", CodeUnitDatumType.class, "MODIFIER")
				.addStatement("return this")
				.build();
	}

	private MethodSpec createWithDataTypeSpec(String identifier, TypeName builderType) {
		return MethodSpec.methodBuilder(identifier)
				.addModifiers(Modifier.PUBLIC)
				.returns(builderType)
				.addParameter(Class.class, "dataType")
				.addStatement("this.codeUnit.addCodeUnitDatum($T.$L, dataType)", CodeUnitDatumType.class, "DATA_TYPE")
				.addStatement("return this")
				.build();
	}

	private MethodSpec createWithSubCodeUnitSpec(String identifier, TypeName builderType) {
		return MethodSpec.methodBuilder(identifier)
				.addModifiers(Modifier.PUBLIC)
				.returns(builderType)
				.addParameter(CodeUnit.class, "codeUnit")
				.addStatement("this.codeUnit.addSubCodeUnit(codeUnit)")
				.addStatement("return this")
				.build();
	}

	private MethodSpec createEndSpec(String identifier) {
		return MethodSpec.methodBuilder(identifier)
				.addModifiers(Modifier.PUBLIC)
				.returns(CodeUnit.class)
				.addStatement("return codeUnit")
				.build();
	}


}
