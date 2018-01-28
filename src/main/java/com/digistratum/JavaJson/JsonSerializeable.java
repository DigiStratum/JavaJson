package com.digistratum.JavaJson;

public interface JsonSerializeable {

	/**
	 * Convert this instance to a JSON representation of itself
	 *
	 * @return String JSON encoded representation of this class instance
	 */
	String toJson();
}
