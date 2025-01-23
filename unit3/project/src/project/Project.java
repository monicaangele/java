package project;
import java.util.Scanner;
public class Project {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        
        System.out.println("Think of a number between 1 and 1000.");
        System.out.println("After each guess, respond with:");
        System.out.println("H for too high, L for too low, G for got it.");

        int low = 1;
        int high = 1000;
        int guess;
        int attempts = 0;
        String response = "";

        while (true) {
            guess = low + (high - low) / 2;
            System.out.println("Beep-Boop, is your number " + guess + "?");
            
            response = scanner.nextLine().trim().toUpperCase();

            if (response.equals("G")) {
                System.out.println("Got it in " + (attempts + 1) + " guesses!");
                break;
            } else if (response.equals("H")) {
                high = guess - 1; 
            } else if (response.equals("L")) {
                low = guess + 1;
            } else {
                System.out.println("Invalid response. Please enter H, L, or G.");
                continue;
            }

            attempts++;
            if (attempts >= 10) {
                System.out.println("I couldn't guess your number in 10 attempts. Please double-check your responses.");
                return;
            }
        }

        for (int i = 1; i <= guess; i++) {
            System.out.println(i + " Hip-hip-hooray!");
        }

        scanner.close();

	}

}
