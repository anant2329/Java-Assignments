
import java.util.Scanner;

public class Palandrom {
    static boolean isPalindrome (int num){//121
        int temp = num;
        int reverse = 0;
        
        while(temp!=0){
            reverse = reverse*10 + (temp%10);
            temp/=10;
        }
        if (num == reverse){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        System.out.println(isPalindrome(num));
    }
}
