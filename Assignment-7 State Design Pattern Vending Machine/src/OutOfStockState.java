public class OutOfStockState implements VendingMachineState {
    @Override
    public void insertDollar(VendingMachine vendingMachine) {
        System.out.println("Out of stock. Money returned.");
        vendingMachine.returnMoney();
    }

    @Override
    public void ejectMoney(VendingMachine vendingMachine) {
        System.out.println("No money to return.");
    }

    @Override
    public void dispenseItem(VendingMachine vendingMachine) {
        System.out.println("Out of stock. Please insert a dollar.");
    }
}