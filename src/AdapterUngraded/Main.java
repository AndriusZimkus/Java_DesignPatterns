package AdapterUngraded;

public class Main {
    public static void main(String[] args) {

        // The client

        OldCoffeeMachine oldCoffeeMachine = new OldCoffeeMachine();
        CoffeeMachineInterface coffeeTouchscreenAdapter = new CoffeeTouchscreenAdapter(oldCoffeeMachine);

        coffeeTouchscreenAdapter.chooseFirstSelection();
        coffeeTouchscreenAdapter.chooseSecondSelection();

    }
}

