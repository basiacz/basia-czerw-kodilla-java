package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;
import java.math.BigDecimal;

public class WorldTestSuite {

    @Test
    public void TestGetPeopleQuantity() {
        //Given
        Country unitedKingdom = new Country("United Kingdom", new BigDecimal("60609153"));
        Country italy = new Country("Italy", new BigDecimal("60507590"));
        Country ukraine = new Country("Ukraine", new BigDecimal("42434767"));

        Continent europe = new Continent("Europe");

        europe.addCountry(unitedKingdom);
        europe.addCountry(italy);
        europe.addCountry(ukraine);

        Country nigeria = new Country("Nigeria", new BigDecimal("131859731"));
        Country ethiopia = new Country("Ethiopia", new BigDecimal("74777981"));
        Country egypt = new Country("Egypt", new BigDecimal("78887007"));

        Continent africa = new Continent("Africa");

        africa.addCountry(nigeria);
        africa.addCountry(ethiopia);
        africa.addCountry(egypt);

        World world = new World();

        world.addContinet(europe);
        world.addContinet(africa);

        //When
        BigDecimal result = world.getPeopleQuantity();

        //Than
        System.out.println(result);
        Assert.assertEquals(new BigDecimal("449076229"), result);
    }
}