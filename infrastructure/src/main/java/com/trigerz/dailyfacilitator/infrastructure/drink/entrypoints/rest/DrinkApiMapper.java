package com.trigerz.dailyfacilitator.infrastructure.drink.entrypoints.rest;

import com.trigerz.dailyfacilitator.core.drink.entity.Drink;
import org.springframework.stereotype.Component;

@Component
public final class DrinkApiMapper {
	public static Drink toDrink(DrinkApi drinkApi){
		return new Drink(drinkApi.getUuid(),drinkApi.getId(),drinkApi.getName(), drinkApi.getBrand());
	}

	public static Drink toDrinkWithoutId(DrinkApi drinkApi){
		Drink drink = new Drink();
		drink.setName(drinkApi.getName());
		drink.setBrand(drinkApi.getBrand());
		return drink;
	}
	public static DrinkApi toDrinkApi(Drink drink){
		return new DrinkApi(drink.getUuid(),drink.getId(),drink.getName(), drink.getBrand());
	}
}
