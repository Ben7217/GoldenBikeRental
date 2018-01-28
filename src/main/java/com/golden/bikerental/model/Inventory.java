package com.golden.bikerental.model;

public class Inventory {

    private int childsBikeStock = 3;
    private int highEndStock = 0;
    private int specialNeedsStock = 2;
    private int moderateAdventureStock = 1;

    public int currentStock(String bikeType) {
       if(bikeType.equals(Bike.childsBike)) {
           return childsBikeStock;
       }
       if(bikeType.equals(Bike.highEnd)) {
           return highEndStock;
       }
       if(bikeType.equals(Bike.specialNeeds)) {
           return specialNeedsStock;
       }
       if(bikeType.equals(Bike.moderateAdventure)) {
           return moderateAdventureStock;
       }
       else {
           return 0;
       }
    }

    public int checkOutBike(String bikeType) {
        if(bikeType.equals(Bike.childsBike)) {
            return childsBikeStock--;
        }
        if(bikeType.equals(Bike.highEnd)) {
            return highEndStock--;
        }
        if(bikeType.equals(Bike.specialNeeds)) {
            return specialNeedsStock--;
        }
        if(bikeType.equals(Bike.moderateAdventure)) {
            return moderateAdventureStock--;
        }
        else {
            return 0;
        }
    }

}
