package SlotMachine;

public class SlotMachineDriver {
    public static void main(String[] args) {
        SlotMachine slotMachine = new SlotMachine();
        slotMachine.spin();
        System.out.println(slotMachine.getResult());
    }

}
