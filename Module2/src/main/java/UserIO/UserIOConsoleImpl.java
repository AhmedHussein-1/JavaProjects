/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserIO;
//
//

import java.util.Scanner;


/**
 *
 * @author Maxka
 */
public class UserIOConsoleImpl implements UserIO {
    
    Scanner sc = new Scanner(System.in);

    @Override
    public void print(String message) {
        System.out.println(message);
    }

    @Override
    public String readString(String prompt) {
        print(prompt);
        String userAnswer = sc.nextLine();
        return userAnswer;    //sc.nextLine();
    }

    @Override
    public int readInt(String prompt) {
        print(prompt);
        String userAnswer = sc.nextLine();
        return Integer.parseInt(userAnswer);
    }
    

    @Override
    public int readInt(String prompt, int min, int max) {
        int value = -1;
        do {
            print(prompt);
            String userAnswer = sc.nextLine();
            value = Integer.parseInt(userAnswer);
            if (value < min || value > max) {
                print("Error value outside of range!");
            }
        } while (value < min || value > max);
        return value;
    }

    @Override
    public double readDouble(String prompt) {
        print(prompt);
        String userAnswer = sc.nextLine();
        return Double.parseDouble(userAnswer);
    }

    @Override
    public double readDouble(String prompt, double min, double max) {
        double value = -1;
        do {
            print(prompt);
            String userAnswer = sc.nextLine();
            value = Double.parseDouble(userAnswer);
            if (value < min || value > max) {
                print("Error value outside of range!");
            }
        } while (value < min || value > max);
        return value;
    }

    @Override
    public float readFloat(String prompt) {
        print(prompt);
        String userAnswer = sc.nextLine();
        return Float.parseFloat(userAnswer);
    }

    @Override
    public float readFloat(String prompt, float min, float max) {
        float value = -1;
        do {
            print(prompt);
            String userAnswer = sc.nextLine();
            value = Float.parseFloat(userAnswer);
            if (value < min || value > max) {
                print("Error value outside of range!");
            }
        } while (value < min || value > max);
        return value;
    }

    @Override
    public long readLong(String prompt) {
        print(prompt);
        String userAnswer = sc.nextLine();
        return Long.parseLong(userAnswer);
    }

    @Override
    public long readLong(String prompt, long min, long max) {
        long value = -1;
        do {
            print(prompt);
            String userAnswer = sc.nextLine();
            value = Long.parseLong(userAnswer);
            if (value < min || value > max) {
                print("Error value outside of range!");
            }
        } while (value < min || value > max);
        return value;
    }
    
}
//
