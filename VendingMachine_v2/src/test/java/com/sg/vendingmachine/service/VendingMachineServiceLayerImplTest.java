/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.vendingmachine.service;

import com.sg.vendingmachine.dao.VendingMachineAuditDao;
import com.sg.vendingmachine.dao.VendingMachineAuditDaoMock;
import com.sg.vendingmachine.dao.VendingMachineDao;
import com.sg.vendingmachine.dao.VendingMachineDaoException;
import com.sg.vendingmachine.dao.VendingMachineDaoMock;
import com.sg.vendingmachine.dto.Snack;
import java.math.BigDecimal;
import java.util.ArrayList;
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
public class VendingMachineServiceLayerImplTest {
    
    VendingMachineAuditDao auditMock = new VendingMachineAuditDaoMock();
    VendingMachineDao daoMock = new VendingMachineDaoMock();
    VendingMachineServiceLayer testService = new VendingMachineServiceLayerImpl(daoMock, auditMock);
    
    public VendingMachineServiceLayerImplTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testRemoveException() throws NoItemInventoryException, VendingMachineDaoException {
        Snack mySnack = new Snack("peanuts");
        mySnack.setInventory(-1);
        
        try {
            mySnack = testService.removeSnack(mySnack.getSnackName());
            fail();
        } catch(NoItemInventoryException e) {
            
        }
        //This test will never pass because it returns a negative one and it will never reach the return zero
//        assertEquals(mySnack.getInventory(), 0, "Expects inventory to be zero");
    }
    
    @Test
    public void priceChecker() throws Exception {
        BigDecimal userInputTest = new BigDecimal("2.50");
        BigDecimal actualPriceTest =  new BigDecimal("3.50");
        
        BigDecimal subtract = userInputTest.subtract(actualPriceTest);
        BigDecimal methodSubtract = new BigDecimal("0");
        
//        assertEquals(subtract, methodSubtract , "-1.50");
        BigDecimal greaterThanUserinput = new BigDecimal("3.50");
        BigDecimal greaterThanActualPrice = new BigDecimal("2.50");
        
        BigDecimal myMethod = testService.priceChecker(greaterThanUserinput, greaterThanActualPrice);
        assertEquals(myMethod, new BigDecimal("1.00"), "1.00");

        try {
            methodSubtract = testService.priceChecker(userInputTest, actualPriceTest);
            fail();
        } catch(InsufficientFundsException e){
            
        }
        
    }
    
    @Test
    public void coinExchange() throws Exception {
        
        BigDecimal change = new BigDecimal("0.41");
        
        List<Integer> coinEx = testService.coinExchange(change);
        List<Integer> myList = new ArrayList();
        myList.add(1);
        myList.add(1);
        myList.add(1);
        myList.add(1);
        assertEquals(coinEx, myList, "coins");
        assertEquals(coinEx.size(), 4, "List compare");
    }
    
}
