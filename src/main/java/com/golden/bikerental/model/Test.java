package com.golden.bikerental.model;


import com.golden.bikerental.services.BikeServiceFactory;
import com.golden.bikerental.services.IBikeService;
import java.util.ArrayList;
import java.util.Scanner;

public class Test {

    private Bike bike;
    public static void main(String[] args) {



        String userInput;

        Scanner scanner = new Scanner(System.in);

        Test test = new Test();

        IBikeService customerBike;

        ArrayList<Bike> savedBikes = new ArrayList<>();

        for (int i = 0; i <= 4; i++) {
            System.out.println("Please enter a choice for the type of bike you would like: \n\nPlease type 1 for childs bike. " +
                    "\nPlease type 2 for Moderate Comfort. \nPlease type 3 for High end. \nPlease type 4 for Special needs. \n");

            userInput = scanner.nextLine();


            String userChoice = "";

            if (userInput.equals("1")) {
                userChoice = Bike.childsBike;
            }
            if (userInput.equals("2")) {
                userChoice = Bike.moderateAdventure;
            }
            if (userInput.equals("3")) {
                userChoice = Bike.highEnd;
            }
            if (userInput.equals("4")) {
                userChoice = Bike.specialNeeds;
            }

            System.out.println("Great! You choose the " + userChoice + ".");


           customerBike =  BikeServiceFactory.usersBikeChoice(userChoice);


            System.out.println("Saving your " + userChoice + " bike. \n\n ");

            savedBikes.add(customerBike.getBike());


        }
        System.out.println("You choose these bikes: ");
        for(Bike bike : savedBikes) {
            System.out.println(bike);
        }


    }


}
