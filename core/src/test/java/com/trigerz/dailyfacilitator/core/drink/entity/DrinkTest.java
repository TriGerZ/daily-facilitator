package com.trigerz.dailyfacilitator.core.drink.entity;

import org.junit.Assert;
import org.junit.Test;

public class DrinkTest {
    Drink drink = new Drink(0L, "name");

    @Test
    public void testSetId() throws Exception {
        drink.setId(0L);
    }

    @Test
    public void testSetName() throws Exception {
        drink.setName("name");
    }

    @Test
    public void testToString() throws Exception {
        String result = drink.toString();
        Assert.assertEquals("Drink(id=0, name=name)", result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme