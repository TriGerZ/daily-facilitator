package com.trigerz.dailyfacilitator.infrastructure.drink.persistence.jpa.adapter;

import com.trigerz.dailyfacilitator.core.drink.entity.Drink;
import com.trigerz.dailyfacilitator.core.drink.port.DrinkRepositoryPort;
import com.trigerz.dailyfacilitator.infrastructure.drink.persistence.DrinkJpaRepository;
import com.trigerz.dailyfacilitator.infrastructure.drink.persistence.jpa.mapper.DrinkJpaMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Collection;
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
}
