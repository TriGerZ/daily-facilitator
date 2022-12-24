package com.trigerz.dailyfacilitator.core.weather.use_case;

import com.trigerz.dailyfacilitator.core.weather.entity.Weather;
import com.trigerz.dailyfacilitator.core.weather.entity.value_object.Localisation;
import com.trigerz.dailyfacilitator.core.weather.port.WeatherProvider;

import java.util.Date;

public class GetTodayWeather {

	private final WeatherProvider weatherProvider;
	public GetTodayWeather(WeatherProvider weatherProvider) {
		this.weatherProvider = weatherProvider;
	}

	public Weather execute(Date date, Localisation localisation){

		return weatherProvider.findByDateAndLocation(date, localisation);

	}
}
