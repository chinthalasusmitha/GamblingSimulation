package com.gamblingmethod;

import java.util.Random;

public class GamblerMainMethod {
    public static void main(String[] args) {
        GamblerSimulation gambler = new GamblerSimulation();
        System.out.println(gambler.toString());
        Random rand = new Random();
        int random = rand.nextInt(2);
        winOrLoose(random, gambler.getBetValue());
    }

    public static void winOrLoose(int random, int betValue) {

        if (random == betValue) {
            System.out.println("Gambler wins!!!");
        } else {
            System.out.println("Gambler Loose!!!");
        }

    }
}