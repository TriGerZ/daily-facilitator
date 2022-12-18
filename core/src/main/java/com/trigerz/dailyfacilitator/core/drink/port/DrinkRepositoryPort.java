package com.trigerz.dailyfacilitator.core.drink.port;

import com.trigerz.dailyfacilitator.core.drink.entity.Drink;

import java.util.Collection;

public interface DrinkRepositoryPort {
    Collection<Drink> GetAllDrinks();

    Drink CreateDrink(Drink drink);
}
