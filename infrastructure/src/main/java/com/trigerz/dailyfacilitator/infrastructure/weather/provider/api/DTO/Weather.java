package com.trigerz.dailyfacilitator.infrastructure.weather.provider.api.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

@Data
@AllArgsConstructor
public class Weather implements Serializable {
	private  Date date;
	private  Collection<WeatherTemperature> temperature;
	private WeatherLocalisation localisation;

}
