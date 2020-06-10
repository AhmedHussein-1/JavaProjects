/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hello;

/**
 *
 * @author Maxka
 */
public class LoopsAndStatements {

    public static void main(String[] args) {
        /*
        for (int i = 0; i <= 10; i++) {

            System.out.println(i);

        }
        System.out.println("");

        int a = 0;

        while (a <= 10) {

            System.out.println(a);
            a++;
        }

        int num1 = 10;

        if (num1 <= 20) {
            System.out.println("Too small");
        } else {
            System.out.println("Too big");
        }
        
         */

        // for every 3rd num = Fizz
        // for every 5th num = buzz
        // else print num
        for (int i = 0; i <= 100; i++) {
            if (i == 0) {
                System.out.println(i);
            } else if (i % 15 == 0) {
                System.out.println("Fizzbuzz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }

        }

    }

}
