public class VendingMachine {
    
    private VendingMachineState currentState;
    private int itemCount;

    public VendingMachine(int itemCount) {
        this.itemCount = itemCount;
        if (itemCount > 0) {
            currentState = new IdleState();
        } else {
            currentState = new OutOfStockState();
        }
    }

    // Set the current state
    public void setState(VendingMachineState state) {
        currentState = state;
    }

    public int getItemCount() {
        return itemCount;
    }

    // Methods for actions on the vending machine
    public void insertDollar() {
        currentState.insertDollar(this);
    }

    public void ejectMoney() {
        currentState.ejectMoney(this);
    }

    public void dispenseItem() {
        currentState.dispenseItem(this);
    }

    // Additional methods for item dispensing and money return
    public void releaseItem() {
        System.out.println("Item dispensed. Enjoy your snack!");
        itemCount--;
    }

    public void returnMoney() {
        System.out.println("Money returned. Thank you!");
    }
}
