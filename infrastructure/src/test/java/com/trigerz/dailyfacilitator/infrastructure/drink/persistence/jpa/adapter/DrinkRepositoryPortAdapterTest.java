package com.trigerz.dailyfacilitator.infrastructure.drink.persistence.jpa.adapter;

import com.trigerz.dailyfacilitator.core.drink.entity.Drink;
import com.trigerz.dailyfacilitator.infrastructure.drink.persistence.DrinkJpa;
import com.trigerz.dailyfacilitator.infrastructure.drink.persistence.DrinkJpaRepository;
import com.trigerz.dailyfacilitator.infrastructure.drink.persistence.jpa.mapper.DrinkJpaMapper;
import com.trigerz.dailyfacilitator.infrastructure.fixtures.DrinkFixture;
import com.trigerz.dailyfacilitator.infrastructure.fixtures.DrinkJpaFixture;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Collection;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class DrinkRepositoryPortAdapterTest {
    @Mock
    DrinkJpaRepository drinkJpaRepository;
    @Mock
    DrinkJpaMapper drinkMapper;
    @InjectMocks
    DrinkRepositoryPortAdapter drinkRepositoryPortAdapter;

    @Before
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testGetAllDrinks() throws Exception {
        //Given
        List<DrinkJpa> drinksJpa = List.of(DrinkJpaFixture.aDrinkJpaTeaLipton(),DrinkJpaFixture.aDrinkJpaTeaLipton());
        List<Drink> expectedResult = List.of(DrinkFixture.aDrinkTeaGrandmere(), DrinkFixture.aDrinkTeaGrandmere());


        //When
        when(drinkJpaRepository.findAll()).thenReturn(drinksJpa);
        //when(drinkMapper.toDrink(new DrinkJpa(1L, "Grand mère Tea"))).thenReturn(DrinkFixture.aDrinkTeaLipton());
        //when(drinkMapper.toDrink(DrinkJpaFixture.aDrinkJpaTeaLipton())).thenReturn(DrinkFixture.aDrinkTeaLipton());
        //when(drinkMapper.toDrink(DrinkJpaFixture.aDrinkJpaTeaGrandmere())).thenReturn(DrinkFixture.aDrinkTeaGrandmere());
        when(drinkMapper.toDrink(any(DrinkJpa.class))).thenReturn(DrinkFixture.aDrinkTeaGrandmere());

        //Then
        Collection<Drink> results = drinkRepositoryPortAdapter.GetAllDrinks();
        //Drink aDrink = drinkMapper.toDrink(DrinkJpaFixture.aDrinkJpaTeaLipton());
        //Drink aDrink2= drinkMapper.toDrink(DrinkJpaFixture.aDrinkJpaTeaGrandmere());
        assertEquals(expectedResult, results);
    }

    @Test
    public void testCreateDrink() throws Exception {
        when(drinkMapper.toDrink(any())).thenReturn(new Drink(0L, "name"));
        when(drinkMapper.toDrinkJpa(any())).thenReturn(new DrinkJpa(Long.valueOf(1), "name"));

        Drink result = drinkRepositoryPortAdapter.CreateDrink(new Drink(0L, "name"));
        assertEquals(new Drink(0L, "name"), result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme