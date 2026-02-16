
import java.util.Scanner;

public class FiveDigit {
    static int [] processDigit (int num){
        int product = (num%10 * (num/10000)); //45147
        int last2 = Character.getNumericValue((num+"").charAt(3));
        int first2 = Character.getNumericValue((num+"").charAt(1) );
        int sum = last2 + first2;
        return new int [] {product, sum};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the five digit number : ");
        int digit = sc.nextInt();

        if (digit<10000 || digit> 99999 ){
            System.out.println("Enter only 5 digits...");
        }
        
        int [] result = processDigit(digit);

        System.out.println("Product of 1st and last digit : " + result[0]);
        System.out.println("Addition of 2nd and last 2nd digit : " + result[1]);
    }
}
