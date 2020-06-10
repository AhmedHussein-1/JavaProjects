/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hello;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Maxka
 */
public class GuessMeMore {

    public static void main(String[] args) {
        Random rng = new Random();

//      double outPut = rng.nextDouble()* (100 - -100) + -100;
        // parantheses is 200 total (range) and the + -100 is shifting it -100
        int outPut = rng.nextInt(100 + 1 - -100) + -100;
        System.out.println(outPut);

        Scanner myScan = new Scanner(System.in);
        System.out.println("Guess a Number!");
        String guess = myScan.nextLine();
        int conv = Integer.parseInt(guess);

        if (conv == outPut) {
            System.out.println("You are correct!");
        } else if (conv > outPut) {
            System.out.println("Too Big!");
        } else {
            System.out.println("Too Small");
        }

    }

}
