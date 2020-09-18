/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.dvdlibrary.ui;

import com.sg.dvdlibrary.dto.Dvd;
import java.util.List;

/**
 *
 * @author Maxka
 */
public class DvdLibraryView {

    private UserIO io;

    public DvdLibraryView(UserIO io) {
        this.io = io;
    }

    public int printMenuAndGetSelection() {
        io.print("Main Menu");
        io.print("1. List Dvds");
        io.print("2. Add New Dvd");
        io.print("3. View a Dvd");
        io.print("4. Remove a Dvd");
        io.print("5. Edit a Dvd");
        io.print("6. Exit");

        return io.readInt("Please select from the above choices.", 1, 6);
    }

    public void displayCreateDvdBanner() {
        io.print("=== Add Dvd ===");
    }

    public Dvd getNewDvdInfo() {
        String dvdTitle = io.readString("Please enter Dvd Title");
        String dvdReleaseDate = io.readString("Please enter release date");
        String MPAARating = io.readString("Please enter MPAA rating");
        String directorName = io.readString("Please enter Director's name");
        String studio = io.readString("Please enter studio");
        String userRatingOrNote = io.readString("Please enter rating or note");
        Dvd currentDvd = new Dvd(dvdTitle);
        currentDvd.setDvdReleaseDate(dvdReleaseDate);
        currentDvd.setMPAARating(MPAARating);
        currentDvd.setDirectorName(directorName);
        currentDvd.setStudio(studio);
        currentDvd.setuserRatingOrNote(userRatingOrNote);
        return currentDvd;
    }

    public void displayCreateSuccessBanner() {
        io.readString(
                "Dvd successfully added.  Please hit enter to continue");
    }

    public void displayDisplayAllBanner() {
        io.print("=== Display All Dvds ===");
    }

    public void displayDisplayDvdBanner() {
        io.print("=== Display Dvd ===");
    }

    public String getDvdTitleChoice() {
        return io.readString("Please enter the Dvd Title.");
    }

    public void displayDvd(Dvd Dvd) {
        if (Dvd != null) {
            io.print(Dvd.getDvdTitle());
            io.print(Dvd.getDvdReleaseDate());
            io.print(Dvd.getMPAARating());
            io.print(Dvd.getDirectorName());
            io.print(Dvd.getStudio());
            io.print(Dvd.getuserRatingOrNote());
            io.print("");
        } else {
            io.print("No such Dvd.");
        }
        io.readString("Please hit enter to continue.");
    }

    public void displayDvdList(List<Dvd> dvdList) {
        for (Dvd currentDvd : dvdList) {
            String dvdInfo = String.format("#%s : %s %s",
                    currentDvd.getDvdTitle(),
                    currentDvd.getDvdReleaseDate(),
                    currentDvd.getMPAARating());
            io.print(dvdInfo);
        }
        io.readString("Please hit enter to continue.");
    }

    public void displayRemoveDvdBanner() {
        io.print("=== Remove Dvd ===");
    }

    public void displayRemoveResult(Dvd dvdRecord) {
        if (dvdRecord != null) {
            io.print("Dvd successfully removed.");
        } else {
            io.print("No such Dvd.");
        }
        io.readString("Please hit enter to continue.");
    }
    
    public void displayEditDvdBanner() {
        io.print("=== Edit Dvd ===");
    }

    public void displayExitBanner() {
        io.print("Good Bye!!!");
    }

    public void displayUnknownCommandBanner() {
        io.print("Unknown Command!!!");
    }

    public void displayErrorMessage(String message) {
        io.print(message);
    }
}
