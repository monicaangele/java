package SlotMachine;

public class Slot {
    private String fruit;

    // Constructor to initialize the fruit in the slot
    public Slot(String fruit) {
        this.fruit = fruit;
    }

    // Getter for fruit
    public String getFruit() {
        return fruit;
    }

    // Setter for fruit
    public void setFruit(String fruit) {
        this.fruit = fruit;
    }

    // Method to randomly set the fruit to one of several options
    public void spin() {
        String[] fruits = {"orange", "lemon", "cherry", "apple", "banana"};
        int randomIndex = (int) (Math.random() * fruits.length);
        this.fruit = fruits[randomIndex];
    }

    @Override
    public String toString() {
        return fruit;
    }
}


