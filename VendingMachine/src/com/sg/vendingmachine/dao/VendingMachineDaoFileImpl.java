/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.vendingmachine.dao;

import com.sg.vendingmachine.dto.Snack;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Maxka
 */
public class VendingMachineDaoFileImpl implements VendingMachineDao{
    public static final String SNACK_FILE = "Inventory.txt";
    public static final String DELIMITER = "::";
    private Map<String, Snack> snacks = new HashMap<>();
    
    @Override
    public List<Snack> getAllSnacks() throws VendingMachineDaoException {
        loadSnack();
        return new ArrayList(snacks.values());
    }

    @Override
    public Snack getSnack(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Snack removeSnack(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private void loadSnack() throws VendingMachineDaoException {
        Scanner sc;
        
        try {
            sc = new Scanner(new BufferedReader(new FileReader(SNACK_FILE)));
        }   catch (FileNotFoundException e) {
            throw new VendingMachineDaoException(
            "Could not load snack data into memory", e);
        }
        
        String currentLine;
        Snack selectedSnack;
        
        while (sc.hasNextLine()) {
            currentLine = sc.nextLine();
            selectedSnack = unmarshallSnack(currentLine);
            
            snacks.put(selectedSnack.getSnackName(), selectedSnack);
        }
        sc.close();
    }
    private String marshallSnack(Snack aSnack) {
        String snackAsText = aSnack.getSnackName() + DELIMITER;
        snackAsText += aSnack.getSnackPrice() + DELIMITER;
        snackAsText += aSnack.getInventory() + DELIMITER;
        return snackAsText;
    }
    
    private Snack unmarshallSnack(String snackAsText)  {
        String[] snackTokens = snackAsText.split(DELIMITER);
        String snackName = snackTokens[0];
        Snack snackFromFile = new Snack(snackName);
        snackFromFile.setSnackPrice(new BigDecimal(snackTokens[1]));
        snackFromFile.setInventory(Integer.parseInt(snackTokens[2]));
        return snackFromFile;
    } 
    
    private void writeSnack() throws VendingMachineDaoException {
        PrintWriter out;
        
        try {
            out = new PrintWriter(new FileWriter(SNACK_FILE));
        }
        catch(IOException e) {
            throw new VendingMachineDaoException("could not save snack data", e);
        }
        String snackAsText;
        List<Snack> snackList = new ArrayList(snacks.values());
        for (Snack selectedSnack : snackList) {
            snackAsText = marshallSnack(selectedSnack);
            out.println(snackAsText);
            out.flush();
        }
        out.close();
    }   


}