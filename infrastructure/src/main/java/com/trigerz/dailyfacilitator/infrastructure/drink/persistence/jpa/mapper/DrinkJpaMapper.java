package com.trigerz.dailyfacilitator.infrastructure.drink.persistence.jpa.mapper;

import com.trigerz.dailyfacilitator.infrastructure.drink.persistence.DrinkJpa;
import com.trigerz.dailyfacilitator.core.drink.entity.Drink;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public final class DrinkJpaMapper {
	public static Drink toDrink(DrinkJpa drinkJpa){
		return new Drink(drinkJpa.getUuid(),drinkJpa.getId(), drinkJpa.getName(), drinkJpa.getBrand());
	}

	public static DrinkJpa toDrinkJpa(Drink drink){
		return new DrinkJpa(drink.getUuid(),drink.getId(), drink.getName(),drink.getBrand());
	}
}
