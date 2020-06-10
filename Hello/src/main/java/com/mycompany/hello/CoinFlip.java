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
public class CoinFlip {
    public static void main(String[] args) {
        Random rng = new Random();

        boolean coinIsHeads = true;
        
        for (int i = 0; i < 10; i++) {
            double coin = rng.nextDouble();
            System.out.println(coin);
            
            if (coin > 0.5){
            coinIsHeads = false;
            System.out.println("Tails");
            } else {
            System.out.println("Heads");
            }
            
        }
//        if (coin > 0.5){
//            coinIsHeads = false;
//            System.out.println("Tails");
//        } else {
//            System.out.println("Heads");
//        }
        

        
        

        
        
    }
}
