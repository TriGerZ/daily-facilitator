package com.trigerz.dailyfacilitator.infrastructure.drink.persistence.jpa.adapter;

import com.trigerz.dailyfacilitator.core.drink.entity.Drink;
import com.trigerz.dailyfacilitator.core.drink.port.DrinkRepositoryPort;
import com.trigerz.dailyfacilitator.infrastructure.drink.persistence.DrinkJpa;
import com.trigerz.dailyfacilitator.infrastructure.drink.persistence.DrinkJpaRepository;
import com.trigerz.dailyfacilitator.infrastructure.drink.persistence.jpa.mapper.DrinkJpaMapper;
import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.apache.commons.lang3.exception.ExceptionContext;
import org.hibernate.annotations.NotFound;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Optional;
import java.util.stream.Collectors;

@AllArgsConstructor
@Repository
public class DrinkRepositoryPortAdapter implements DrinkRepositoryPort {
    private DrinkJpaRepository drinkJpaRepository;
    private DrinkJpaMapper drinkMapper;

    @Override
    public Collection<Drink> GetAllDrinks() {
        return drinkJpaRepository.findAll().stream().map(drinkJpa -> drinkMapper.toDrink(drinkJpa)).collect(Collectors.toList());
    }

    @Override
    public Drink CreateDrink(Drink drink) {
        return drinkMapper.toDrink(drinkJpaRepository.save(drinkMapper.toDrinkJpa(drink)));
    }

	@Override
	public Drink GetDrinkById(Long id) {
		Optional<DrinkJpa> drinkJpaTest = drinkJpaRepository.findById(id);
		if (drinkJpaTest.isEmpty()){
			throw new EntityNotFoundException();
		}
		return drinkMapper.toDrink(drinkJpaTest.get());
	}

	@Override
	public Drink DeleteDrinkById(Long id) {
		return null;
	}
}
