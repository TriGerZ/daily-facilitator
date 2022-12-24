package com.trigerz.dailyfacilitator.core.drink.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.UUID;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class Drink {
	private UUID uuid;
    private long id;
    private String name;

	private String brand;
}
