public class IdleState implements VendingMachineState {
    @Override
    public void insertDollar(VendingMachine vendingMachine) {
        System.out.println("Dollar inserted. Please select an item.");
        vendingMachine.setState(new HasDollarState());
    }

    @Override
    public void ejectMoney(VendingMachine vendingMachine) {
        System.out.println("No money to return.");
    }

    @Override
    public void dispenseItem(VendingMachine vendingMachine) {
        System.out.println("Payment required. Please insert a dollar.");
    }
}