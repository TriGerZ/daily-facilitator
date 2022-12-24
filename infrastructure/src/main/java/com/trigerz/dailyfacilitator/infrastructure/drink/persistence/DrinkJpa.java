package com.trigerz.dailyfacilitator.infrastructure.drink.persistence;

import jakarta.annotation.Generated;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.GenerationTime;

import java.util.UUID;


@Setter
@Getter
@Entity
@NoArgsConstructor
@Table(name = "DRINK")
public class DrinkJpa {

	public DrinkJpa(UUID uuid, Long id, String name, String brand) {
		this.uuid = uuid;
		this.id = id;
		this.name = name;
		this.brand = brand;
	}

	@Id
	private UUID uuid;
	@Generated(value = "GenerationTime.INSERT")
	@Column(insertable = false, updatable = false)
	private Long id;
	private String name;
	private String brand;
}
