package com.ps;

public class Dealership {

    static String name;
    static String address;
    static String phone;

    public Dealership(String name, String address, String phone) {
        Dealership.name = name;
        Dealership.address = address;
        Dealership.phone = phone;

    }
    public static String getName() {
        return name;
    }

    public static String getAddress() {
        return address;
    }

    public static String getPhone() {
        return phone;
    }


}
