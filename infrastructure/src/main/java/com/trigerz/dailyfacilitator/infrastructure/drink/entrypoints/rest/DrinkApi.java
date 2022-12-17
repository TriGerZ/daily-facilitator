package com.trigerz.dailyfacilitator.infrastructure.drink.entrypoints.rest;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Getter
public class DrinkApi {
	private Long id;
	private String name;
}
