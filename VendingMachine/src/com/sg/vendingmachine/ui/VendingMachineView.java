/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.vendingmachine.ui;

import com.sg.vendingmachine.dto.Snack;
import java.util.List;

/**
 *
 * @author Maxka
 */
public class VendingMachineView {
    
    public VendingMachineView(UserIO io) {
        this.io = io;
    }
    private UserIO io;
    
    public void displaySnackList(List<Snack> snackList) {
        String snackInfo = "";
        for (Snack selectedSnack : snackList) {
            snackInfo = String.format("%s : %s : %s",
                selectedSnack.getSnackName(),
                selectedSnack.getSnackPrice(),
                selectedSnack.getInventory());
            io.print(snackInfo);
                
        }
        io.readString("Enter Snack Name: ");
    }
    public String getSnackName() {
        return io.readString("Please Select from the above: ");
    }
    
    public String getUserSnack() {
        return io.readString("Please choose a snack: ");
    }
    
    public double getUserCost(){
       return io.readDouble("lease enter your change: ");
    }
    public void displayAllSnacksBanner() {
        io.print("=== Display all snacks ===");
    }
    public void displaySuccessfulBanner(){
        io.print("=== Vending is processing. Please hit enter to continue. ===");
    }
    
    public void displayExitBanner() {
        io.print("=== Thank you for vending with us! ===");
    }
    
    public void disPlayUnknownCommandBanner() {
        io.print("Unknown Command!!!");
    }
    
    public void displayErrorMessage ( String errorMsg) {
        io.print("=== Error ===");
        io.print(errorMsg);
    }
}

