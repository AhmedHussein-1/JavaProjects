/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assesment1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Maxka
 */
public class RockPaperScissors {

    public static int wins = 0;
    public static int loses = 0;
    public static int ties = 0;

    public static void main(String[] args) {
        boolean gameRepeat = true;
        // this only runs when the statement above is true
        while(gameRepeat){
            Scanner sc = new Scanner(System.in);
            
            int numRounds = rounds();
            System.out.println(compGuess(numRounds));
            counter();
         
            System.out.println("Do you want to play again? (Y/n)");
            String yesOrNo = sc.nextLine();

            if (yesOrNo.equals("Y") || yesOrNo.equals("y")) {
                //passes through became gameRepeat is already true
            } else if (yesOrNo.equals("N") || yesOrNo.equals("n")) {
                gameRepeat = false;
                System.out.println("Game has ended, thank you for playing");
            } else {
                System.out.println("error only choose between Y and n");
                System.exit(0);
            }
        }

    }

    public static int rounds() {
        Scanner myScan = new Scanner(System.in);
        System.out.println("How Many rounds?");
        String scanResult = myScan.nextLine();
        int rounds = Integer.parseInt(scanResult);

        if (rounds > 10 || rounds < 1) {
            System.out.println("Rounds out of range, choose between 1 and 10");
        } else {
            System.out.println("you chose " + rounds + " rounds");
        }
        return rounds;
    }

    public static void resultCheck(int myGuess, int compGuess) {

        int rock = 1;
        int paper = 2;
        int scissors = 3;
        System.out.println("the computer guessed: " + compGuess);

        if (myGuess == compGuess) {
            System.out.println("Tie!");
            ties++;
        } else if (myGuess == rock && compGuess == scissors) {
            System.out.println("You Win!");
            wins++;
        } else if (myGuess == paper && compGuess == rock) {
            System.out.println("You Win!");
            wins++;
        } else if (myGuess == scissors && compGuess == paper) {
            System.out.println("You Win!");
            wins++;
        } else if (myGuess == rock && compGuess == paper) {
            System.out.println("You Lose!");
            loses++;
        } else if (myGuess == scissors && compGuess == rock) {
            System.out.println("You Lose!");
            loses++;
        } else {
            System.out.println("You Lose!");
            loses++;
        }
    }

    public static void counter() {
        System.out.println("Number of wins: " + wins);
        System.out.println("Number of Loses: " + loses);
        System.out.println("Number of Ties: " + ties);

        if (wins > loses) {
            System.out.println("You won the game!");
        } else if (wins < loses) {
            System.out.println("You Lost the game");
        } else {
            System.out.println("The game was tied");
        }
    }

    public static int myGuess() {

        Scanner myScan = new Scanner(System.in);
        System.out.println("Choose Rock 1, Paper 2 or Scissors 3");
        String scanResult = myScan.nextLine();
        int myGuess = Integer.parseInt(scanResult);

        if (myGuess < 1 || myGuess > 3) {
            System.out.println("You are out of range, choose a number 1 - 3");
        } else if (myGuess == 1) {
            System.out.println("You chose Rock");
        } else if (myGuess == 2) {
            System.out.println("You chose paper");
        } else {
            System.out.println("You chose Scissors");
        }
        return myGuess;

    }

    public static int compGuess(int numRounds) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int compGuess = 0;
        // Generate 10 numbers. Each between 1, 2 and 3.
        for (int counter = 1; counter <= numRounds; counter++) {
            int playerGuess = myGuess();
            compGuess = rand.nextInt(3) + 1;
            resultCheck(playerGuess, compGuess);
        }
        return compGuess;
    }
}
