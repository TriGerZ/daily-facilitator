package com.trigerz.dailyfacilitator.infrastructure.drink.entrypoints.rest;

import com.trigerz.dailyfacilitator.core.drink.usecase.CreateDrink;
import com.trigerz.dailyfacilitator.core.drink.usecase.GetAllDrinks;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/drinks")
@AllArgsConstructor
public class DrinkEndpoint {

	private final CreateDrink createDrink;
	private final GetAllDrinks getAllDrinks;
	private final DrinkApiMapper drinkApiMapper;

	@GetMapping
	public Collection<DrinkApi> getAllDrinks(){
		return this.getAllDrinks.execute().stream().map(this.drinkApiMapper::toDrinkApi).collect(Collectors.toList());
	}

	@PostMapping
	public void createDrink(DrinkApi drinkApi){
		this.createDrink.execute(drinkApiMapper.toDrink(drinkApi));
	}
}
