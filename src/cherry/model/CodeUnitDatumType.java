/*
 * Copyright (c) Apoc- 2018
 *
 * File last modfied: 07.01.18 16:14
 */

package cherry.model;

public enum CodeUnitDatumType {
	MODIFIER,
	IDENTIFIER,
	DATA_TYPE,
	RETURN_TYPE,
	METHOD_BODY_STRING,
	GETTER,
	SETTER,
	PARENT_CLASS_REF,
	TYPE_ARGUMENTS;

	@Override
	public String toString() {
		return this.name();
	}
}
