package subclass;

import java.util.*;

public class Vehicle implements Comparable<Vehicle> {
    private int vehicleID;
    private String vehicleName;
    private double topSpeed;
    private double fuelCapacity;

    public Vehicle() {}

    public Vehicle(int vehicleID, String vehicleName, double topSpeed, double fuelCapacity) {
        this.vehicleID = vehicleID;
        this.vehicleName = vehicleName;
        this.topSpeed = topSpeed;
        this.fuelCapacity = fuelCapacity;
    }

    public static Set<Vehicle> myVehicles = new LinkedHashSet<>(Arrays.asList(
            new Vehicle(101, "BMW", 230, 12.5),
            new Vehicle(102, "Audi", 220, 38.0),
            new Vehicle(103, "Mercedes", 240, 42.3),
            new Vehicle(104, "Tesla", 250, 0.0),
            new Vehicle(105, "Toyota", 180, 14.7),
            new Vehicle(106, "Honda", 175, 33.2),
            new Vehicle(107, "Ford", 200, 36.8),
            new Vehicle(108, "Chevrolet", 195, 34.5),
            new Vehicle(109, "Nissan", 185, 32.9),
            new Vehicle(110, "Kia", 170, 31.4)
    ));

    @Override
    public String toString() {
        return "Vehicle{vehicleID=" + vehicleID + ", vehicleName='" + vehicleName + "', " +
                "topSpeed=" + topSpeed + ", fuelCapacity=" + fuelCapacity + '}';
    }

    public static Set<Vehicle> getVehiclesFuelCapGreaterThan25() {
        Set<Vehicle> subset = new LinkedHashSet<>();
        for (Vehicle v : myVehicles) {
            if (v.fuelCapacity > 25) {
                subset.add(v);
            }
        }
        return subset;
    }

    public static List<Vehicle> getVehiclesSortedByTopSpeed() {
        List<Vehicle> sorted = new ArrayList<>(myVehicles);
        sorted.sort(Comparator.comparingDouble(v -> v.topSpeed));
        return sorted;
    }

    public static void printVehicles(Set<Vehicle> vehicles) {
        for (Vehicle v : vehicles) {
            System.out.println(v);
        }
    }

    public static void printVehiclesList(List<Vehicle> vehicles) {
        for (Vehicle v : vehicles) {
            System.out.println(v);
        }
    }

    public static void addVehicle(int vehicleID, String vehicleName, double topSpeed, double fuelCapacity) {
        myVehicles.add(new Vehicle(vehicleID, vehicleName, topSpeed, fuelCapacity));
    }

    public double getFuelCapacity() {
        return fuelCapacity;
    }

    public double getTopSpeed() {
        return topSpeed;
    }

    @Override
    public int compareTo(Vehicle other) {
        return Double.compare(this.topSpeed, other.topSpeed);
    }
}
