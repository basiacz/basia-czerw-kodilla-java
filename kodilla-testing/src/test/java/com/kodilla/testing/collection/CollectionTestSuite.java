package com.kodilla.testing.collection;

import org.junit.*;
import com.kodilla.testing.collection.OddNumbersExterminator;
import java.util.ArrayList;
import java.util.List;

public class CollectionTestSuite {
    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }

    @After
    public void after() {
        System.out.println("Test Case: end");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }

    @Test
    public void testCaseOddNumbersExterminatorEmpty() {
        //Given - przygotowanie danych testowych
        OddNumbersExterminator ext = new OddNumbersExterminator();
        List<Integer> inputList = new ArrayList<>();

        //When - testowana metoda
        List<Integer> outputList = ext.exterminate(inputList);

        //Then - sprawdzenie wyników
        Assert.assertEquals(0, outputList.size());
    }
    @Test
    public void testCaseOddNumbersExterminatorEven() {
        //Given - przygotowanie danych testowych
        OddNumbersExterminator ext = new OddNumbersExterminator();
        List<Integer> inputList = new ArrayList<>();
        inputList.add(2);
        inputList.add(1);
        inputList.add(10);
        inputList.add(20);
        inputList.add(60);
        inputList.add(55);
        inputList.add(50);
        inputList.add(45);

        //When - testowana metoda
        List<Integer> outputList = ext.exterminate(inputList);

        //Then - sprawdzenie wyników
        Assert.assertEquals(5, outputList.size());
    }
}
