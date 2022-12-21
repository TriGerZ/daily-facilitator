package com.trigerz.dailyfacilitator.core.drink.entity;

import com.trigerz.dailyfacilitator.core.fixture.DrinkFixture;
import org.junit.Assert;
import org.junit.Test;

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

    @Test
    public void testToString() throws Exception {
        String result = drink.toString();
        Assert.assertEquals(DrinkFixture.aDrinkTeaLipton().toString(), result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme
