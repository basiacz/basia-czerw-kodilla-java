package com.kodilla.good.patterns.challenges;

public class InformationService {
    public void inform(User user){
        System.out.println("Informing user " + user.getFirstName() + " " + user.getLastName());
    }
}