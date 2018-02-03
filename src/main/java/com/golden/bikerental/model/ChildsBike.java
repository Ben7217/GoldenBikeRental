package com.golden.bikerental.model;


import java.util.ArrayList;

public class ChildsBike extends Bike {

    public ChildsBike() {
        super();
    }

    public ChildsBike(String bikeType) {
        super(bikeType);
    }

    @Override
    public String getBikeType() {
        return super.getBikeType();
    }

    @Override
    public void setBikeType(String bikeType) {
        super.setBikeType(bikeType);
    }

    @Override
    public ArrayList<String> bikeList() {
        return super.bikeList();
    }

    @Override
    public boolean validate() {
        return super.validate();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
