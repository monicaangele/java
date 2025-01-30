package project;
import java.util.Random;

public class Project {
    // Instance variable for the fruit type (enum)
    private Fruit fruit;

    // Constructor to initialize the slot with a specific fruit
    public Project(Fruit fruit) {
        this.fruit = fruit;
    }

    // Default constructor (if you want to initialize with a random fruit initially)
    public Project() {
        spin(); // Automatically spins to set a random fruit
    }

    // toString method to return the fruit as a string
    @Override
    public String toString() {
        return fruit.toString(); // This will return the name of the fruit
    }

    // Spin method to set a random fruit
    public void spin() {
        Random rand = new Random();
        Fruit[] fruits = Fruit.values();  // Get all enum values
        this.fruit = fruits[rand.nextInt(fruits.length)]; // Randomly set the fruit
    }

    // Getter method for the fruit
    public Fruit getFruit() {
        return fruit;
    }

    // Setter method for the fruit
    public void setFruit(Fruit fruit) {
        this.fruit = fruit;
    }
}
