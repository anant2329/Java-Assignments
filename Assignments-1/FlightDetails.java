
import java.util.Scanner;

public class FlightDetails {
    static float  calculateAmount(float cost, int noSeat){

        float totalCost = cost * noSeat;
        return totalCost;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of flight : ");
        String flightName = sc.nextLine();
        System.out.print("Enter the cost of Tickets : ");
        float ticketCost = sc.nextFloat();
        System.out.print("Enter the no. Seats : ");
        int numOfSeats = sc.nextInt();

        float details = calculateAmount(ticketCost, numOfSeats);
        System.out.println("Flight name : "+ flightName + "\nTotal Amount : "+ details);

    }
    
}
