package projectmain.Vehicle;

import projectmain.Ticket.Ticket;

public class Car implements Ticket, Driver, Efficiency{
    private String carName;
    private String carNo;
    private String driverName;
    private int age;
    private String driverCity;
    private int ticketNo;
    private String ticketDate;
    private float distance;
    private int qtys;

    public Car(String carName, String carNo, String driverName, int age, String driverCity) {
        this.carName = carName;
        this.carNo = carNo;
        this.driverName = driverName;
        this.age = age;
        this.driverCity = driverCity;
    }

    @Override
    public void setTicketDetails(int ticketNo, String date, float distance, int qtys) {
        this.ticketNo = ticketNo;
        this.ticketDate = date;
        this.distance = distance;
        this.qtys = qtys;
    }

    @Override
    public float calculateTicketPrice() {
        return distance*qtys*price;
    }

    @Override
    public String getDriverName() {
        return driverName;
    }

    @Override
    public int getDriverAge() {
        return age;
    }

    @Override
    public String getDriverCity() {
        return driverCity;
    }

    @Override
    public String getVehicleName() {
        return carName;
    }

    @Override
    public String getVehicleNumber() {
        return carNo;
    }
    @Override
    public String toString (){
        return String.format("Car Name = %s \tCar No. = %s \tDriver Name = %s%n" +
                "Ticket No. = %d \tTicket Date = %s \tPassenger = %d\tDistance = %.2f%n" +
                "[========Price per Km = %.2f========     ========Total Bill Amount = %.2f========]%n%n",
                carName, carNo, driverName, ticketNo, ticketDate, qtys, distance, price, calculateTicketPrice());
    }
}
