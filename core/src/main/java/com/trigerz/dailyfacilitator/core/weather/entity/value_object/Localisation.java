package com.trigerz.dailyfacilitator.core.weather.entity.value_object;

public class Localisation {
	private final String postalCode;
	private final String town;
	private final LocalisationCoordinate localisationCoordinate;

	public String getPostalCode() {
		return postalCode;
	}

	public String getTown() {
		return town;
	}

	public LocalisationCoordinate getLocalisationCoordinate() {
		return localisationCoordinate;
	}

	public Localisation(String postalCode, String town, LocalisationCoordinate localisationCoordinate) {
		this.postalCode = postalCode;
		this.town = town;
		this.localisationCoordinate = localisationCoordinate;
	}

	@Override
	public String toString() {
		return "Localisation{" +
				"postalCode='" + postalCode + '\'' +
				", town='" + town + '\'' +
				", localisationCoordinate=" + localisationCoordinate +
				'}';
	}
}
