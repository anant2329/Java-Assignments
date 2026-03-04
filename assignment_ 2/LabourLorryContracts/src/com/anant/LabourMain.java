package com.anant;
import com.anant.subclasses.Labour;
import com.anant.subclasses.Lorry;
import com.anant.subclasses.Contracts;

public class LabourMain {
    public static void main(String[] args) {
        Labour[] labours = {
                new Labour("Ramesh", 30, "Bhilai", 9876543210L),
                new Labour("Suresh", 28, "Raipur", 9123456789L),
                new Labour("Mahesh", 35, "Durg", 9988776655L),
                new Labour("Naresh", 40, "Bilaspur", 9090909090L),
                new Labour()};

        Lorry [] lorrys = {
                new Lorry("Tata", "CG04AB1234", 10.5),
                new Lorry("Ashok Leyland", "CG05XY5678", 15.0),
                new Lorry("Mahindra", "CG06PQ4321", 8.2)};

        Contracts [] contracts = {
                new Contracts(101, "Mr. Sharma", labours[0], lorrys[0]),
                new Contracts(102, "Mr. Verma", labours[1], lorrys[1]),
                new Contracts(103, "Mr. Gupta", labours[2], lorrys[2]),
                new Contracts(104, "Mr. Singh", labours[3], lorrys[1]),
                new Contracts(), new Contracts()};

        System.out.println("Labour Details:");
        System.out.printf("%-15s %-15s %-15s %-15s%n", "Name", "Age", "Town", "Contact");
        for(Labour labour : labours){
            System.out.println(labour);
        }

        System.out.println("Lorry Details:");
        System.out.printf("%-20s %-20s %s%n", "NameOfLorry", "Vehicle No." , "Weight(Tons)");
        for(Lorry lorry : lorrys){
            System.out.println(lorry);
        }

        System.out.println("Contracts Details:");
        System.out.printf("%-15s %-20s %-20s %-15s %s%n", "ContractID", "Contract Person", "Labour", "Lorry", "Weight(Tons)");
        for(Contracts contract : contracts){
            System.out.println(contract);
        }
    }
}
