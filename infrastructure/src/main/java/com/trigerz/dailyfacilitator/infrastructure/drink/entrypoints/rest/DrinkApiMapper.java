package com.trigerz.dailyfacilitator.infrastructure.drink.entrypoints.rest;

import com.trigerz.dailyfacilitator.core.drink.entity.Drink;
import org.springframework.stereotype.Component;

@Component
public class DrinkApiMapper {
	public Drink toDrink(DrinkApi drinkApi){
		return new Drink(drinkApi.getId(),drinkApi.getName());
	}
	public DrinkApi toDrinkApi(Drink drink){
		return new DrinkApi(drink.getId(),drink.getName());

	}
}
