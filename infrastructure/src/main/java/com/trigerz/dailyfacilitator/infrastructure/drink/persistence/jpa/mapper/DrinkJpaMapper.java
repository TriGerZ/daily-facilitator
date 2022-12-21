package com.trigerz.dailyfacilitator.infrastructure.drink.persistence.jpa.mapper;

import com.trigerz.dailyfacilitator.infrastructure.drink.persistence.DrinkJpa;
import com.trigerz.dailyfacilitator.core.drink.entity.Drink;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class DrinkJpaMapper {
	public Drink toDrink(DrinkJpa drinkJpa){
		return new Drink(drinkJpa.getId(), drinkJpa.getName(), drinkJpa.getBrand());
	}

	public DrinkJpa toDrinkJpa(Drink drink){
		return new DrinkJpa(drink.getId(), drink.getName(),drink.getBrand());
	}
}
