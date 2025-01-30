package project;

public class Main {

    public static void main(String[] args) {
        // Create a Slot object with a random fruit
        Project mySlot = new Project(); 

        // Print the slot's current fruit after spinning
        System.out.println("The slot has landed on: " + mySlot.toString());

        // Optionally, manually set a fruit and print it again
        mySlot.setFruit(Fruit.LEMON);
        System.out.println("Manually set the slot to: " + mySlot.toString());
    }
}
