package ex1;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        int number = 6;

        System.out.print("Guess a number between 1 and 10: ");

        int guess = Integer.parseInt(input.nextLine());

        if (guess > number) {
            System.out.println("Too high");
        } else if (guess == number) {
            System.out.println("You got it!");
        } else {
            System.out.println("Too low");
        }

	}

}
