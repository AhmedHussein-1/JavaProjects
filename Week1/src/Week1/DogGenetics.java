/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Maxka
 */
public class DogGenetics {

    public static void main(String[] args) {
        dogGen();
    }

    public static void dogGen() {

        Random rn = new Random();
        int randNum = rn.nextInt(100) + 1;

        int leftOver = randNum - 100;
        int firstIttoration = 0;
        int firstItLeftOver = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("What is your dog's name? ");
        String dogName = sc.nextLine();

        System.out.println(dogName + " is: ");

        if (randNum > leftOver) {
            int randNum2 = rn.nextInt(randNum);
            System.out.println(Math.abs(leftOver));

            firstIttoration = randNum2;
            System.out.println(randNum2);

            firstItLeftOver = randNum - randNum2;
            System.out.println(randNum - randNum2);
            

        } else {
            int leftOver2 = rn.nextInt(leftOver);
            System.out.println(randNum);

            firstIttoration = leftOver2;
            System.out.println(leftOver2);

            firstItLeftOver = randNum - leftOver2;
            System.out.println(randNum - leftOver2);

        }
        
        

        
        
        
        
        
//        Random rn = new Random();
//        int randNum = rn.nextInt(100) + 1;
//
//        System.out.println(randNum + "% St. Bernard");
//
//        int secondBreed = randNum - 100;
//        System.out.println(Math.abs(secondBreed) + "% Chihuahua");
//
//        int randNum2 = rn.nextInt(Math.abs(secondBreed)) + 1;
//        int thrdBreed = Math.abs(secondBreed) - randNum2;
//        System.out.println(thrdBreed);
//        System.out.println(Math.abs(thrdBreed) + "% Dramatic RedNosed Asian Pug");
//
//        int randNum3 = rn.nextInt(Math.abs(thrdBreed)) + 1;
//        int fourthBreed = Math.abs(thrdBreed) - randNum3;
//        System.out.println(Math.abs(fourthBreed) + "% Common Cur");
//
//        int randNum4 = rn.nextInt(Math.abs(fourthBreed)) + 1;
//        int fifthBreed = Math.abs(fourthBreed) - randNum4;
//        System.out.println(Math.abs(fifthBreed) + "% King Doberman");
    }
}
