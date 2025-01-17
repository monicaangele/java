package unit2practice;
import java.util.Scanner;
public class Unit2practice {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 
		 boolean canVote = true;
		 
		 int num1 = 5;
		 int num2 = 10;
		 
		 if (num1 == num2) {
	            System.out.println("true");
	        } else {
	            System.out.println("false");
	        }
		 
		 int value1 = 300;
	     int value2 = 500;
	     
	     if (value1 > value2) {
	            System.out.println("value1 is larger");
	        } else if (value2 > value1) {
	            System.out.println("value2 is larger");
	        } else {
	            System.out.println("Both values are equal");
	        }
	     
	     int value3 = 455;
	     
	     if ((value1 < value3 && value3 < value2) || (value2 < value3 && value3 < value1)) {
	            System.out.println("value3 is in the middle");
	        } else {
	            System.out.println("value3 is not in the middle");
	        }
	     
	     int selection = 2;
	     
	     switch (selection) {
         case 1:
             System.out.println("The color is yellow");
             break;
         case 2:
             System.out.println("The color is blue");
             break;
         case 3:
             System.out.println("The color is red");
             break;
         default:
             System.out.println("The selection was invalid");
             break;
	}

}
}
