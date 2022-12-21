package com.trigerz.dailyfacilitator.infrastructure.drink.persistence.jpa.adapter;

import com.trigerz.dailyfacilitator.core.drink.entity.Drink;
import com.trigerz.dailyfacilitator.core.drink.port.DrinkRepositoryPort;
import com.trigerz.dailyfacilitator.infrastructure.drink.entrypoints.rest.DrinkApi;
import com.trigerz.dailyfacilitator.infrastructure.drink.persistence.DrinkJpa;
import com.trigerz.dailyfacilitator.infrastructure.drink.persistence.DrinkJpaRepository;
import com.trigerz.dailyfacilitator.infrastructure.drink.persistence.jpa.mapper.DrinkJpaMapper;
import com.trigerz.dailyfacilitator.infrastructure.fixtures.DrinkFixture;
import com.trigerz.dailyfacilitator.infrastructure.fixtures.DrinkJpaFixture;
import com.trigerz.dailyfacilitator.infrastructure.utils.DrinkMatcher;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestComponent;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Collection;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class DrinkRepositoryPortAdapterTest {
	@Autowired
	private DrinkRepositoryPortAdapter drinkRepositoryPortAdapter;

	@Autowired DrinkJpaRepository drinkJpaRepository;
	@Autowired
	private DrinkJpaMapper drinkJpaMapper;

    @Test
    public void testGetAllDrinksNoDrink() throws Exception {
		//Given
		drinkJpaRepository.deleteAll();
        List<Drink> expectedResult = List.of();
		//When
		Collection<Drink> results = drinkRepositoryPortAdapter.GetAllDrinks();
        //Then
		assertEquals(expectedResult.size(), results.size());
    }

	@Test
	public void testGetAllDrinksOneDrink() throws Exception {

		//Given
		drinkJpaRepository.deleteAll();
		List<Drink> expectedResult = List.of(DrinkFixture.aDrinkTeaLipton());
		expectedResult.forEach(drink -> drinkRepositoryPortAdapter.CreateDrink(drink));
		//When
		Collection<Drink> results = drinkRepositoryPortAdapter.GetAllDrinks();
		//Then
		assertEquals(expectedResult.size(), results.size());
	}

    @Test
    public void testCreateDrinkWithId() throws Exception {
		//Given
		Drink drinkTeaLipton = DrinkFixture.aDrinkTeaLipton();
		//When
		Drink result = drinkRepositoryPortAdapter.CreateDrink(drinkTeaLipton);
		//Then
        assertEquals(DrinkFixture.aDrinkTeaLipton(), result);
    }

	@Test
	public void testCreateDrinkWithoutId() throws Exception {
		//Given
		Drink drinkTeaLiptonWithoutId = DrinkFixture.aDrinkTeaLiptonWithoutId();
		//When
		Drink result = drinkRepositoryPortAdapter.CreateDrink(drinkTeaLiptonWithoutId);
		//Then
		assertEquals(DrinkFixture.aDrinkTeaLiptonWithoutId().getName(), result.getName());
		assertEquals(DrinkFixture.aDrinkTeaLiptonWithoutId().getBrand(), result.getBrand());
	}

	@Test
	public void testGetDrinkById() throws Exception {
		//Given
		Drink expectedResult = DrinkFixture.aDrinkTeaLipton();
		drinkRepositoryPortAdapter.CreateDrink(expectedResult);
		//When
		Drink result = drinkRepositoryPortAdapter.GetDrinkById(expectedResult.getId());
		//Then
		assertEquals(expectedResult,result);
	}
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme
