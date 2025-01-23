package unit3ex2;
import java.util.Scanner;
public class Unit3ex2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        
        System.out.print("Choose a number 100-999: ");
        int userNumber = scan.nextInt();
        
        if (userNumber < 100 || userNumber > 999) {
            System.out.println("Please enter a valid number between 100 and 999.");
        } else {
            for (int i = 13; i <= userNumber; i++) {
                if (i % 13 == 0) {
                    System.out.println(i);
                }
            }
        }
        
        scan.close();

	}

}
