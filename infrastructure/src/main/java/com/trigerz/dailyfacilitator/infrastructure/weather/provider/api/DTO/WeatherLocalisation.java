package com.trigerz.dailyfacilitator.infrastructure.weather.provider.api.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class WeatherLocalisation {
	private final String postalCode;
	private final String town;
	private final WeatherLocalisationCoordinate localisationCoordinate;

}
