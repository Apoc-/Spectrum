/*
 * Copyright (c) Apoc- 2018
 *
 * File last modfied: 05.01.18 18:33
 */

package cherry.generator;

//Todo: Extend to also create constructor and other methods
public enum BuilderMethodType {
	WITH_MODIFIERS("withModifiers"),
	WITH_DATA_TYPE("withDataType"),
	WITH_SUB_CODEUNIT("withSubCodeUnit"),
	CREATE_WITH_IDENTIFIER("createWithIdentifier"),
	CONSTRUCTOR(""),
	END("end"),
	INIT_DEF_CODE_UNIT("initDefCodeUnit");

	private final String methodName;

	BuilderMethodType(String methodName) {
		this.methodName = methodName;
	}

	@Override
	public String toString() {
		return this.methodName;
	}
}
