/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.dvdlibrary.dao;

import com.sg.dvdlibrary.dto.Dvd;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Maxka
 */
public class DvdLibraryDaoFileImpl implements DvdLibraryDao {

    public static final String DVD_FILE = "Dvd.txt";
    public static final String DELIMITER = "::";
    private Map<String, Dvd> dvds = new HashMap<>();

    @Override
    public Dvd addDvd(String dvdTitle, Dvd dvd) throws DvdLibraryDaoException {
        try {
            loadDvd();
        } catch (DvdLibraryDaoException e) {
            // write file will create a file if there is not one.
        }

        Dvd newDvd = dvds.put(dvdTitle, dvd);
        writeRoster();
        return newDvd;
    }

    @Override
    public List<Dvd> getAllDvds() throws DvdLibraryDaoException {
        loadDvd();
        return new ArrayList(dvds.values());
    }

    @Override
    public Dvd getDvd(String dvdTitle) throws DvdLibraryDaoException {
        loadDvd();
        return dvds.get(dvdTitle);
    }

    @Override
    public Dvd removeDvd(String dvdTitle) throws DvdLibraryDaoException {
        loadDvd();
        Dvd removeDvd = dvds.remove(dvdTitle);
        writeRoster();
        return removeDvd;
    }
    
    @Override
    public Dvd editDvd(String dvdTitle, Dvd dvd) throws DvdLibraryDaoException {
        loadDvd();
        Dvd removeDvd = dvds.remove(dvdTitle);
        writeRoster();
        Dvd newDvd = removeDvd;
        
        newDvd = dvds.put(dvdTitle, dvd);
        writeRoster();
        return newDvd;
        
    }

    private void writeRoster() throws DvdLibraryDaoException {

        PrintWriter out;

        try {
            out = new PrintWriter(new FileWriter(DVD_FILE));
        } catch (IOException e) {
            throw new DvdLibraryDaoException(
                    "Could not save dvd data.", e);
        }

        String dvdAsText;
        List<Dvd> dvdList = new ArrayList(dvds.values());
        for (Dvd currentDvd : dvdList) {

            dvdAsText = marshallDvd(currentDvd);

            out.println(dvdAsText);

            out.flush();
        }

        out.close();
    }

    private String marshallDvd(Dvd aDvd) {

        String dvdAsText = aDvd.getDvdTitle() + DELIMITER;

        dvdAsText += aDvd.getDvdReleaseDate() + DELIMITER;

        dvdAsText += aDvd.getMPAARating() + DELIMITER;

        dvdAsText += aDvd.getDirectorName() + DELIMITER;

        dvdAsText += aDvd.getStudio() + DELIMITER;

        dvdAsText += aDvd.getuserRatingOrNote();

        return dvdAsText;
    }

    private void loadDvd() throws DvdLibraryDaoException {
        Scanner scanner;

        try {
            // Create Scanner for reading the file
            scanner = new Scanner(
                    new BufferedReader(
                            new FileReader(DVD_FILE)));
        } catch (FileNotFoundException e) {
            throw new DvdLibraryDaoException(
                    "-_- Could not load roster data into memory.", e);
        }

        String currentLine;

        Dvd currentDvd;

        while (scanner.hasNextLine()) {

            currentLine = scanner.nextLine();

            currentDvd = unmarshallDvd(currentLine);

            dvds.put(currentDvd.getDvdTitle(), currentDvd);
        }
        scanner.close();
    }

    private Dvd unmarshallDvd(String dvdAsText) {

        String[] dvdTokens = dvdAsText.split(DELIMITER);

        String dvdTitle = dvdTokens[0];

        Dvd dvdFromFile = new Dvd(dvdTitle);

        dvdFromFile.setDvdReleaseDate(dvdTokens[1]);

        dvdFromFile.setMPAARating(dvdTokens[2]);

        dvdFromFile.setStudio(dvdTokens[3]);

        dvdFromFile.setDirectorName(dvdTokens[4]);

        dvdFromFile.setuserRatingOrNote(dvdTokens[5]);

        return dvdFromFile;
    }

    

}
