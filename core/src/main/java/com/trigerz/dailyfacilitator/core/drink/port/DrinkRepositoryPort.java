package com.trigerz.dailyfacilitator.core.drink.port;

import com.trigerz.dailyfacilitator.core.drink.entity.Drink;

import java.util.Collection;

public interface DrinkRepositoryPort {
	public Collection<Drink> GetAllDrinks();
	public void CreateDrink(Drink drink);
}
