package SlotMachine;

public class SlotMachine {
    private Slot slot1;
    private Slot slot2;
    private Slot slot3;

    public SlotMachine() {
        this.slot1 = new Slot("orange");
        this.slot2 = new Slot("lemon");
        this.slot3 = new Slot("cherry");
    }

    public void spin() {
        slot1.spin();
        slot2.spin();
        slot3.spin();
    }

    public Slot getSlot1() {
        return slot1;
    }

    public void setSlot1(Slot slot1) {
        this.slot1 = slot1;
    }

    public Slot getSlot2() {
        return slot2;
    }

    public void setSlot2(Slot slot2) {
        this.slot2 = slot2;
    }

    public Slot getSlot3() {
        return slot3;
    }

    public void setSlot3(Slot slot3) {
        this.slot3 = slot3;
    }

    public String getResult() {
        return "| " + slot1 + " | " + slot2 + " | " + slot3 + " |";
    }
}


