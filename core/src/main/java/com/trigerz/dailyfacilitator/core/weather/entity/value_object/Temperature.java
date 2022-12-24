package com.trigerz.dailyfacilitator.core.weather.entity.value_object;

import com.trigerz.dailyfacilitator.core.weather.entity.WeatherTemperatureUnit;

import java.util.Date;

public class Temperature {
	private final Double value;
	private final WeatherTemperatureUnit unit;
	private final Date date;

	public Temperature(Double value, WeatherTemperatureUnit unit, Date date) {
		this.value = value;
		this.unit = unit;
		this.date = date;
	}



	public WeatherTemperatureUnit getUnit() {
		return unit;
	}

	public Date getDate() {
		return date;
	}

	@Override
	public String toString() {
		return "Temperature{" +
				"value=" + value +
				", unit=" + unit +
				", date=" + date +
				'}';
	}

	public Double getValue() {
		return value;
	}
}
