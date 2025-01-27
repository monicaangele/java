package project;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class Project {

	public static void main(String[] args) {
		 String[] adjectives = {"shiny", "hot", "hairy", "yellow", "fast", "bright", "smooth", "cold"};
	     String[] nounIdeas = {"thought", "prayer", "knowledge", "life", "travel", "emotion", "idea", "boredom"};
	     String[] nounObjects = {"plant", "wig", "repellant", "trap", "car", "brick", "pumpkin", "snow"};
	     
	     Scanner scanner = new Scanner(System.in);
	     System.out.print("How many product names do you want? ");
	     int numProducts = scanner.nextInt();
	     
	     Random random = new Random();
	        ArrayList<String> productNames = new ArrayList<>();

	        for (int i = 0; i < numProducts; i++) {
	            String randomAdjective = adjectives[random.nextInt(adjectives.length)];
	            String randomNounIdea = nounIdeas[random.nextInt(nounIdeas.length)];
	            String randomNounObject = nounObjects[random.nextInt(nounObjects.length)];

	            String productName = randomAdjective + " " + randomNounIdea + " " + randomNounObject;
	            productNames.add(productName);
	        }

	        // Step 4: Output the product names
	        System.out.println("The generated products:");
	        System.out.println("-------------------------");
	        for (int i = 0; i < productNames.size(); i++) {
	            System.out.println((i + 1) + ". " + productNames.get(i));
	        }

	        scanner.close();


	}

}
