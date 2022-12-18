package com.trigerz.dailyfacilitator.core.drink.usecase;

import com.trigerz.dailyfacilitator.core.drink.entity.Drink;
import com.trigerz.dailyfacilitator.core.drink.port.DrinkRepositoryPort;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CreateDrink {
    private final DrinkRepositoryPort drinkRepositoryPort;

    public Drink execute(Drink drink) {
        return this.drinkRepositoryPort.CreateDrink(drink);
    }
}