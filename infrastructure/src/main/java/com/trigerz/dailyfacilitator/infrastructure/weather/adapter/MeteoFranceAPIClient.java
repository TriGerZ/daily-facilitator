package com.trigerz.dailyfacilitator.infrastructure.weather.adapter;

import com.trigerz.dailyfacilitator.core.weather.entity.value_object.Localisation;
import com.trigerz.dailyfacilitator.infrastructure.weather.provider.api.DTO.Weather;
import com.trigerz.dailyfacilitator.infrastructure.weather.provider.api.DTO.WeatherDTOOpenMeteo;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.Date;
import java.util.Objects;

@Component
public class MeteoFranceAPIClient{

	private WebClient webClient;
	public MeteoFranceAPIClient(WebClient.Builder webClientBuilder) {
		this.webClient = webClientBuilder.baseUrl("https://api.open-meteo.com/v1/meteofrance").build();
	}

	public Mono<Objects> someRestCall() {
		return this.webClient.get().uri("/?latitude=52.52&longitude=13.41&hourly=temperature_2m")
				.retrieve().bodyToMono(Objects.class);
	}

	public WeatherDTOOpenMeteo findByDateAndLocation(Date date, Localisation localisation){



		Mono<Objects> test = this.someRestCall();
		return null;
	}
}
