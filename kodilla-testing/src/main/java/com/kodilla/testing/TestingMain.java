package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
        System.out.println("Test - pierwszy test jednostkowy:");

        Calculator calculator = new Calculator();
        if(calculator.addAToB(50, 10) == 60) {
            System.out.println("OK");
        } else {
            System.out.println("Error!");
        }
        if(calculator.substractAFromB(50, 10) == 40) {
            System.out.println("OK");
        } else {
            System.out.println("Error!");
        }
    }
}
