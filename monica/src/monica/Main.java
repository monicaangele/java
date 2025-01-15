/**
 * 
 */
package monica;

import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myObj = new Scanner(System.in);
	    String name;
	    name = "monica";
	    int age;
	    age = 17;
	    char theCharacter;
	    theCharacter = 'l';
	    double interestRate = 8;
	    

	    System.out.println(name);
	    System.out.println(age);
	    System.out.println(theCharacter);
	    System.out.println(interestRate);
	    
	    System.out.println("Enter your name: ");
	    String theName = myObj.nextLine();
	    System.out.println(theName);

	    System.out.println("Enter a value: ");
	    int userInput = myObj.nextInt();
	    System.out.println(userInput);
	    
	    System.out.println("Enter your age: ");
	    int theAge = myObj.nextInt();
	    System.out.println(theAge);
	    
	    int blinks = 200;
	    int minutes = 7;
	    double blinksPerMinute = blinks / minutes;
	    System.out.println("blinks per minute is " + blinksPerMinute);
	    System.out.println("Enter a decimal value:");
	    double accountBalance = myObj.nextDouble();
	    
	    System.out.printf("Account: $%.2f\n", accountBalance);
	    
	    myObj.close();
	}

}
