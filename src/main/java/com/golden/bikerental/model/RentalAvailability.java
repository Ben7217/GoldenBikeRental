package com.golden.bikerental.model;

import java.util.ArrayList;

public class RentalAvailability {


    private String bikeType;
    private boolean available;

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String getBikeType() {
        return bikeType;
    }

    public void setBikeType(String bikeType) {
        this.bikeType = bikeType;
    }





    @Override
    public String toString() {
        return "RentalAvailability{" +
                "bikeType='" + bikeType + '\'' +
                ", available=" + available +
                '}';
    }
}
