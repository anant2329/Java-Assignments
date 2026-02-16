
import java.util.Scanner;

public class MaximumAmong3 {
    public static int findMax(int a, int b, int c){
        int max = a;
        if (a>=b && a>=c){
            max = a;
        }
        else if (b>=a&& b>=c){
            max =b;
        }
        else {
            max = c;
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of a : ");
        int a = sc.nextInt();
        System.out.print("Enter value of b : ");
        int b = sc.nextInt();
        System.out.print("Enter value of c : ");
        int c = sc.nextInt();

        int max = findMax(a, b, c);
        System.out.println("Max value is: " +max);
        if(max==a) System.out.println(" A is greater");
        else if(max==b) System.out.println(" B is greater");
        else System.out.println(" C is greater");

    }
}
