package com.trigerz.dailyfacilitator.core.drink.usecase;

import com.trigerz.dailyfacilitator.core.drink.entity.Drink;
import com.trigerz.dailyfacilitator.core.drink.port.DrinkRepositoryPort;

import java.util.Collection;

public class GetAllDrinks {
    private final DrinkRepositoryPort drinkRepositoryPort;

    public GetAllDrinks(DrinkRepositoryPort drinkRepositoryPort) {
        this.drinkRepositoryPort = drinkRepositoryPort;
    }

    public Collection<Drink> execute() {
        return drinkRepositoryPort.GetAllDrinks();
    }
}
