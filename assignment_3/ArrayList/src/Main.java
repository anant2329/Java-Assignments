import subclass.Operations;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choice;
        Operations operations = new Operations();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("1. Add Value in ArrayList\n" +
                    "2. Show Values from ArrayList\n" +
                    "3. Show City Name which Begins with user input Character\n" +
                    "4. Search City\n" +
                    "5. Exit.\n" + "Enter your choice : ");
            choice = sc.nextInt();
            if (choice == 5) {
                System.out.println("Exit Successfully");
                break;
            }
            switch (choice) {
                case 1:
                    System.out.print("Enter City Name: ");
                    String cityName = sc.next();
                    operations.addCity(cityName);
                    break;
                case 2:
                    System.out.println(operations.getCities());
                    break;
                case 3:
                    System.out.print("Enter City name which Begins with Character : ");
                    String c = sc.next();
                    System.out.println(operations.getCityStartsWith(c));
                    break;
                case 4:
                    System.out.print("Enter City name To search : ");
                    String city = sc.next();
                    System.out.println(operations.searchCity(city));
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
