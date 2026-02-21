

// Q3. WAP to input any number and print addition of all digits

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the digit: ");
        int digit = sc.nextInt();
        int result =0;

        while(digit!=0){
            result += digit%10;
            digit/=10;
        }
        System.out.print("Sum of the digit is: "+ result);
    }    
}
