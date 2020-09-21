/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.vendingmachine.service;

import com.sg.vendingmachine.dao.VendingMachineDaoException;
import com.sg.vendingmachine.dto.Snack;
import java.math.BigDecimal;

/**
 *
 * @author Maxka
 */
public interface VendingMachineServiceLayer {
    
    public BigDecimal priceChecker(BigDecimal userInput, BigDecimal actualPrice);
    public Snack getSnack(String name) throws VendingMachineDaoException;
    public String coinExchange(BigDecimal change);

}
