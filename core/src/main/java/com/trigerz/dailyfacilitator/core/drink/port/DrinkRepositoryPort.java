package com.trigerz.dailyfacilitator.core.drink.port;

import com.trigerz.dailyfacilitator.core.drink.entity.Drink;

import java.util.Collection;
import java.util.UUID;

public interface DrinkRepositoryPort {
    Collection<Drink> GetAllDrinks();

    Drink CreateDrink(Drink drink);

	Drink GetDrinkById(UUID uuid);

	void DeleteDrinkById(UUID uuid);
}
