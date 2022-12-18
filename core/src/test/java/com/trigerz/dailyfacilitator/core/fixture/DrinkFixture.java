package com.trigerz.dailyfacilitator.core.fixture;

import com.trigerz.dailyfacilitator.core.drink.entity.Drink;

public class DrinkFixture {
    public static Drink aDrinkTeaLipton(){
        return new Drink(0L, "Lipton");
    }

    public static Drink aDrinkTeaGrandmere(){
        return new Drink(0L, "Grand mère");
    }
}
