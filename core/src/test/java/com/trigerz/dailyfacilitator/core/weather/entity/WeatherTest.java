package com.trigerz.dailyfacilitator.core.weather.entity;

import com.trigerz.dailyfacilitator.core.fixture.WeatherFixture;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;

class WeatherTest {

	@Test
	void givenNegativeTempThenCOLD() {
		//Given
		WeatherTypeOfDay expectedResult = WeatherTypeOfDay.COLD;
		Weather weather = WeatherFixture.aWeatherBasicWithOneTempCOLD();
		//When
		weather.initWeatherTypeOfDay();
		//Then
		assertEquals(expectedResult,weather.getWeatherTypeOfDay());
	}

	@Test
	void givenTempGreaterThan30ThenWARM() {
		//Given
		WeatherTypeOfDay expectedResult = WeatherTypeOfDay.WARM;
		Weather weather = WeatherFixture.aWeatherBasicWithOneTempWARM();
		//When
		weather.initWeatherTypeOfDay();
		//Then
		assertEquals(expectedResult,weather.getWeatherTypeOfDay());
	}

	@Test
	void givenTempBetween0AND30ThenNORMAL() {
		//Given
		WeatherTypeOfDay expectedResult = WeatherTypeOfDay.NORMAL;
		Weather weather = WeatherFixture.aWeatherBasicWithOneTempNORMAL();
		//When
		weather.initWeatherTypeOfDay();
		//Then
		assertEquals(expectedResult,weather.getWeatherTypeOfDay());
	}
}
