package unit1ex1;
import java.util.Scanner;
public class unit1ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("Please enter your goal in number of sales: ");
        double total = input.nextDouble();

        System.out.print("How many days do you have to complete your goal? ");
        double days = input.nextDouble();

        double numberPerDay = total / days;

        System.out.println("You will need to make " + numberPerDay + " sales each day in order to reach your goal of " + total + " in " + days + " days");

        input.close();
	}

}