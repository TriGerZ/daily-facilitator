package com.trigerz.dailyfacilitator.core.weather.use_case;

import com.trigerz.dailyfacilitator.core.fixture.WeatherFixture;
import com.trigerz.dailyfacilitator.core.weather.entity.Weather;
import com.trigerz.dailyfacilitator.core.weather.entity.WeatherTemperatureUnit;
import com.trigerz.dailyfacilitator.core.weather.entity.value_object.Localisation;
import com.trigerz.dailyfacilitator.core.weather.entity.value_object.LocalisationCoordinate;
import com.trigerz.dailyfacilitator.core.weather.entity.value_object.Temperature;
import com.trigerz.dailyfacilitator.core.weather.port.WeatherProvider;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.*;

class GetTodayWeatherTest {
	@Mock
	WeatherProvider weatherProvider;
	@InjectMocks
	GetTodayWeather getTodayWeather;

	@BeforeEach
	void setUp() {
		MockitoAnnotations.openMocks(this);
	}

	@Test
	void givenOneTempWhenExecuteThenWeatherOfDayWithOneTemperature() {
		//Given
		Date date = WeatherFixture.aDate2022_12_23_at_2000();
		Localisation localisation = null;
		Weather expectedResult = WeatherFixture.aWeatherBasicWithOneTemp();
		given(weatherProvider.findByDateAndLocation(any(),any())).willReturn(expectedResult);
		//When
		Weather result = getTodayWeather.execute(date, localisation);
		//Then
		Assertions.assertEquals(expectedResult.toString(), result.toString());
	}

	@Test
	void givenMultiTempWhenExecuteThenWeatherOfDayWithMultiTemperature() {
		//Given
		Date date = WeatherFixture.aDate2022_12_23_at_2000();
		Weather expectedResult = WeatherFixture.aWeatherBasicWithMultiTemp();
		Localisation localisation = null;
		given(weatherProvider.findByDateAndLocation(any(),any())).willReturn(expectedResult);
		//When
		Weather result = getTodayWeather.execute(date, localisation);
		//Then
		Assertions.assertEquals(expectedResult.toString(), result.toString());
	}
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme
