package com.trigerz.dailyfacilitator.core.drink.usecase;

import com.trigerz.dailyfacilitator.core.drink.entity.Drink;
import com.trigerz.dailyfacilitator.core.drink.port.DrinkRepositoryPort;
import com.trigerz.dailyfacilitator.core.fixture.DrinkFixture;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

public class CreateDrinkTest {
    @Mock
    DrinkRepositoryPort drinkRepositoryPort;
    @InjectMocks
    CreateDrink createDrink;

    @Before
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testExecuteWithId() throws Exception {
        //Given
        Drink drink = DrinkFixture.aDrinkTeaGrandmere();
		when(drinkRepositoryPort.CreateDrink(any(Drink.class))).thenReturn(drink);
        //When
		Drink createdDrink= createDrink.execute(drink);
        //Then
        assertEquals(drink, createdDrink);
    }

	@Test
	public void testExecuteWithoutId() throws Exception {
		//Given
		Drink drink = DrinkFixture.aDrinkTeaLiptonWithoutId();
		when(drinkRepositoryPort.CreateDrink(any(Drink.class))).thenReturn(drink);
		//When
		Drink createdDrink= createDrink.execute(drink);
		//Then
		assertEquals(drink, createdDrink);
	}
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme
