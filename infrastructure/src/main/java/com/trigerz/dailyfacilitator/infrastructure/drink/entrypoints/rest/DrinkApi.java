package com.trigerz.dailyfacilitator.infrastructure.drink.entrypoints.rest;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Component;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class DrinkApi {
	@Id
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	private UUID uuid;
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	private Long id;
	private String name;
	private String brand;
}
