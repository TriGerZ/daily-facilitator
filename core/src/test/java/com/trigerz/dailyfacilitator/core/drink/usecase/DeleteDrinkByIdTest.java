package com.trigerz.dailyfacilitator.core.drink.usecase;

import com.trigerz.dailyfacilitator.core.drink.port.DrinkRepositoryPort;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.UUID;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.*;

public class DeleteDrinkByIdTest {
    @Mock
    DrinkRepositoryPort drinkRepositoryPort;
    @InjectMocks
    DeleteDrinkById deleteDrinkById;

    @Before
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testExecute() throws Exception {
		//Given

    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme
