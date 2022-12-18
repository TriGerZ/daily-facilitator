package com.trigerz.dailyfacilitator.core.drink.usecase;

import com.trigerz.dailyfacilitator.core.drink.entity.Drink;
import com.trigerz.dailyfacilitator.core.drink.port.DrinkRepositoryPort;
import com.trigerz.dailyfacilitator.core.fixture.DrinkFixture;
import org.assertj.core.util.Lists;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Collection;
import java.util.List;

import static org.mockito.Mockito.*;

public class GetAllDrinksTest {
    @Mock
    DrinkRepositoryPort drinkRepositoryPort;
    @InjectMocks
    GetAllDrinks getAllDrinks;

    @Before
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testExecute_shouldReturnDrinkTeaLiptonFromRepository() throws Exception {
        //Given
        List<Drink> drinks = Lists.newArrayList(DrinkFixture.aDrinkTeaLipton());

        //When
        when(drinkRepositoryPort.GetAllDrinks()).thenReturn(drinks);

        //Then
        Collection<Drink> result = getAllDrinks.execute();
        Assert.assertEquals(drinks, result);
    }

    @Test
    public void testExecute_shouldReturnMultipleDrinksFromRepository() throws Exception {
        //Given
        List<Drink> drinks = Lists.newArrayList(DrinkFixture.aDrinkTeaLipton(),DrinkFixture.aDrinkTeaGrandmere());

        //When
        when(drinkRepositoryPort.GetAllDrinks()).thenReturn(drinks);

        //Then
        Collection<Drink> result = getAllDrinks.execute();
        Assert.assertEquals(drinks, result);
    }

}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme