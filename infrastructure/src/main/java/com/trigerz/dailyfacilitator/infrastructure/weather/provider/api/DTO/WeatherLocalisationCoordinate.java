package com.trigerz.dailyfacilitator.infrastructure.weather.provider.api.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class WeatherLocalisationCoordinate {
	private final float latitude;
	private final float longitude;
}
