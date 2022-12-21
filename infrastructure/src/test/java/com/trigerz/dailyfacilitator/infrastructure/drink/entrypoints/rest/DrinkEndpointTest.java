package com.trigerz.dailyfacilitator.infrastructure.drink.entrypoints.rest;

import com.trigerz.dailyfacilitator.core.drink.entity.Drink;
import com.trigerz.dailyfacilitator.core.drink.usecase.CreateDrink;
import com.trigerz.dailyfacilitator.core.drink.usecase.GetAllDrinks;
import com.trigerz.dailyfacilitator.core.drink.usecase.GetOneDrink;
import com.trigerz.dailyfacilitator.infrastructure.fixtures.DrinkFixture;
import com.trigerz.dailyfacilitator.infrastructure.utils.DrinkMatcher;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Collection;
import java.util.List;

import static org.mockito.Mockito.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DrinkEndpointTest {

	@Autowired
    CreateDrink createDrink;
	@Autowired
    GetOneDrink getOneDrink;
	@Autowired
    GetAllDrinks getAllDrinks;
	@Autowired
	DrinkEndpoint drinkEndpoint;
    @Test
    public void testGetAllDrinks() throws Exception {

    }

    @Test
    public void testGetOneDrink() throws Exception {

    }

    @Test
    public void testCreateDrinkWithId() throws Exception {
		//Given
		DrinkApi drinkApi = DrinkApiMapper.toDrinkApi(DrinkFixture.aDrinkTeaGrandmere());
		//When
		DrinkApi result=drinkEndpoint.createDrink(drinkApi);
		//Then
		Assert.assertTrue(DrinkMatcher.hasDrinkHaveSamePropertiesExceptId(
				DrinkApiMapper.toDrink(drinkApi),
				DrinkApiMapper.toDrink(result)));
    }

	@Test
	public void testCreateDrinkWithoutId() throws Exception {
		//Given
		DrinkApi drinkApi = DrinkApiMapper.toDrinkApi(DrinkFixture.aDrinkTeaLiptonWithoutId());
		//When
		DrinkApi result=drinkEndpoint.createDrink(drinkApi);
		//Then
		Assert.assertTrue(DrinkMatcher.hasDrinkHaveSamePropertiesExceptId(
				DrinkApiMapper.toDrink(drinkApi),
				DrinkApiMapper.toDrink(result)));
	}
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme
