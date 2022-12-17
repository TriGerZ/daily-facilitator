package com.trigerz.dailyfacilitator.infrastructure.drink.persistence.jpa.mapper;

import com.trigerz.dailyfacilitator.infrastructure.drink.persistence.DrinkJpa;
import com.trigerz.dailyfacilitator.core.drink.entity.Drink;
import org.springframework.stereotype.Component;

@Component
public class DrinkJpaMapper {
	public Drink toDrink(DrinkJpa drinkJpa){
		return new Drink(drinkJpa.getId(), drinkJpa.getName());
	}

	public DrinkJpa toDrinkJpa(Drink drink){
		return new DrinkJpa(drink.getId(), drink.getName());
	}
}
