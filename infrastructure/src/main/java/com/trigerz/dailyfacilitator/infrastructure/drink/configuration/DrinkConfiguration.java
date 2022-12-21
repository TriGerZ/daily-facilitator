package com.trigerz.dailyfacilitator.infrastructure.drink.configuration;

import com.trigerz.dailyfacilitator.core.drink.usecase.CreateDrink;
import com.trigerz.dailyfacilitator.core.drink.usecase.GetAllDrinks;
import com.trigerz.dailyfacilitator.core.drink.usecase.GetOneDrink;
import com.trigerz.dailyfacilitator.infrastructure.drink.persistence.jpa.adapter.DrinkRepositoryPortAdapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DrinkConfiguration {
	@Autowired
	private DrinkRepositoryPortAdapter drinkRepositoryPortAdapter;

	@Bean
	public CreateDrink createCreateDrink() {
		return new CreateDrink(drinkRepositoryPortAdapter);
	}

	@Bean
	public GetAllDrinks createGetAllDrinks() {
		return new GetAllDrinks(drinkRepositoryPortAdapter);
	}

	@Bean
	public GetOneDrink createGetOneDrink(){return new GetOneDrink(drinkRepositoryPortAdapter);}

}
