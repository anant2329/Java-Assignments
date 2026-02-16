// Q1. WAP to input any number and check whether a number is armstrong number or not?
//    eg. number=153  then 1*1*1 + 5*5*5 + 3*3*3 is again a same number.

import java.util.Scanner;


public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int result =0;
        int count =0;
        int temp = num;

        while(temp!=0){
            count++;
            temp/=10;
        }

        temp = num;

        while(temp!= 0){
            int digit = temp%10;
            result += Math.pow(digit, count);
            temp/=10;
        }

        System.out.println("Input num: "+num);
        System.out.println("result: "+result);
        if(result == num){
            System.out.println("Armstrong Number");
        }
        else{
            System.out.println("Not a Armstrong Number");
        }
    }
}
