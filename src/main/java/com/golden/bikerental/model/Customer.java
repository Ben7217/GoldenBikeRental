package com.golden.bikerental.model;

public class Customer {

    private String name;
    private String age;
    private Address address;
    private String rentalDateandTime;

    public Customer(String name, String age, Address address, String rentalDateandTime) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.rentalDateandTime = rentalDateandTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getRentalDateandTime() {
        return rentalDateandTime;
    }

    public void setRentalDateandTime(String rentalDateandTime) {
        this.rentalDateandTime = rentalDateandTime;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", address=" + address +
                ", rentalDateandTime='" + rentalDateandTime + '\'' +
                '}';
    }
}
