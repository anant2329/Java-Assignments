import java.util.Scanner;


public class ExpencesCalc {
    static float savingIncome(float salary, float phoneBill, float elecBill, float travelExp){
        float saving = salary -phoneBill - elecBill - travelExp ;

        return saving;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your income : ");
        float salary = sc.nextFloat();
        System.out.print("Enter Phone bill : ");
        float phoneBill = sc.nextFloat();
        System.out.print("Enter Elec. bill : ");
        float elecBill = sc.nextFloat();
        System.out.print("Enter travel expences : ");
        float travelExp = sc.nextFloat();

        float totalSaving = savingIncome(salary, phoneBill, elecBill, travelExp);
        System.out.println("Total saving this month : "+ totalSaving);

    }
    
}
