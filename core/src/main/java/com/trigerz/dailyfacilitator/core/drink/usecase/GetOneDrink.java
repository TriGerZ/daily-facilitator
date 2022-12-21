package com.trigerz.dailyfacilitator.core.drink.usecase;

import com.trigerz.dailyfacilitator.core.drink.entity.Drink;
import com.trigerz.dailyfacilitator.core.drink.port.DrinkRepositoryPort;

public class GetOneDrink {
	private final DrinkRepositoryPort drinkRepositoryPort;

	public GetOneDrink(DrinkRepositoryPort drinkRepositoryPort) {
		this.drinkRepositoryPort = drinkRepositoryPort;
	}

	public Drink execute(Long idToFind) {
		return drinkRepositoryPort.GetDrinkById(idToFind);
	}
}
