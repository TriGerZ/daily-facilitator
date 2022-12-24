package com.trigerz.dailyfacilitator.infrastructure.drink.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;
import java.util.UUID;

public interface DrinkJpaRepository extends JpaRepository<DrinkJpa, UUID> {
	public Collection<DrinkJpa> findDrinkJpaByBrand(String brand);
	public Collection<DrinkJpa> findDrinkJpaByName(String name);

}
