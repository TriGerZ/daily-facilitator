package com.trigerz.dailyfacilitator.infrastructure.weather.adapter;

import com.trigerz.dailyfacilitator.core.weather.entity.Weather;
import com.trigerz.dailyfacilitator.core.weather.entity.value_object.Localisation;
import com.trigerz.dailyfacilitator.core.weather.port.WeatherProvider;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class OpenWeather implements WeatherProvider {
	@Override
	public Weather findByDateAndLocation(Date date, Localisation localisation) {
		return null;
	}
}
