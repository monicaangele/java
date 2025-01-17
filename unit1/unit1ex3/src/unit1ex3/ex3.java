package unit1ex3;
import java.util.Scanner;
public class ex3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the length of the room: ");
		double length = input.nextDouble();
		
		System.out.println("Enter the width of the room: ");
		double width = input.nextDouble();
		
		System.out.println("Enter the cost per squart ft of tile: ");
		double cost = input.nextDouble();
		
		double area = length * width;
		
		double price = area * cost;
		
		System.out.println("The room is " + area + " square feet.");
		System.out.println("At $" + cost + " per square foot. it will cost $" + price + " to tile it");

	}

}
