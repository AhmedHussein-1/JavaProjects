/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week2;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Maxka
 */
public class StateCapitals1 {

    public static void main(String[] args) {
        
        Map<String, String> statesCapital = new HashMap();

        statesCapital.put("Alabama", "montgomery");
        statesCapital.put("Alaska", "Juneau");
        statesCapital.put("Arizona", "Phoenix");
        statesCapital.put("Arkansas", "Little Rock");
        
        Set<String> states = statesCapital.keySet();
        for (String state : states) {
            System.out.println("STATES: " + state);
        }
        
        Collection<String> capitals = statesCapital.values();
        for (String capital : capitals) {
            System.out.println("CAPITALS: " + capital);
        
        }
        
        System.out.println("STATE/CAPITAL PAIRS:\n" + "====================");
        for (String state : states) {
            
            System.out.println(state +" - "+ statesCapital.get(state));
        }
        
        
        
    }

}
