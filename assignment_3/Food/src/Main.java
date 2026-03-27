import java.util.*;

class Food {
    public String product_name;
    public double unit_price;
    public int issued_qtys;

    public Food(String product_name, double unit_price, int issued_qtys) {
        this.product_name = product_name;
        this.unit_price = unit_price;
        this.issued_qtys = issued_qtys;
    }


    public void showFood() {
        double total = unit_price * issued_qtys;
        System.out.printf("%-15s | ₹%-8.2f | %4d | ₹%-8.2f%n",
                product_name, unit_price, issued_qtys, total);
    }

    public double getTotalAmount() {
        return unit_price * issued_qtys;
    }
}

public class Main {
    public static void main(String[] args) {

        Vector<Food> dailySales = new Vector<>();

        dailySales.add(new Food("Idli", 20.0, 50));
        dailySales.add(new Food("Dosa", 35.0, 40));
        dailySales.add(new Food("Vada", 15.0, 60));
        dailySales.add(new Food("Pongal", 45.0, 25));
        dailySales.add(new Food("Upma", 25.0, 35));
        dailySales.add(new Food("Poori", 40.0, 30));

        System.out.println("=== FOOD STALL DAILY SALES REPORT ===");
        System.out.println("Product         | Unit Price | Qty  | Total");
        System.out.println("----------------------------------------");


        double grandTotalAmount = 0;
        int grandTotalQty = 0;
        for (Food food : dailySales) {
            food.showFood();
            grandTotalAmount += food.getTotalAmount();
            grandTotalQty += food.issued_qtys;
        }


        dailySales.sort((a, b) -> Integer.compare(b.issued_qtys, a.issued_qtys));
        Stack<Food> salesStack = new Stack<>();
        for (Food food : dailySales) {
            salesStack.push(food);
        }

        System.out.println("\n=== STACK: Top Sales by Qty (Descending) ===");
        System.out.println("Product         | Unit Price | Qty  | Total");
        System.out.println("----------------------------------------");
        while (!salesStack.empty()) {
            Food topFood = salesStack.pop();
            topFood.showFood();
        }

        System.out.println("=========================================");
        System.out.printf("TOTAL QTY ISSUED: %d units%n", grandTotalQty);
        System.out.printf("TOTAL AMOUNT COLLECTED: ₹%.2f%n", grandTotalAmount);
        System.out.println("=========================================");
    }
}
