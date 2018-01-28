package com.golden.bikerental.model;

public class RentalApp {

    public static void main(String[] args) {


        Bike customerBike = new Bike();
        Inventory inventory = new Inventory();
        RentalAvailability rentalAvailability = new RentalAvailability();
        Address benAddress = new Address("1234 Sesame St.", "Tvville", "CA", "90210");
        Customer customerBen = new Customer("Ben", "30", benAddress, "2017-01-27 9:00 AM");
        String availability = "";


        System.out.println(customerBen);

        customerBike.setBikeType(Bike.moderateAdventure);
        System.out.println(inventory.currentStock(customerBike.getBikeType()));











//        customerBike.setBikeType(Bike.highEnd);
//
//
//        if(inventory.currentStock(customerBike.getBikeType()) <= 0) {
//            availability += "Sorry we are out of that bike!";
//            rentalAvailability.setAvailable(false);
//        } else {
//            availability += "We have that bike in stock!";
//            rentalAvailability.setAvailable(true);
//        }
//
//        System.out.println("You chose " + customerBike + " Available? " + availability + " We have " +
//        inventory.currentStock(customerBike.getBikeType()) + " in stock.");
//
//        System.out.println("You are reserving the " + customerBike + ".");
//
//        if(inventory.currentStock(customerBike.getBikeType()) > 0)
//        inventory.checkOutBike(customerBike.getBikeType());
//
//        System.out.println("We have " + inventory.currentStock(customerBike.getBikeType()) + " " + customerBike + " left.");





    }



}
