
import java.util.Scanner;

public class Percentage{
    static String determineGrade(float percentage){
        if(percentage > 100 || percentage <0){
            return "Enter the vaild percentage...";
        }

        if (percentage> 75){
            return "Distinction";
        }
        else if (percentage>60 && percentage<=75){
            return "First Class";
        }
        else if (percentage>50 && percentage<=60){
            return "Second Class";
        }
        else if (percentage>40 && percentage<=50){
            return "PASS";
        }
        else return "FAIL";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your percentage : ");
        float percentage = sc.nextFloat();
        System.out.println(determineGrade(percentage));
        
    }
}