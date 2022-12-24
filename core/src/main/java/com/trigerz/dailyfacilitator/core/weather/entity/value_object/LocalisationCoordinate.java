package com.trigerz.dailyfacilitator.core.weather.entity.value_object;

public class LocalisationCoordinate {
	private final float latitude;
	private final float longitude;

	public LocalisationCoordinate(float latitude, float longitude) {
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public float getLatitude() {
		return latitude;
	}

	public float getLongitude() {
		return longitude;
	}

	@Override
	public String toString() {
		return "LocalisationCoordinate{" +
				"latitude=" + latitude +
				", longitude=" + longitude +
				'}';
	}
}
