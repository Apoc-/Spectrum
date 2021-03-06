/*
 * Copyright (c) Apoc- 2017
 *
 * File last modfied: 24.12.17 00:34
 */
package scarlet.model;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class JavaClass {
	public String identifier;
	public Set<JavaModifier> modifiers;
	public List<JavaField> fields;
	public List<JavaMethod> methods;
	public List<JavaConstructor> constructors;

	public JavaClass() {
		this.identifier = "";
		this.modifiers = new HashSet<>();
		this.fields = new LinkedList<>();
		this.methods = new LinkedList<>();
	}
}
