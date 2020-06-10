/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hello;

import java.util.Random;

/**
 *
 * @author Maxka
 */
public class HighRoller {

    public static void main(String[] args) {

        Random diceRoller = new Random();
        int rollResult = 0;
        System.out.println(rollResult);
        for (int i = 0; i < 6; i++) {
            rollResult = diceRoller.nextInt(6) + 1;

            System.out.println("TIME TO ROLL THE DICE!");
            System.out.println("I rolled a " + rollResult);
            if (rollResult == 1) {
                System.out.println("You rolled a critical Failure!");
            }
        }
    }
}
