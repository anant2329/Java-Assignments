import java.util.Scanner;
public class ElegibilityCheckLoan {
    static String checkLoanEligibility(int age, float amount) {
    String details;

    if (age > 50 && amount <= 500000) {
        details = "You are eligible for a maximum loan up to 5 Lakhs"+ "\nYour Amount : " + amount;
    } 
    else if (age <= 50 && age > 30 && amount <= 300000) {
        details = "You are eligible for a maximum loan up to 3 Lakhs"+ "\nYour Amount : " + amount;
    } 
    else if (age <= 30 && age > 20 && amount <= 200000) {
        details = "You are eligible for a maximum loan up to 2 Lakhs"+ "\nYour Amount : " + amount;
    } 
    else if (age <= 20) {
        details = "Not eligible for loan";
    } 
    else {
        details = "Loan eligibility criteria not match";
    }

    return details;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter your age : ");
        int age = sc.nextInt();
        System.out.print("Enter the loan amount : ");
        float amount = sc.nextFloat();

        String elegible = checkLoanEligibility(age, amount);

        System.out.println(elegible);
    }
    
}
