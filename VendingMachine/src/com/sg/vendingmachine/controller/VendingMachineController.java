/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.vendingmachine.controller;

import com.sg.vendingmachine.dao.VendingMachineDao;
import com.sg.vendingmachine.dao.VendingMachineDaoException;
import com.sg.vendingmachine.dto.Snack;
import com.sg.vendingmachine.ui.UserIO;
import com.sg.vendingmachine.ui.UserIOConsoleImpl;
import com.sg.vendingmachine.ui.VendingMachineView;
import java.util.List;

/**
 *
 * @author Maxka
 */
public class VendingMachineController {

    public VendingMachineController(VendingMachineDao dao, VendingMachineView view) {
        this.dao = dao;
        this.view = view;
    }
    
    private VendingMachineDao dao;
    private VendingMachineView view;
    private UserIO io = new UserIOConsoleImpl();

    public void run() throws VendingMachineDaoException {
        boolean keepGoing = true;
        int menuSelection = 0;
        listSnacks();
        exitMessage();
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

}
