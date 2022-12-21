package com.trigerz.dailyfacilitator.core.fixture;

import com.trigerz.dailyfacilitator.core.drink.entity.Drink;

public class DrinkFixture {
    public static Drink aDrinkTeaLipton(){
        return new Drink(0L, "Thé vert", "Lipton");
    }

    public static Drink aDrinkTeaGrandmere(){
        return new Drink(0L, "bonne nuit","Grand mère");
    }

	public static Drink aDrinkTeaLiptonWithoutId(){
		Drink drink = new Drink();
		drink.setBrand("Lipton");
		drink.setName("Nuit des vosges");
		return drink;
	}
}
