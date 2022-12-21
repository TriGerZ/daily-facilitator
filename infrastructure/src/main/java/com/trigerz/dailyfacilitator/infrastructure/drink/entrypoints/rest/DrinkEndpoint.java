package com.trigerz.dailyfacilitator.infrastructure.drink.entrypoints.rest;

import com.trigerz.dailyfacilitator.core.drink.usecase.CreateDrink;
import com.trigerz.dailyfacilitator.core.drink.usecase.GetAllDrinks;
import com.trigerz.dailyfacilitator.core.drink.usecase.GetOneDrink;
import lombok.AllArgsConstructor;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/drinks")
@AllArgsConstructor
public class DrinkEndpoint {

	private final CreateDrink createDrink;
	private final GetOneDrink getOneDrink;
	private final GetAllDrinks getAllDrinks;


	@GetMapping
	public Collection<DrinkApi> getAllDrinks(){
		LoggerFactory.getLogger(DrinkEndpoint.class);
		return this.getAllDrinks.execute().stream().map(DrinkApiMapper::toDrinkApi).collect(Collectors.toList());
	}

	@GetMapping("/{id}")
	public DrinkApi getOneDrink(@PathVariable Long id) {
		return DrinkApiMapper.toDrinkApi(this.getOneDrink.execute(id));
	}
	@PostMapping
	public DrinkApi createDrink(@RequestBody DrinkApi drinkApi){
		return DrinkApiMapper.toDrinkApi(this.createDrink.execute(DrinkApiMapper.toDrinkWithoutId(drinkApi)));
	}
}
