
//  Q2. WAP to input nth value. print fibonancii series
//    eg.  n=100   then output = 0 1 1 2 3 5 8 13 21 34 55 ...   so on.

import java.util.Scanner;

public class FibonaciSeries {
    public static void main(String []args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the value: ");
        int n = sc.nextInt();
        long first =0;
        long second = 1;
        System.out.print(first+" "+second);

        for(int i =3; i<=n; i++){
            long next = first +second;
            System.out.print(" "+ next);
            first = second;
            second = next; 
        }
    }
}
