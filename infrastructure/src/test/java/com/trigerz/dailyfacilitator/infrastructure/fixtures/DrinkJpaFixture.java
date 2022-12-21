package com.trigerz.dailyfacilitator.infrastructure.fixtures;

import com.trigerz.dailyfacilitator.infrastructure.drink.persistence.DrinkJpa;

public class DrinkJpaFixture {
    public static DrinkJpa aDrinkJpaTeaLipton(){
        Long id=1L;
        String name="LiptonTea";
		String brand="Lipton";

        return new DrinkJpa(id,name,brand);
    }

    public static DrinkJpa aDrinkJpaTeaGrandmere(){
        Long id=2L;
        String name="Bonne journée";
		String brand="Grand mère";

        return new DrinkJpa(id,name,brand);
    }
}
