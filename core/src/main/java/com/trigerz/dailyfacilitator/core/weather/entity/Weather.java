package com.trigerz.dailyfacilitator.core.weather.entity;

import com.trigerz.dailyfacilitator.core.weather.entity.value_object.Localisation;
import com.trigerz.dailyfacilitator.core.weather.entity.value_object.Temperature;

import java.util.Collection;
import java.util.Date;

public class Weather {

	private  Date date;
	private  Collection<Temperature> temperature;
	private Localisation localisation;

	private WeatherTypeOfDay weatherTypeOfDay;

	public Weather() {
	}

	public Weather(Date date, Collection<Temperature> temperature, Localisation localisation) {
		this.date = date;
		this.temperature = temperature;
		this.localisation = localisation;
	}

	public void initWeatherTypeOfDay(){
		if (this.temperature.stream().anyMatch(temperature1 -> temperature1.getValue()<0)){
			this.weatherTypeOfDay=WeatherTypeOfDay.COLD;
		} else if (this.temperature.stream().anyMatch(temperature1 -> temperature1.getValue()>30)) {
			this.weatherTypeOfDay=WeatherTypeOfDay.WARM;
		}
		else this.weatherTypeOfDay=WeatherTypeOfDay.NORMAL;
	}

	public Collection<Temperature> getTemperature() {
		return temperature;
	}
	public Localisation getLocalisation() {
		return localisation;
	}
	public Date getDate() {
		return date;
	}

	public WeatherTypeOfDay getWeatherTypeOfDay() {
		return weatherTypeOfDay;
	}

	public void setWeatherTypeOfDay(WeatherTypeOfDay weatherTypeOfDay) {
		this.weatherTypeOfDay = weatherTypeOfDay;
	}

	@Override
	public String toString() {
		return "Weather{" +
				"date=" + date +
				", temperature=" + temperature +
				", localisation=" + localisation +
				", weatherTypeOfDay=" + weatherTypeOfDay +
				'}';
	}
}
