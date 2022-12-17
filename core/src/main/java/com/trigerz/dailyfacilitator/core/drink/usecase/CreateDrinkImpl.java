package com.trigerz.dailyfacilitator.core.drink.usecase;

import com.trigerz.dailyfacilitator.core.drink.entity.Drink;
import com.trigerz.dailyfacilitator.core.drink.port.DrinkRepositoryPort;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CreateDrinkImpl implements CreateDrink{
	private final DrinkRepositoryPort drinkRepositoryPort;
	@Override
	public void execute(Drink drink){
		this.drinkRepositoryPort.CreateDrink(drink);
	}
}
