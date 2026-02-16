/* Pizza App
   Problem Statement: Create a Java Application that simulates Pizza ordering system using
   switch case, enum and interactive menus
   1) Menus : show list of pizza (Margharita, Pepperoni), show available size(SMALL, MEDIUM, LARGE),
   		      show extra toppings (Cheese Burst, Olives, Jalapenos, Mushrooms)

   2) User Input: Let user choose pizza type, size and toppings
   3) Price Calculation: Assign base price for each pizza type, size. Show the extra cost for toppings
      and final bill

*/

/*
Interview Questions
1) When do think to check conditions using if else, else if ladder vs switch case?
2) What is exception? how java handles exception. give examples to explain exception and types
3) Explain when to use enumeration?


*/

import java.util.Scanner;

enum Size {
    SMALL,
    MEDIUM,
    LARGE
}
public class PizzaApp {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        int smallPrice = 199; 
        int mediumPrice = 299; 
        int largePrice = 399;
        int extraToppings = 30;
        int finalBill =0;
        
        System.out.println("""
            ********MENU********\n
                1. Fiery Inferno : A spicy delight topped with jalapenos, chili flakes, and hot sauce for those who love the heat.\n
                2. Garden Fresh : Loaded with colorful veggies like bell peppers, onions, olives, and mushrooms on a light tomato base.\n
                3. Cheesy Heaven : A four-cheese blend of mozzarella, cheddar, parmesan, and gouda that melts into pure indulgence.\n
                4. Mediterranean Magic : Featuring feta, olives, sun-dried tomatoes, and a drizzle of olive oil for a Greek-inspired flavor.\n
                5. BBQ Bliss : Smoky barbecue sauce with grilled chicken, onions, and cilantro for a sweet and tangy twist.\n
                6. Meat Lovers Feast : A hearty mix of pepperoni, sausage, ham, and bacon for carnivores who want it all.\n
                7. Tandoori Treat : Indian-inspired pizza with tandoori chicken, onions, and a hint of mint chutney.\n
                8. Tropical Paradise : Sweet pineapple paired with ham and mozzarella, bringing a Hawaiian vibe to your plate.\n
                9. Pesto Perfection : Basil pesto base topped with mozzarella, cherry tomatoes, and a sprinkle of parmesan.\n
                10. Classic Margherita : The timeless favorite with fresh mozzarella, basil leaves, and rich tomato sauce.\n
                           \n""" );
        System.out.print("Select your pizza by sequence : ");
        int selectedPizza = sc.nextInt();
        if(selectedPizza < 1 || selectedPizza >10 ){
            System.out.println("Selection is not valid");
            return;
        }
        System.out.println("""
            ********Available Size********
                1. Small   199/-
                2. Medimu  299/-
                3. Large   399/-
                """);
        System.out.print("Select the size [SMALL, MEDIUM, LARGE] : ");
        String pizzasize = sc.next().toUpperCase();
        System.out.println("""
            ********Extra Toppings********
                1. Caramelized Onions 
                2. Roasted Garlic
                3. Jalapeños or Chili Flakes 
                4. Sun-Dried Tomatoes 
                5. Fresh Basil or Arugula
                6. Extra Cheez
                7. Skip

                Charges Rs. 30/- For extra Toopings
                """);
        System.out.print("Select your extra Toppings : ");
        int pizzaToppings = sc.nextInt();

        Size size = Size.valueOf(pizzasize);
        switch (size) {
            case SMALL :
                finalBill+= smallPrice;
                break;
            case MEDIUM :
                finalBill+= mediumPrice;
                break;
            case LARGE :
                finalBill+=largePrice;
                break;
            default:
                System.out.println("Size is not applicable");    
        }

        if ((pizzaToppings >=1) && (pizzaToppings <=6)){
            finalBill+= extraToppings;
        }
        else if (pizzaToppings ==7){

        }
        else{
            System.out.println("Invalid Topping Selection");
            return;
        }

        System.out.println("FinalBill : "+ finalBill);
        System.out.println("Please wait for 15 mins your Pizza is preparing");
    }
    
}
