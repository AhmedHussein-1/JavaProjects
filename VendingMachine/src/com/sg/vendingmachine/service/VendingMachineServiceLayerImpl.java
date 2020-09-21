/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.vendingmachine.service;

import com.sg.vendingmachine.dao.VendingMachineDao;
import com.sg.vendingmachine.dao.VendingMachineDaoFileImpl;
import com.sg.vendingmachine.dto.Snack;
import java.math.BigDecimal;

/**
 *
 * @author Maxka
 */
public class VendingMachineServiceLayerImpl implements VendingMachineServiceLayer {
    // You need this injected 
    VendingMachineDao dao = new VendingMachineDaoFileImpl();
    
    @Override
    public BigDecimal priceChecker(BigDecimal userInput, BigDecimal actualPrice) {
        if (userInput.compareTo(actualPrice) == 1) {
            return userInput.subtract(actualPrice);
        } else if(userInput.compareTo(actualPrice) == -1) {
            return (actualPrice.subtract(userInput)).abs();
        } else {
            BigDecimal zero = new BigDecimal("0");
            return zero;
        }
    } 
    

    @Override
    public Snack getSnack(String name) {
        Snack theSnack = dao.getSnack(name);
        return theSnack;
    }
    
}
