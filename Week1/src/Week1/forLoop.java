/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week1;

import java.util.Scanner;

/**
 *
 * @author Maxka
 */
public class forLoop {
    public static void main(String[] args) {
//        for (int i = 1; i <= 10; i++){
//            System.out.println(i);
//        }
        
//        int i = 1;
//        while ( i <= 10) {
//            i++;
//            System.out.println(i);
//        }
//    }
//        int i = 1;
//        do {        
//            System.out.println(i);
//            i++;
//        } while(i <= 10);

        Scanner sc = new Scanner(System.in);
        int userChoice1 = 0;
        
        String questionA = "";
        System.out.println("You're at a cross section. do you want to do (1.) STRAIGHT, (2.) LEFT or (3.) RIGHT?");
        questionA = sc.nextLine();
        
        userChoice1 = Integer.parseInt(questionA);
        
        if (userChoice1 == 1){
            System.out.println("you chose LEFT"); 
            int userChoice2 = 0;
            String questionB = "";
            System.out.println("You have arrived at a house: (1.) Enter house, (2.) Enter Shed (3.) keep walking");
            questionB = sc.nextLine();
            userChoice2 = Integer.parseInt(questionB);

            if (userChoice2 == 1) {
                System.out.println("You have entered the house");
            } else if (userChoice2 == 2) {
                System.out.println("You have entered the shed");
            } else {
                System.out.println("you passed the house and continued walking");
            }
        } else if (userChoice1 == 2) {
            System.out.println("You chose STRAIGHT");
            int userChoice2 = 0;
            String questionB = "";
            System.out.println("you have arrived at a car: enter car, take flash light, continue walking");
            questionB = sc.nextLine();
            userChoice2 = Integer.parseInt(questionB);

            if (userChoice2 == 1) {
                System.out.println("You have entered the car");
            } else if (userChoice2 == 2) {
                System.out.println("You have taken the flashlight");
            } else {
                System.out.println("you passed the car and continued walking");
            }

        } else {
            System.out.println("You chose RIGHT");
            int userChoice2 = 0;
            String questionB = "";
            System.out.println("you have arrived at a forest");
            questionB = sc.nextLine();
            userChoice2 = Integer.parseInt(questionB);

            if (userChoice2 == 1) {
                System.out.println("go into the forst");
                System.out.println("you have entered the forest");
            } else if (userChoice2 == 2) {
                System.out.println("kys");
                System.out.println("you kys");
            } else {
                System.out.println("you passed the forst and continued walking");
                
            }
        }
        
        
        
        
        
        
        
        int userChoice2 = 0;
        String questionB = "";
        System.out.println("you have passed the forest and saw 3 exits. (1.) run to the cops for safty, (2.) take helicopter to freedom (3.) steal bike and run away");
        questionB = sc.nextLine();
        userChoice2 = Integer.parseInt(questionB);
        
        if (userChoice2 == 1){
            System.out.println("you ran to cops for safety"); 
        } else if (userChoice2 == 2) {
            System.out.println("kys");
        } else {
            System.out.println("you passed the forst and continued walking");
        }
        
        
        
       

    }
}
