package com.trigerz.dailyfacilitator.infrastructure.drink.persistence;

import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "account_settings")
public class DrinkJpa {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "id", nullable = false)
	private Long id;
	private String name;
	private String brand;
}
