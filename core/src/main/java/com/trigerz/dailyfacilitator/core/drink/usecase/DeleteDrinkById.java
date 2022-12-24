package com.trigerz.dailyfacilitator.core.drink.usecase;

import com.trigerz.dailyfacilitator.core.drink.port.DrinkRepositoryPort;

import java.util.UUID;

public class DeleteDrinkById {
	private final DrinkRepositoryPort drinkRepositoryPort;

	public DeleteDrinkById(DrinkRepositoryPort drinkRepositoryPort) {
		this.drinkRepositoryPort = drinkRepositoryPort;
	}

	public void execute(UUID uuid){
		drinkRepositoryPort.DeleteDrinkById(uuid);
	}
}
