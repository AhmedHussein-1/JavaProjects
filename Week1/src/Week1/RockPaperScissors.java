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
public class RockPaperScissors {

    public static void main(String[] args) {
        play();
    }

    public static void play() {

        int countTie = 0;
        int countWin = 0;
        int countLose = 0;
        int rounds = 0;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("(1.) rock, (2.) paper, (3.) scosissors? ");
            int playerMove = sc.nextInt();

            Random rn = new Random();
            int randNum = rn.nextInt(3) + 1;
            System.out.println(randNum);

            if (playerMove == 1 && randNum == 2) {
                System.out.println("You Lose!");
                countLose++;
                rounds++;
            } else if (playerMove == randNum) {
                System.out.println("Tie!");
                countTie++;
                rounds++;
            } else {
                System.out.println("you Win!");
                countWin++;
                rounds++;
            }
        } while (rounds > 3);

        System.out.println(countTie);
        System.out.println(countWin);
        System.out.println(countLose);

    }
}
