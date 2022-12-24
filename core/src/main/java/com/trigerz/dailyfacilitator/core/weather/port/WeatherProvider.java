package com.trigerz.dailyfacilitator.core.weather.port;

import com.trigerz.dailyfacilitator.core.weather.entity.value_object.Localisation;
import com.trigerz.dailyfacilitator.core.weather.entity.Weather;

import java.util.Date;

public interface WeatherProvider {
	public Weather findByDateAndLocation(Date date, Localisation localisation);
}
