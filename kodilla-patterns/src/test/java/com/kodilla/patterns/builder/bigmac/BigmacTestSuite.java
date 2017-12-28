package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBuilder() {
        //When
        Bigmac bm = new Bigmac.BigmacBuilder()
                .roll("sesame")
                .burgers(2)
                .sauce("barbecue")
                .ingredient("onion")
                .ingredient("bacon")
                .ingredient("salad")
                .build();

        //Then
        Assert.assertEquals("sesame", bm.getRoll());
        Assert.assertEquals(2,bm.getBurgers());
        Assert.assertEquals("barbecue", bm.getSauce());
        Assert.assertEquals(3, bm.getIngredients().size());
    }
}