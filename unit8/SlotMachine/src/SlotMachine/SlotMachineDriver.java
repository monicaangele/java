package SlotMachine;

public class SlotMachineDriver {
    public static void main(String[] args) {
        // Create an instance of SlotMachine
        SlotMachine slotMachine = new SlotMachine();

        // Spin the slot machine and display the result
        slotMachine.spin();

        // Print the result of the spin
        System.out.println(slotMachine.getResult());
    }

}
