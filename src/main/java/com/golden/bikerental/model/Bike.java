package com.golden.bikerental.model;

import java.util.ArrayList;

public class Bike {

    public static final String highEnd = "High-End Adventure Performance";
    public static final String moderateAdventure = "Moderate Adventure Comfort";
    public static final String childsBike = "Bikes for Children";
    public static final String specialNeeds = "Special Needs Bikes";

    private String bikeType;


    public Bike(){}

    public Bike(String bikeType) {
        this.bikeType = bikeType;
    }

    public String getBikeType() {
        return bikeType;
    }

    public void setBikeType(String bikeType) {
        this.bikeType = bikeType;
    }
    public static ArrayList<String> bikeList() {
        ArrayList<String> availableBikes = new ArrayList<>();

        availableBikes.add(Bike.highEnd);
        availableBikes.add(Bike.moderateAdventure);
        availableBikes.add(Bike.childsBike);
        availableBikes.add(Bike.specialNeeds);

        return availableBikes;

    }

    public boolean validate ()
    {
        if (bikeType == null) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return
                bikeType;
    }
}
