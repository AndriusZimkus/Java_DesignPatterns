package AdapterUngraded;

public class CoffeeTouchscreenAdapter implements CoffeeMachineInterface {

    private OldCoffeeMachine oldVendingMachine;

    public CoffeeTouchscreenAdapter(OldCoffeeMachine oldVendingMachine) {
        this.oldVendingMachine = oldVendingMachine;
    }

    @Override
    public void chooseFirstSelection() {
        System.out.println("Adapter - dispensing first option!");

        // Converting request to the old vending machine
        oldVendingMachine.selectA();
    }

    @Override
    public void chooseSecondSelection() {
        System.out.println("Adapter - dispensing second option!");

        // Converting request to the old vending machine
        oldVendingMachine.selectB();
    }
}
