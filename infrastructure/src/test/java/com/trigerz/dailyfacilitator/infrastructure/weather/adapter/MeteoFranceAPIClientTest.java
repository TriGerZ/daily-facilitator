package com.trigerz.dailyfacilitator.infrastructure.weather.adapter;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MeteoFranceAPIClientTest {

	@Autowired
	MeteoFranceAPIClient meteoFranceAPIClient;

	@Test
	void findByDateAndLocation() {
		meteoFranceAPIClient.findByDateAndLocation(null, null);
	}
}
