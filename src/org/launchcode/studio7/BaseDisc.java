package org.launchcode.studio7;

public abstract class BaseDisc {
    private int yearReleased;
    private int runTime;
    private String genre;
    BaseDisc(){}

    BaseDisc(int yearReleased, int runTime, String genre) {
        this();
        this.yearReleased = yearReleased;
        this.runTime = runTime;
    }

    public int getYearReleased() {
        return yearReleased;
    }

    public int getRunTime() {
        return runTime;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

}
