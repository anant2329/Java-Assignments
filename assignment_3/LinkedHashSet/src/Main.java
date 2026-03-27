import subclass.Vehicle;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== All Vehicles ===");
        Vehicle.printVehicles(Vehicle.myVehicles);

        System.out.println("\n=== Vehicles with Fuel Cap > 25L ===");
        Set<Vehicle> highFuel = Vehicle.getVehiclesFuelCapGreaterThan25();
        Vehicle.printVehicles(highFuel);


        System.out.println("\n=== Vehicles Sorted by Top Speed Ascending ===");
        List<Vehicle> sortedVehicles = Vehicle.getVehiclesSortedByTopSpeed();
        Vehicle.printVehiclesList(sortedVehicles);

        System.out.print("\nDo you want to add another vehicle? 1 for yes, 2 for no: ");
        int choice = sc.nextInt();
        sc.nextLine();
        while (choice == 1) {
            System.out.println("Enter vehicle details:");
            System.out.print("Vehicle ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Vehicle Name: ");
            String name = sc.nextLine();
            System.out.print("Top Speed: ");
            double speed = sc.nextDouble();
            System.out.print("Fuel Capacity: ");
            double fuel = sc.nextDouble();
            sc.nextLine();

            Vehicle.addVehicle(id, name, speed, fuel);

            System.out.print("Add another? 1 yes, 2 no: ");
            choice = sc.nextInt();
            sc.nextLine();
        }

        System.out.println("\n=== Updated Fuel Cap > 25L ===");
        highFuel = Vehicle.getVehiclesFuelCapGreaterThan25();
        Vehicle.printVehicles(highFuel);

        sc.close();
    }
}
