package com.pro100svitlo.creditCardNfcReader.utils;

import android.util.Log;

import com.pro100svitlo.creditCardNfcReader.model.enums.IKeyEnum;


/**
 * Utils class which provided methods to manipulate Enum
 */
public final class EnumUtils {

	/**
	 * Class logger
	 */
	private static final String LOGGER_TAG = EnumUtils.class.getSimpleName();

	/**
	 * Get the value of and enum from his key
	 * 
	 * @param pKey
	 *            key to find
	 * @param pClass
	 *            Enum class
	 * @return Enum instance of the specified key or null otherwise
	 */
	@SuppressWarnings("unchecked")
	public static <T extends IKeyEnum> T getValue(final int pKey, final Class<T> pClass) {
		for (IKeyEnum val : pClass.getEnumConstants()) {
			if (val.getKey() == pKey) {
				return (T) val;
			}
		}
		Log.e(LOGGER_TAG, "Unknow value:" + pKey + " for Enum:" + pClass.getName());
		return null;
	}

	/**
	 * Private constructor
	 */
	private EnumUtils() {
	}
}
