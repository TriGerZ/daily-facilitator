package com.trigerz.dailyfacilitator.infrastructure.weather.provider.api.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class WeatherApiCurrentWeather {
	private String time;
	private float temperature;
	private float weathercode;
	private float windspeed;
	private float winddirection;

}
