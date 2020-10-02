/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.FloorCompany.dao;

import com.sg.FloorCompany.dto.Flooring;
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
public class FloorCompanyDaoImpl implements FloorCompanyDao {

    public static final String FLOORING_FILE = "Floor_Inventory.txt";
    public static final String DELIMITER = ",";
    private Map<String, Flooring> flooring = new HashMap<>();

    @Override
    public List<Flooring> getAllFlooring() throws FloorCompanyDaoException {
        loadFloor();
        return new ArrayList(flooring.values());
    }

    @Override
    public Flooring getFloor(String name) throws FloorCompanyDaoException {
        loadFloor();
        Flooring floor = flooring.get(name);
        return floor;
    }

    @Override
    public Flooring removeFlooring() throws FloorCompanyDaoException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void loadFloor() throws FloorCompanyDaoException {
        Scanner sc;
        try {
            sc = new Scanner(
                    new BufferedReader(
                            new FileReader(FLOORING_FILE)));
        } catch (FileNotFoundException e) {
            throw new FloorCompanyDaoException(
                    "Could not load snack data into memory", e);
        }
        String currentLine;
        Flooring selectedFloor;
        while (sc.hasNextLine()) {
            currentLine = sc.nextLine();
            selectedFloor = unmarshallFloor(currentLine);
            flooring.put((selectedFloor.getOrderNumber()), selectedFloor); //Incaposlated might cause a problem later on.
        }
        sc.close();
    }

    private String marshallFloor(Flooring aFloor) {
        String floorAsText = aFloor.getOrderNumber() + DELIMITER;
        floorAsText += aFloor.getCustomerName() + DELIMITER;
        floorAsText += aFloor.getState() + DELIMITER;
        floorAsText += aFloor.getTaxRate() + DELIMITER;
        floorAsText += aFloor.getProductType() + DELIMITER;
        floorAsText += aFloor.getArea() + DELIMITER;
        floorAsText += aFloor.getCostPerSquareFoot() + DELIMITER;
        floorAsText += aFloor.getLaborCostPerSquareFoot() + DELIMITER;
        floorAsText += aFloor.getMatericalCost() + DELIMITER;
        floorAsText += aFloor.getLaborCost() + DELIMITER;
        floorAsText += aFloor.getTax() + DELIMITER;
        floorAsText += aFloor.getTotal() + DELIMITER;
        return floorAsText;
    }

    private Flooring unmarshallFloor(String snackAsText) {
        String[] snackTokens = snackAsText.split(DELIMITER);
        String floorName = snackTokens[0];
        Flooring snackFromFile = new Flooring(Integer.parseInt(floorName));
        snackFromFile.setCustomerName(snackTokens[1]);
        snackFromFile.setState(snackTokens[2]);
        snackFromFile.setTaxRate(new BigDecimal(snackTokens[3]));
        snackFromFile.setProductType(snackTokens[4]);
        snackFromFile.setArea(new BigDecimal(snackTokens[5]));
        snackFromFile.setCostPerSquareFoot(new BigDecimal(snackTokens[6]));
        snackFromFile.setLaborCostPerSquareFoot(new BigDecimal(snackTokens[7]));
        snackFromFile.setMaterialCost(new BigDecimal(snackTokens[8]));
        snackFromFile.setLaborCost(new BigDecimal(snackTokens[9]));
        snackFromFile.setTax(new BigDecimal(snackTokens[10]));
        snackFromFile.setTotal(new BigDecimal(snackTokens[11]));
        return snackFromFile;
    }
    
    private void writeFloor() throws FloorCompanyDaoException {
        PrintWriter out;
        try {
            out = new PrintWriter(new FileWriter(FLOORING_FILE));
        } catch (IOException e) {
            throw new FloorCompanyDaoException("Could not save floor data", e); 
        }
        String floorAsText;
        List<Flooring> floorList = new ArrayList(flooring.values());
        for(Flooring selectedFloor : floorList) {
            floorAsText = marshallFloor(selectedFloor);
            out.println(floorAsText);
            out.flush();
        }
        out.close();
    }
}
