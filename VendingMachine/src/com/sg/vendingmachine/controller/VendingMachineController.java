/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.vendingmachine.controller;

import com.sg.vendingmachine.dao.VendingMachineDao;
import com.sg.vendingmachine.dao.VendingMachineDaoException;
import com.sg.vendingmachine.dto.Snack;
import com.sg.vendingmachine.service.InsufficientFundsException;
import com.sg.vendingmachine.service.VendingMachineServiceLayer;
import com.sg.vendingmachine.service.VendingMachineServiceLayerImpl;
import com.sg.vendingmachine.ui.UserIO;
import com.sg.vendingmachine.ui.UserIOConsoleImpl;
import com.sg.vendingmachine.ui.VendingMachineView;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author Maxka
 */
public class VendingMachineController {
    // You need this injected 
    VendingMachineServiceLayer service = new VendingMachineServiceLayerImpl();

    public VendingMachineController(VendingMachineDao dao, VendingMachineView view) {
        this.dao = dao;
        this.view = view;
    }
    
    private VendingMachineDao dao;
    private VendingMachineView view;

    public void run() {
        boolean keepGoing = true;
        int menuSelection = 0;
        
        try {
            listSnacks();
            getUserCost();
            exitMessage();
//            unknownCommand();
        } catch(VendingMachineDaoException | InsufficientFundsException e) {
            view.printExceptions(e.getMessage());
        }
        
    }

    private void listSnacks() throws VendingMachineDaoException {
        view.displayAllSnacksBanner();
        List<Snack> snackList = dao.getAllSnacks();
        view.displaySnackList(snackList);
    }

    private void unknownCommand() {
        view.disPlayUnknownCommandBanner();
    }

    private void exitMessage() {
        view.displayExitBanner();
    }

    private String getSnackName() {
        String theSnack = view.getSnackName();
        return theSnack;
    }
    
    private void getUserCost() throws VendingMachineDaoException, InsufficientFundsException{
        String snackName = getSnackName();
        Double userCost = view.getUserCost();
        BigDecimal userCostBD = new BigDecimal(userCost.toString());
        Snack snack = service.getSnack(snackName);
        BigDecimal snackCost = snack.getSnackPrice();
        BigDecimal change = service.priceChecker(userCostBD, snackCost);
        List<Integer> coins = service.coinExchange(change);
        view.printCoins(coins);
    }
    
    

}
