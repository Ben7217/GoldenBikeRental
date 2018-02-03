package com.golden.bikerental.services;

import com.golden.bikerental.model.Bike;

public class BikeServiceImpl implements IBikeService{

    private Bike bike;

    BikeServiceImpl(String bikeType) {
        this.bike = new Bike(bikeType);
    }

    @Override
    public Bike getBike() {
        return bike;
    }
}

