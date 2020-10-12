/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.FloorCompany.dao;

import com.sg.FloorCompany.dto.Flooring;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Maxka
 */
public class FloorCompanyDaoImpl implements FloorCompanyDao {

    private static LocalDate date = LocalDate.now();
    public static String dateString = DateTimeFormatter.ofPattern("MMddyyyy").format(date);
    public static final String FLOORING_FILE = "Orders/Orders_" + dateString + "Floor_Inventory.txt";
    public static final String DELIMITER = ",";
    private Map<Integer, Flooring> flooring = new HashMap<>();

    @Override
    public List<Flooring> displayAllOrder(String date) throws FloorCompanyDaoException {
        loadOrder();
        return new ArrayList<Flooring>(flooring.values());

    }

    @Override
    public Flooring addOrder(int orderNumber, Flooring floorFile) throws FloorCompanyDaoException {
        try {
            loadOrder();
        } catch (FloorCompanyDaoException e) {

        }
        Set<Integer> keyset = flooring.keySet();
        int maxOrderNumber = Collections.max(keyset) + 1;
        floorFile.setOrderNumber(maxOrderNumber);
        Flooring newOrder = flooring.put(maxOrderNumber, floorFile);
        writeOrder();
        return newOrder;
    }

    @Override
    public Flooring editOrder(int orderNumber) throws FloorCompanyDaoException {
        //1. get user date.
        //2. match user date with file date name.
        //3. get user OrderNumber..
        return null;
    }

    @Override
    public Flooring removeOrder(int orderNumber) throws FloorCompanyDaoException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void loadOrder() throws FloorCompanyDaoException {
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
            int selectedFloorStr = selectedFloor.getOrderNumber(); //Changing int into string
            flooring.put(selectedFloorStr, selectedFloor);
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
        floorAsText += aFloor.getMaterialCost()+ DELIMITER;
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
        snackFromFile.getMaterialCost(new BigDecimal(snackTokens[8]));
        snackFromFile.setLaborCost(new BigDecimal(snackTokens[9]));
        snackFromFile.setTax(new BigDecimal(snackTokens[10]));
        snackFromFile.setTotal(new BigDecimal(snackTokens[11]));
        return snackFromFile;
    }

    private void writeOrder() throws FloorCompanyDaoException {
        PrintWriter out;
        try {
            out = new PrintWriter(new FileWriter(FLOORING_FILE));
        } catch (IOException e) {
            throw new FloorCompanyDaoException("Could not save floor data", e);
        }
        String floorAsText;
        List<Flooring> floorList = new ArrayList(flooring.values());
        for (Flooring selectedFloor : floorList) {
            floorAsText = marshallFloor(selectedFloor);
            out.println(floorAsText);
            out.flush();
        }
        out.close();
    }

    public void exportWrite() {

    }

}
