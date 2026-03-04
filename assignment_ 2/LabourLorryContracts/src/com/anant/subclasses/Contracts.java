package com.anant.subclasses;

public class Contracts {
    private int contractID;
    private String contractPersonName;
    private Labour labour;
    private Lorry lorry;


    public Contracts(int contractID, String contractPersonName, Labour labour, Lorry lorry) {
        this.contractPersonName = contractPersonName;
        this.contractID = contractID;
        this.labour = labour;
        this.lorry = lorry;
    }
    public Contracts() {
        this.labour = new Labour();
        this.lorry = new Lorry();
        this.contractPersonName= "Unknown";
    }
    @Override
    public String toString() {
        return String.format("%-15d %-20s %-20s %-15s %.2f ",contractID,contractPersonName,labour.getLabourName(),lorry.getLorryName(),lorry.getGoodsWeightInTons());
    }
}
