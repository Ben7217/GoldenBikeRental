package com.golden.bikerental.services;

import org.jetbrains.annotations.NotNull;

public class BikeServiceFactory {

    private BikeServiceFactory(){}

    @NotNull
    public static IBikeService usersBikeChoice(String bikeType) {
        return new BikeServiceImpl(bikeType);


    }
}
