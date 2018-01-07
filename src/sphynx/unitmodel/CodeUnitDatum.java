/*
 * Copyright (c) Apoc- 2017
 *
 * File last modfied: 26.12.17 00:07
 */

package sphynx.unitmodel;

import java.io.Serializable;
import java.util.Arrays;

public class CodeUnitDatum<T> implements Serializable {
	private final T datumData;

	CodeUnitDatum(T datumData) {
		this.datumData = datumData;
	}

	public T getDatumData() {
		return datumData;
	}

	@Override
	public String toString() {
		if(datumData.getClass().isArray())
			return Arrays.toString((Object[]) datumData); //smelly smell is smelly

		return datumData.toString();
	}
}
