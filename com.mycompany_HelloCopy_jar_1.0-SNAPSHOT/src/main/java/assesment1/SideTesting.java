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
public class SideTesting {

    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("How Many rounds?");
        String scanResult = myScan.nextLine();
        int rounds = Integer.parseInt(scanResult);

    public static int resultCheck(int numRounds) {
        int tied = 0;
        if (theGame() == compGuess(numRounds)) {
            System.out.println("Tie!");
            tied += 1;
        } else {
            System.out.println("Not Tied");
        }
        return tied;
    }

}
}
}
