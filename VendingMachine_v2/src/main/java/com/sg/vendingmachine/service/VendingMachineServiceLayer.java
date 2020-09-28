/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.vendingmachine.service;

import com.sg.vendingmachine.dao.VendingMachineDaoException;
import com.sg.vendingmachine.dto.Snack;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author Maxka
 */
public interface VendingMachineServiceLayer {
    
    public BigDecimal priceChecker(BigDecimal userInput, BigDecimal actualPrice)  throws InsufficientFundsException;
    List<Snack> getAllSnacks() throws VendingMachineDaoException;
    public Snack getSnack(String name) throws VendingMachineDaoException;
    public List<Integer> coinExchange(BigDecimal change) ;
    public Snack removeSnack(String name) throws VendingMachineDaoException, NoItemInventoryException;

}
