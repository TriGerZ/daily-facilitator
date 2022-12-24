package com.trigerz.dailyfacilitator.core.drink.entity;

import com.trigerz.dailyfacilitator.core.fixture.DrinkFixture;
import org.junit.Assert;
import org.junit.Test;
import static org.assertj.core.api.BDDAssertions.then;

public class DrinkTest {
    Drink drink = DrinkFixture.aDrinkTeaLipton();

    @Test
    public void testSetId() throws Exception {
        drink.setId(0L);
		Assert.assertEquals(0L,drink.getId());
    }

    @Test
    public void testSetName() throws Exception {
        drink.setName("name");
		Assert.assertEquals("name", drink.getName());
    }

}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme
