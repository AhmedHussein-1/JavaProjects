/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.vendingmachine.dao;

import com.sg.vendingmachine.dto.Snack;
import java.io.FileWriter;
import java.math.BigDecimal;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Maxka
 */
public class VendingMachineDaoFileImplTest {
    
    VendingMachineDao testDao;
    public VendingMachineDaoFileImplTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() throws Exception {
        String textFileCall = "VMv2Test.txt";
        
        FileWriter fw = new FileWriter(textFileCall);
        fw.append("peanuts::1.75::6::");
        fw.flush();
        fw.close();
        
        testDao = new VendingMachineDaoFileImpl(textFileCall);
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testGetSnack() throws Exception {
        Snack snackOne = new Snack("peanuts", new BigDecimal("1.75"), 6);
        
        Snack getSnack = testDao.getSnack("peanuts");
        
        System.out.println(getSnack);
        assertEquals(snackOne, getSnack, "Expected to retrieve peanuts");
    }
    
    @Test
    public void testGetAllSnacks() throws Exception {
        Snack testSnack = new Snack("peanuts", new BigDecimal("1.75"), 6);
        
        List<Snack> allSnacks =  testDao.getAllSnacks();
        
        assertEquals(allSnacks.contains(testSnack), true, "Expected all snacks to contain peanuts"); // List(true), true, "String"
        
        assertEquals(allSnacks.size(), 1, "Expected to have 1 items in the list"); // List(int), 1 items in list, "Sting"
        
    }
    
    @Test 
    public void testRemoveSnack() throws Exception {
        Snack testSnack = new Snack("peanuts", new BigDecimal("1.75"), 6);
        
        Snack removeSnack = testDao.removeSnack("peanuts");
        
        int removedSnackInventory = removeSnack.getInventory();
        int testSnackRemoved = (testSnack.getInventory() - 1);
        
        assertEquals(removedSnackInventory, testSnackRemoved, "Expected snack inventory decresesd by one");
    }
    
}
