package com.trigerz.dailyfacilitator.infrastructure.weather.provider.api.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class WeatherDTOOpenMeteo {
	private float latitude;
	private float longitude;
	private float elevation;
	private float generationtime_ms;
	private float utc_offset_seconds;
	private String timezone;
	private String timezone_abbreviation;
	private WeatherApiHourly HourlyObject;
	private WeatherApiHourlyUnits Hourly_unitsObject;
	private WeatherApiCurrentWeather Current_weatherObject;

}

