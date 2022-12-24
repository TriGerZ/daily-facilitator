package com.trigerz.dailyfacilitator.infrastructure.drink.entrypoints.rest;

import com.trigerz.dailyfacilitator.core.drink.usecase.CreateDrink;
import com.trigerz.dailyfacilitator.core.drink.usecase.DeleteDrinkById;
import com.trigerz.dailyfacilitator.core.drink.usecase.GetAllDrinks;
import com.trigerz.dailyfacilitator.core.drink.usecase.GetOneDrink;
import lombok.AllArgsConstructor;
import org.slf4j.LoggerFactory;
import org.springframework.hateoas.EntityModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.UUID;
import java.util.stream.Collectors;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
@RequestMapping("/api/drinks")
@AllArgsConstructor
public class DrinkEndpoint {

	private final CreateDrink createDrink;
	private final GetOneDrink getOneDrink;
	private final GetAllDrinks getAllDrinks;

	private final DeleteDrinkById deleteDrinkById;
	private final DrinkApiModelAssembler drinkApiModelAssembler;


	@GetMapping
	public Collection<EntityModel<DrinkApi>> getAllDrinks() {
		LoggerFactory.getLogger(DrinkEndpoint.class);
		return this.getAllDrinks.execute().stream().map(drink -> drinkApiModelAssembler.toModel(DrinkApiMapper.toDrinkApi(drink))).collect(Collectors.toList());
	}

	@GetMapping("/{uuid}")
	public EntityModel<DrinkApi> getOneDrink(@PathVariable UUID uuid) {
		return drinkApiModelAssembler.toModel(DrinkApiMapper.toDrinkApi(this.getOneDrink.execute(uuid)));
	}

	@PostMapping
	public ResponseEntity<EntityModel<DrinkApi>> createDrink(@RequestBody DrinkApi drinkApi) {

		DrinkApi createdDrinkApi = DrinkApiMapper.toDrinkApi(this.createDrink.execute(drinkApi.getName(), drinkApi.getBrand()));
		return ResponseEntity.created(linkTo(methodOn(DrinkEndpoint.class).
				getOneDrink(createdDrinkApi.getUuid())).toUri()).
				body(drinkApiModelAssembler.toModel(createdDrinkApi));
	}

	@DeleteMapping("/{uuid}")
	public ResponseEntity<?> deleteDrink(@PathVariable UUID uuid){
		this.deleteDrinkById.execute(uuid);
		return ResponseEntity.noContent().build();
	}
}
