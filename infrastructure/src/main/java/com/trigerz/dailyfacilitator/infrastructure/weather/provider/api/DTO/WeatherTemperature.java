package com.trigerz.dailyfacilitator.infrastructure.weather.provider.api.DTO;

import com.trigerz.dailyfacilitator.core.weather.entity.WeatherTemperatureUnit;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
public class WeatherTemperature {
	private final Double value;
	private final WeatherTemperatureUnit unit;
	private final Date date;

}
