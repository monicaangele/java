package SlotMachine;

public class Slot {
    private String fruit;

    public Slot(String fruit) {
        this.fruit = fruit;
    }

    public String getFruit() {
        return fruit;
    }

    public void setFruit(String fruit) {
        this.fruit = fruit;
    }

    public void spin() {
        String[] fruits = {"orange", "lemon", "cherry", "apple", "banana"};
        int randomIndex = (int) (Math.random() * fruits.length);
        this.fruit = fruits[randomIndex];
    }

    public String toString() {
        return fruit;
    }
}


