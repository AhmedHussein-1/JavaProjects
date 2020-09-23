/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.vendingmachine.service;

import com.sg.vendingmachine.dao.VendingMachineDao;
import com.sg.vendingmachine.dao.VendingMachineDaoException;
import com.sg.vendingmachine.dao.VendingMachineDaoFileImpl;
import com.sg.vendingmachine.dto.Snack;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Maxka
 */
public class VendingMachineServiceLayerImpl implements VendingMachineServiceLayer {

    // You need this injected 
    VendingMachineDao dao = new VendingMachineDaoFileImpl();

    @Override
    public BigDecimal priceChecker(BigDecimal userInput, BigDecimal actualPrice) throws InsufficientFundsException{
        if (userInput.compareTo(actualPrice) == 1) { //userInput > actualPrice
            return userInput.subtract(actualPrice);
        } else if (userInput.compareTo(actualPrice) == -1) { //userInput > actualPrice
            throw new InsufficientFundsException("Insufficient Funds Please enter the right ammount or more");
        } else { //Both are equal
            BigDecimal zero = new BigDecimal("0");
            return zero;
        }
    }

    @Override
    public Snack getSnack(String name) throws VendingMachineDaoException {
        Snack theSnack = dao.getSnack(name);
        return theSnack;
    }

    @Override
    public List<Integer> coinExchange(BigDecimal change) {
        int coins = 0;
        BigDecimal quarter = new BigDecimal("0.25");
        BigDecimal dime = new BigDecimal("0.10");
        BigDecimal nickle = new BigDecimal("0.05");
        BigDecimal penny = new BigDecimal("0.01");

        
        int quarterCounter = 0;
        int dimeCounter = 0;
        int nickleCounter = 0;
        int pennyCounter = 0;
        
        List<Integer> aCoin = new ArrayList<>();

        while (change.compareTo(new BigDecimal("0.00")) == 1) {

            if (change.compareTo(quarter) == 1 || change.compareTo(quarter) == 0) {
                change = change.subtract(quarter);
                quarterCounter++;
            } else if (change.compareTo(dime) == 1 || change.compareTo(dime) == 0) {
                change = change.subtract(dime);
                dimeCounter++;
            } else if (change.compareTo(nickle) == 1 || change.compareTo(nickle) == 0) {
                change = change.subtract(nickle);
                nickleCounter++;
            } else {
                change = change.subtract(penny);
                pennyCounter++;
            }

        }
        aCoin.add(quarterCounter);
        aCoin.add(dimeCounter);
        aCoin.add(nickleCounter);
        aCoin.add(pennyCounter);
        
//        String newCoins = Integer.toString(coins);
        return aCoin;
    }

}
