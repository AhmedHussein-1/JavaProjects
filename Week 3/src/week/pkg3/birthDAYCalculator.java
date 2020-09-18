/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week.pkg3;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Maxka
 */
public class birthDAYCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What's your birthday? ");
        String birthdate = sc.nextLine();
        

        LocalDate ld = LocalDate.now();
//        System.out.println(ld + " currentTime");

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        ld = LocalDate.parse(birthdate, formatter);
        System.out.println("That's means you were born on a " + ld.getDayOfWeek() + "!");
        
        LocalDate currentTime = LocalDate.now();
        
        int diff = Period.between(ld, currentTime).getYears();

        LocalDate thisYearDay = ld.plusYears(diff);
        System.out.println("This year it falls on a " + thisYearDay.getDayOfWeek());
        
//        System.out.println(ld.until(currentTime));
           
        System.out.println("Bet yer excited to be turning " + (1 + Period.between(ld, currentTime).getYears()));


//        LocalDate past = ld.minusYears(26);
//
//        System.out.println(Period.between(past, ld).getYears());
//
//        past.getDayOfWeek();
//        System.out.println(past.getDayOfWeek());
//
//        System.out.println(ld.getDayOfWeek());
//        System.out.println(ld);
//
//        String formatted = past.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
//        System.out.println(formatted + " formated");
//
//        
//        System.out.println(past.plusYears(26) + "thasdfgsdfgsdfgsdfg");
    }

}
