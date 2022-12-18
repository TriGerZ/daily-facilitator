package com.trigerz.dailyfacilitator.infrastructure.fixtures;

import com.trigerz.dailyfacilitator.infrastructure.drink.persistence.DrinkJpa;

public class DrinkJpaFixture {
    public static DrinkJpa aDrinkJpaTeaLipton(){
        Long id=0L;
        String name="LiptonTea";

        return new DrinkJpa(id,name);
    }

    public static DrinkJpa aDrinkJpaTeaGrandmere(){
        Long id=1L;
        String name="Grand mère Tea";

        return new DrinkJpa(id,name);
    }
}
