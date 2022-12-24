package com.trigerz.dailyfacilitator.core.fixture;

import com.trigerz.dailyfacilitator.core.weather.entity.*;
import com.trigerz.dailyfacilitator.core.weather.entity.value_object.Localisation;
import com.trigerz.dailyfacilitator.core.weather.entity.value_object.LocalisationCoordinate;
import com.trigerz.dailyfacilitator.core.weather.entity.value_object.Temperature;

import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class WeatherFixture {
	public static Weather aWeatherBasicWithOneTemp(){
		return new Weather(
				new GregorianCalendar(2022, Calendar.DECEMBER, 23, 17, 38).getTime(),
				List.of(new Temperature(20.0, WeatherTemperatureUnit.CELSIUS, WeatherFixture.aDate2022_12_23_at_2200())),
				new Localisation(
						"postalCode", "town",
						new LocalisationCoordinate(0f, 0f)));
	}

	public static Weather aWeatherBasicWithOneTempCOLD(){
		return new Weather(
				new GregorianCalendar(2022, Calendar.DECEMBER, 23, 17, 38).getTime(),
				List.of(new Temperature(-1.0, WeatherTemperatureUnit.CELSIUS, WeatherFixture.aDate2022_12_23_at_2200())),
				new Localisation(
						"postalCode", "town",
						new LocalisationCoordinate(0f, 0f)));
	}

	public static Weather aWeatherBasicWithOneTempWARM(){
		return new Weather(
				new GregorianCalendar(2022, Calendar.DECEMBER, 23, 17, 38).getTime(),
				List.of(new Temperature(32.1, WeatherTemperatureUnit.CELSIUS, WeatherFixture.aDate2022_12_23_at_2200())),
				new Localisation(
						"postalCode", "town",
						new LocalisationCoordinate(0f, 0f)));
	}

	public static Weather aWeatherBasicWithOneTempNORMAL(){
		return new Weather(
				new GregorianCalendar(2022, Calendar.DECEMBER, 23, 17, 38).getTime(),
				List.of(new Temperature(20.0, WeatherTemperatureUnit.CELSIUS, WeatherFixture.aDate2022_12_23_at_2200())),
				new Localisation(
						"postalCode", "town",
						new LocalisationCoordinate(0f, 0f)));
	}

	public static Weather aWeatherBasicWithMultiTemp(){
		return new Weather(
				new GregorianCalendar(2022, Calendar.DECEMBER, 23, 17, 38).getTime(),
				List.of(new Temperature(-20.0, WeatherTemperatureUnit.CELSIUS, WeatherFixture.aDate2022_12_23_at_2000()),
						new Temperature(15.0, WeatherTemperatureUnit.CELSIUS, WeatherFixture.aDate2022_12_23_at_2100()),
						new Temperature(10.0, WeatherTemperatureUnit.CELSIUS, WeatherFixture.aDate2022_12_23_at_2200())),
				new Localisation(
						"postalCode", "town",
						new LocalisationCoordinate(0f, 0f)));
	}

	public static Date aDate2022_12_23_at_2200(){
		return new GregorianCalendar(2022, Calendar.DECEMBER, 23, 22, 0).getTime();
	}
	public static Date aDate2022_12_23_at_2100(){
		return new GregorianCalendar(2022, Calendar.DECEMBER, 23, 21, 0).getTime();
	}
	public static Date aDate2022_12_23_at_2000(){
		return new GregorianCalendar(2022, Calendar.DECEMBER, 23, 20, 0).getTime();
	}
	public static Date aDate2020_06_10_at_1800(){
		return new GregorianCalendar(2020, Calendar.JUNE, 10, 18, 0).getTime();
	}
}
