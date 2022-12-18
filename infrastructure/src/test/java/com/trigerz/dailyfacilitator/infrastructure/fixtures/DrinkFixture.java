package com.trigerz.dailyfacilitator.infrastructure.fixtures;

import com.trigerz.dailyfacilitator.core.drink.entity.Drink;

public class DrinkFixture {
    public static Drink aDrinkTeaLipton(){
        return new Drink(0L, "LiptonTea");
    }

    public static Drink aDrinkTeaGrandmere(){
        return new Drink(1L, "Grand mère Tea");
    }
}
