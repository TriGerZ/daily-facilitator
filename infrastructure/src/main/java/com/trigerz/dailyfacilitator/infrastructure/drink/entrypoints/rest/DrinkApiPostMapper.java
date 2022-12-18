package com.trigerz.dailyfacilitator.infrastructure.drink.entrypoints.rest;

import com.trigerz.dailyfacilitator.core.drink.entity.Drink;
import org.springframework.stereotype.Component;

@Component
public class DrinkApiPostMapper {
	public Drink toDrink(DrinkApiPost drinkApiPost){
		Drink drink = new Drink();
		drink.setName(drinkApiPost.getName());
		return drink;
	}
}
