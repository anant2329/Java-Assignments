package com.anant.subclasses;

public class Lorry {
    private String lorryName;
    private String vehicleNo;
    private double goodsWeightInTons;

    public String getLorryName() {
        return lorryName;
    }

    public double getGoodsWeightInTons() {
        return goodsWeightInTons;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public Lorry(String lorryName, String vehicleNo, double goodsWeightInTons) {
        this.vehicleNo = vehicleNo;
        this.lorryName = lorryName;
        this.goodsWeightInTons = goodsWeightInTons;
    }
    public Lorry (){
        this.lorryName = "Unknown_name";
        this.vehicleNo = "Unknown_vehicle_no";
    }
    @Override
    public String toString(){
        return String.format("%-20s %-20s %.2f",lorryName, vehicleNo, goodsWeightInTons);
    }
}
