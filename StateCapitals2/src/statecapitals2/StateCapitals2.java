/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statecapitals2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Maxka
 */

/*

 */
public class StateCapitals2 {

    public static final String DELIMIT = "::";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new FileReader("StateCapitals.txt"));
        Scanner userInOne = new Scanner(System.in);
        Scanner userInTwo = new Scanner(System.in);

        Map<String, String> stateCapitals = new HashMap();
        
        System.out.println("HERE ARE THE STATES :");
        while (sc.hasNextLine()) {
            String currentLine = sc.nextLine();
            String[] parts = currentLine.split(DELIMIT);
            stateCapitals.put(parts[0], parts[1]); //map
            System.out.println(parts[0]);

        }
        System.out.println("SELECT A STATE: ");
        String myState = userInOne.nextLine();
        System.out.println("WHAT IS THE CAPITAL OF " + myState+"?");
        String myCapital = userInTwo.nextLine();
        if (myCapital.equals(stateCapitals.get(myState))) {
            System.out.println(myCapital + " IS THE CAPITAL OF "+ myState);
        }
    }
}
