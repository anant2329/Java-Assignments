
import java.util.Scanner;


// WAP to print numbers matching the below condition criteria between m and n
//    a) number must be divisible by 5 but not by 3
//    b) if number begins and ends with same digit then ignore such numbers only if number is 2 more digits	


public class PrintNumberDivisibleBy5Not3{
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the value of M: ");
        int m = sc.nextInt();
        System.out.print("Enter the value of N: ");
        int n = sc.nextInt();

        while(m<=n){
            if (m>9 && ( Integer.parseInt(String.valueOf(m).charAt(0)+"")!=m%10)&& m%5==0 && m%3!= 0){
                System.out.print(m+" ");
            }
            m++;
        }

    }
}