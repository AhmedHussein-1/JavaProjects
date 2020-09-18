/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.dvdlibrary.dto;

/**
 *
 * @author Maxka
 */
public class Dvd {

    private String dvdTitle;
    private String dvdReleaseDate;
    private String MPAARating;
    private String directorName;
    private String Studio;
    private String userRatingOrNote;

    public Dvd(String dvdTitle) {
        this.dvdTitle = dvdTitle;
    }

    public String getDvdReleaseDate() {
        return dvdReleaseDate;
    }

    public void setDvdReleaseDate(String dvdReleaseDate) {
        this.dvdReleaseDate = dvdReleaseDate;
    }

    public String getMPAARating() {
        return MPAARating;
    }

    public void setMPAARating(String MPAARating) {
        this.MPAARating = MPAARating;
    }

    public String getDirectorName() {
        return directorName;
    }

    public void setDirectorName(String DirectorName) {
        this.directorName = DirectorName;
    }

    public String getDvdTitle() {
        return dvdTitle;
    }

    public String getStudio() {
        return Studio;
    }

    public void setStudio(String Studio) {
        this.Studio = Studio;
    }

    public String getuserRatingOrNote() {
        return userRatingOrNote;
    }

    public void setuserRatingOrNote(String userRatingOrNote) {
        this.userRatingOrNote = userRatingOrNote;
    }
}
