package com.trigerz.dailyfacilitator.infrastructure.drink.entrypoints.rest;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class DrinkApi {

	@Id
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	private Long id;
	private String name;
}
