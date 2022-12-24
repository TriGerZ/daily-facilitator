package com.trigerz.dailyfacilitator.core.drink.usecase;

import com.trigerz.dailyfacilitator.core.drink.entity.Drink;
import com.trigerz.dailyfacilitator.core.drink.port.DrinkRepositoryPort;
import lombok.AllArgsConstructor;

import java.util.UUID;

@AllArgsConstructor
public class CreateDrink {
    private final DrinkRepositoryPort drinkRepositoryPort;

    public Drink execute(String name, String brand) {
        Drink newDrink = new Drink();
		newDrink.setUuid(UUID.randomUUID());
		newDrink.setName(name);
		newDrink.setBrand(brand);

		return this.drinkRepositoryPort.CreateDrink(newDrink);
    }
}
