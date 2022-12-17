package com.trigerz.dailyfacilitator.core.drink.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;


@AllArgsConstructor
@Data
public class Drink implements Serializable {

	private long id;
	private String name;
}
