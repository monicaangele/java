package unit1ex2;

import java.util.Scanner;

class ex2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the client's business name: ");
        String clientName = input.nextLine();

        System.out.print("Enter the total number of hours worked: ");
        double hoursWorked = input.nextDouble();

        double rate = 30.65;
        double totalAmount = hoursWorked * rate;

        System.out.println("\nBrianna Watt DBA Watt Gives");
        System.out.println("Invoice for " + clientName);
        System.out.println("Hours: " + hoursWorked);
        System.out.println("Rate: $" + rate);
        System.out.println("Total: $" + totalAmount);

	        input.close();
	    }
	}


