package com.trigerz.dailyfacilitator.infrastructure.configuration;

import com.trigerz.dailyfacilitator.core.drink.usecase.CreateDrink;
import com.trigerz.dailyfacilitator.core.drink.usecase.DeleteDrinkById;
import com.trigerz.dailyfacilitator.core.drink.usecase.GetAllDrinks;
import com.trigerz.dailyfacilitator.core.drink.usecase.GetOneDrink;
import com.trigerz.dailyfacilitator.infrastructure.drink.persistence.jpa.adapter.DrinkRepositoryPortAdapter;
import com.trigerz.dailyfacilitator.infrastructure.weather.adapter.OpenWeather;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;

@org.springframework.context.annotation.Configuration
public class Configuration {
	@Autowired
	private DrinkRepositoryPortAdapter drinkRepositoryPortAdapter;

	@Autowired
	private OpenWeather openWeather;

	@Bean
	public CreateDrink createCreateDrink() {
		return new CreateDrink(drinkRepositoryPortAdapter);
	}

	@Bean
	public GetAllDrinks createGetAllDrinks() {
		return new GetAllDrinks(drinkRepositoryPortAdapter);
	}

	@Bean
	public DeleteDrinkById createDeleteDrinkById() {
		return new DeleteDrinkById(drinkRepositoryPortAdapter);
	}

	@Bean
	public GetOneDrink createGetOneDrink(){return new GetOneDrink(drinkRepositoryPortAdapter);}

}
