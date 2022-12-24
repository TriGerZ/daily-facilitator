package com.trigerz.dailyfacilitator.infrastructure.fixtures;

import com.trigerz.dailyfacilitator.core.drink.entity.Drink;

import java.util.UUID;

public class DrinkFixture {
    public static Drink aDrinkTeaLipton(){
        return new Drink(UUID.randomUUID(),1L, "LiptonTea", "Lipton");
    }

	public static Drink aDrinkTeaLiptonWithoutId(){
		Drink drink = new Drink();
		drink.setBrand("Lipton");
		drink.setName("Nuit des vosges");
		return drink;
	}

    public static Drink aDrinkTeaGrandmere(){
        return new Drink(UUID.randomUUID(),2L, "Grand mère Tea", "Grand mère");
    }
}
