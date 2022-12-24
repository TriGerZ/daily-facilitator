package com.trigerz.dailyfacilitator.infrastructure.fixtures;

import com.trigerz.dailyfacilitator.infrastructure.drink.persistence.DrinkJpa;

import java.util.UUID;

public class DrinkJpaFixture {
    public static DrinkJpa aDrinkJpaTeaLipton(){
		UUID uuid= UUID.randomUUID();
        Long id=1L;
        String name="LiptonTea";
		String brand="Lipton";

        return new DrinkJpa(uuid,id,name,brand);
    }

    public static DrinkJpa aDrinkJpaTeaGrandmere(){
		UUID uuid=UUID.randomUUID();
        Long id=2L;
        String name="Bonne journée";
		String brand="Grand mère";

        return new DrinkJpa(uuid,id,name,brand);
    }
}
