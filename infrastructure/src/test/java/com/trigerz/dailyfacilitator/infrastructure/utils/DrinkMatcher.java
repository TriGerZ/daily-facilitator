package com.trigerz.dailyfacilitator.infrastructure.utils;

import com.trigerz.dailyfacilitator.core.drink.entity.Drink;

import java.util.Objects;

public class DrinkMatcher  {
	public static boolean hasDrinkHaveSamePropertiesExceptId(Drink expectedDrink, Drink currentDrink){
		return Objects.equals(expectedDrink.getName(), currentDrink.getName())
				&& Objects.equals(expectedDrink.getBrand(), currentDrink.getBrand());
	}
}
