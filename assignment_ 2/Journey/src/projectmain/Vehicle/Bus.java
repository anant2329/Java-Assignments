package projectmain.Vehicle;

import projectmain.Ticket.Ticket;

public class Bus implements Ticket, Driver, Efficiency {
    private String busName;
    private String busNo;
    private String depotCity;
    private String pincode;
    private String driverName;
    private int age;
    private String driverCity;
    private int ticketNo;
    private String ticketDate;
    private float distance;
    private int qtys;

    public Bus(String busName, String busNo, String depotCity, String pincode,
               String driverName, int age, String driverCity) {
        this.busName = busName;
        this.busNo = busNo;
        this.depotCity = depotCity;
        this.pincode = pincode;
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
        return busName;
    }

    @Override
    public String getVehicleNumber() {
        return busNo;
    }
    @Override
    public String toString(){
        return String.format("Bus Name = %s \tBus No. = %s \tDeport City = %s \tDriver Name = %s%n" +
                        "Ticket No. = %d \tTicket Date = %s \tPassenger = %d\tDistance = %.2f%n" +
                        "[========Price per Km = %.2f========     ========Total Bill Amount = %.2f========]%n%n",
                busName, busNo, depotCity, driverName, ticketNo, ticketDate, qtys, distance, price, calculateTicketPrice());
    }
}
