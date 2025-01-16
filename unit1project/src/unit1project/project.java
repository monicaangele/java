package unit1project;
import java.util.Scanner;
public class project {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your name: ");
		String name = input.nextLine();
		System.out.println("Enter your first initial: ");
		char firstInitial = input.next().charAt(0);
		System.out.println("Enter your last inital: ");
		char lastInitial = input.next().charAt(0);
		System.out.println("Enter a number: ");
		int num1 = input.nextInt();
		System.out.println("Enter another number: ");
		int num2 = input.nextInt();
		
		System.out.println(name + " " + firstInitial + lastInitial);
		System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
		System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
		System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
		System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
		
		input.close();
	}
}
