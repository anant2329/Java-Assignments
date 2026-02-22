

import java.util.Scanner;
public class InputString {
    static String s1,s2,s3,s4,s5;
    static void inputString(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter s1 strings : ");
        s1 = sc.nextLine();
        System.out.print("Enter s2 strings : ");
        s2 = sc.nextLine();
        System.out.print("Enter s3 strings : ");
        s3 = sc.nextLine();
        System.out.print("Enter s4 strings : ");
        s4 = sc.nextLine();
        System.out.print("Enter s5 strings : ");
        s5 = sc.nextLine();

    }
    public static void main(String[] args) {
        inputString();

        System.out.println("Entered 5 strings are: ");
        for (int i =1; i <=5 ; i++ ){

            switch (i){
                case 1 : System.out.println(s1);
                break;
                case 2 : System.out.println(s2);
                break;
                case 3 : System.out.println(s3);
                break;
                case 4 : System.out.println(s4);
                break;
                case 5 : System.out.println(s5);
                break;
            }
        }
    }
    
}
