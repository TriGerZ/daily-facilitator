package com.trigerz.dailyfacilitator.infrastructure.exception;

import jakarta.persistence.EntityNotFoundException;

import java.util.UUID;

public class DataNotFoundException extends EntityNotFoundException {
	public <ID> DataNotFoundException(ID id) {
		super("Could not find: "+id);
	}
}
