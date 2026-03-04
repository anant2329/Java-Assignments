package com.anant.subclasses;

public class Labour {
    private String labourName;
    private int age;
    private String town;
    private long contactNo;

    public String getLabourName() {
        return labourName;
    }

    public Labour(String labourName, int age, String town, long contactNo) {
        this.labourName = labourName;
        this.age = age;
        this.town = town;
        this.contactNo = contactNo;
    }
    public Labour() {
        this.labourName = "Unknown_name";
        this.town = "Unknown_town";
    }
    @Override
    public String toString() {
        return String.format("%-15s %-15d %-15s %-15d", labourName, age, town, contactNo);
    }
}
