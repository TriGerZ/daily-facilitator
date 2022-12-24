package com.trigerz.dailyfacilitator.infrastructure.weather.provider.api.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;

@Data
@AllArgsConstructor
public class WeatherApiHourly {
	ArrayList<Object> time = new ArrayList<Object>();
	ArrayList<Object> temperature_2m = new ArrayList<Object>();

}
