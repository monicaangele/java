package project;
import java.util.Scanner;
public class Project {

	public static void main(String[] args) {
		        Scanner input = new Scanner(System.in);

		        double yogurtPrice = 1.00;
		        double tomatoPrice = 0.50;
		        double lettucePrice = 0.30;
		        double skittlesPrice = 0.75;

		        double totalToppingsCost = 0.0;

		        System.out.print("Please enter first topping: ");
		        String topping1 = input.nextLine().toLowerCase();
		        
		        System.out.print("Please enter second topping: ");
		        String topping2 = input.nextLine().toLowerCase();
		        
		        System.out.print("Please enter third topping: ");
		        String topping3 = input.nextLine().toLowerCase();

		        if (topping1.equals("yogurt")) {
		            totalToppingsCost += yogurtPrice;
		        } else if (topping1.equals("tomato")) {
		            totalToppingsCost += tomatoPrice;
		        } else if (topping1.equals("lettuce")) {
		            totalToppingsCost += lettucePrice;
		        } else if (topping1.equals("skittles")) {
		            totalToppingsCost += skittlesPrice;
		        }

		        if (topping2.equals("yogurt")) {
		            totalToppingsCost += yogurtPrice;
		        } else if (topping2.equals("tomato")) {
		            totalToppingsCost += tomatoPrice;
		        } else if (topping2.equals("lettuce")) {
		            totalToppingsCost += lettucePrice;
		        } else if (topping2.equals("skittles")) {
		            totalToppingsCost += skittlesPrice;
		        }

		        if (topping3.equals("yogurt")) {
		            totalToppingsCost += yogurtPrice;
		        } else if (topping3.equals("tomato")) {
		            totalToppingsCost += tomatoPrice;
		        } else if (topping3.equals("lettuce")) {
		            totalToppingsCost += lettucePrice;
		        } else if (topping3.equals("skittles")) {
		            totalToppingsCost += skittlesPrice;
		        }

		        System.out.printf("Your toppings cost $%.2f\n", totalToppingsCost);

		        double discount = 0.0;
		        if (totalToppingsCost >= 1.00) {
		            discount = totalToppingsCost * 0.10;
		            System.out.printf("You saved $%.2f!\n", discount);
		        }

		        double totalCost = totalToppingsCost - discount;
		        System.out.printf("Your total is $%.2f\n", totalCost);
		  

	}

}
