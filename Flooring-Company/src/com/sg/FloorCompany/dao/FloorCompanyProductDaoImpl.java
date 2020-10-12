/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.FloorCompany.dao;

import com.sg.FloorCompany.dto.Product;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Maxka
 */
public class FloorCompanyProductDaoImpl implements FloorCompanyProductDao {
    
    private Map<String, Product> ProductMap = new HashMap<>();
    public static final String DELIMITER = ",";
    public static String Products_FILE = ("Data/Products.txt");
    
    @Override
    public List<Product> readProductFile() throws FloorCompanyProductDaoException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private Product unMarshallProductFile(String productAsText) {
        String[] productTokens = productAsText.split(DELIMITER);
        String productName = productTokens[0];
        Product productsFromFile = new Product(productName);
        productsFromFile.setProductType(productTokens[0]);
        productsFromFile.setCostPerSquareFoor(new BigDecimal (productTokens[1]));
        productsFromFile.setLaborCostPerSquareFoot(new BigDecimal (productTokens[2]));
        
        return productsFromFile;
    }
    
     private void loadProducts() throws FloorCompanyProductDaoException {
        Scanner sc;
        try {
            sc = new Scanner(
                    new BufferedReader(
                            new FileReader(Products_FILE)));
        } catch (FileNotFoundException e) {
            throw new FloorCompanyProductDaoException("could not load products into file", e);
        }
        String currentLine;
        Product selectedFile;
        sc.nextLine();
        while (sc.hasNextLine()) {
            currentLine = sc.nextLine();
            selectedFile = unMarshallProductFile(currentLine);
            ProductMap.put(selectedFile.getProductType(), selectedFile);
        }
        sc.close();
    }

}
