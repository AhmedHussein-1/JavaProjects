/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.FloorCompany.dao;

import com.sg.FloorCompany.dto.Tax;
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
public class FloorCompanyTaxDaoImpl implements FloorCompanyTaxDao {

    private Map<String, Tax> taxRateMap = new HashMap<>();
    public static final String DELIMITER = ",";
    public static String Taxes_FILE = ("Data/Taxes.txt");

    @Override
    public List<Tax> readProductFile() throws FloorCompanyTaxDaoException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private Tax unMarshallTaxFile(String taxAsText) {
        String[] taxTokens = taxAsText.split(DELIMITER);
        String taxName = taxTokens[0];
        Tax taxFromFile = new Tax(taxName);
        taxFromFile.setState(taxTokens[0]);
        taxFromFile.setStateName(taxTokens[1]);
        taxFromFile.setTaxRate(new BigDecimal(taxTokens[2]));

        return taxFromFile;
    }

    private void loadTaxes() throws FloorCompanyTaxDaoException {
        Scanner sc;
        try {
            sc = new Scanner(
                    new BufferedReader(
                            new FileReader(Taxes_FILE)));
        } catch (FileNotFoundException e) {
            throw new FloorCompanyTaxDaoException("could not load taxes into file", e);
        }
        String currentLine;
        Tax taxObject;
        sc.nextLine();
        while (sc.hasNextLine()) {
            currentLine = sc.nextLine();
            taxObject = unMarshallTaxFile(currentLine);
            taxRateMap.put(taxObject.getState(), taxObject);
        }
        sc.close();
    }
}
