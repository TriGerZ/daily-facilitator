package com.trigerz.dailyfacilitator.infrastructure.drink.persistence.jpa.adapter;

import com.trigerz.dailyfacilitator.core.drink.entity.Drink;
import com.trigerz.dailyfacilitator.core.drink.port.DrinkRepositoryPort;
import com.trigerz.dailyfacilitator.infrastructure.drink.persistence.DrinkJpa;
import com.trigerz.dailyfacilitator.infrastructure.drink.persistence.DrinkJpaRepository;
import com.trigerz.dailyfacilitator.infrastructure.drink.persistence.jpa.mapper.DrinkJpaMapper;
import com.trigerz.dailyfacilitator.infrastructure.exception.DataNotFoundException;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@AllArgsConstructor
@Repository
public class DrinkRepositoryPortAdapter implements DrinkRepositoryPort {
    private DrinkJpaRepository drinkJpaRepository;

    @Override
    public Collection<Drink> GetAllDrinks() {
        return drinkJpaRepository.findAll().stream().map(DrinkJpaMapper::toDrink).collect(Collectors.toList());
    }

    @Override
    public Drink CreateDrink(Drink drink) {
		DrinkJpa drinkJpa = DrinkJpaMapper.toDrinkJpa(drink);
        return DrinkJpaMapper.toDrink(drinkJpaRepository.save(drinkJpa));
    }

	@Override
	public Drink GetDrinkById(UUID uuid) throws DataNotFoundException {
		Optional<DrinkJpa> drinkJpaTest = drinkJpaRepository.findById(uuid);
		return DrinkJpaMapper.toDrink(this.GetDrinkIfExistById(drinkJpaTest, uuid));
	}

	@Override
	public void DeleteDrinkById(UUID uuid) throws DataNotFoundException {
		Optional<DrinkJpa> drinkJpaTest = drinkJpaRepository.findById(uuid);
		drinkJpaRepository.delete(this.GetDrinkIfExistById(drinkJpaTest, uuid));
	}

	private <ID> DrinkJpa GetDrinkIfExistById(Optional<DrinkJpa> optionalDrinkJpaToCheck, ID uuid){
		if (optionalDrinkJpaToCheck.isEmpty()){
			throw new DataNotFoundException(uuid);
		}
		return optionalDrinkJpaToCheck.get();
	}
}
