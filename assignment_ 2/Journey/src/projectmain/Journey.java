package projectmain;

import projectmain.Vehicle.Bus;
import projectmain.Vehicle.Car;

public class Journey {
    public static void main(String[] args) {
        Car[] cars = {
                new Car("Honda City", "CG04AB1234", "Ramesh", 35, "Bhilai"),
                new Car("Maruti Swift", "CG04XY5678", "Suresh", 29, "Raipur"),
                new Car("Tata Nexon", "CG04PQ9012", "Mahesh", 42, "Durg")
        };
        cars[0].setTicketDetails(1001, "09/09/2026", 1500, 2);
        cars[1].setTicketDetails(1002, "10/09/2026", 145, 3);
        cars[2].setTicketDetails(1003, "11/09/2026", 200, 1);

        Bus[] buses = {
                new Bus("Volvo Express", "CG05AB4321", "Raipur Depot", "492001", "Ramesh", 40, "Raipur"),
                new Bus("Tata Starbus", "CG05XY8765", "Bhilai Depot", "490006", "Suresh", 35, "Bhilai")
        };
        buses[0].setTicketDetails(1004, "12/09/2026", 120, 4);
        buses[1].setTicketDetails(1005, "13/09/2026", 890, 2);

        for(Car car : cars){
            System.out.println(car);
        }
        for (Bus bus : buses) {
            System.out.println(bus);
        }
    }
}
