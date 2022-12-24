package com.trigerz.dailyfacilitator.infrastructure.drink.entrypoints.rest;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.stereotype.Component;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@Component
class DrinkApiModelAssembler implements RepresentationModelAssembler<DrinkApi, EntityModel<DrinkApi>> {

	@Override
	public EntityModel<DrinkApi> toModel(DrinkApi entity) {
		return EntityModel.of(entity, //
				linkTo(methodOn(DrinkEndpoint.class).getOneDrink(entity.getUuid())).withSelfRel(),
				linkTo(methodOn(DrinkEndpoint.class).getAllDrinks()).withRel("drinks"));
	}
}

