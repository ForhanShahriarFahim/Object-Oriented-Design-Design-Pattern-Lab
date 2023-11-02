public class HasDollarState implements VendingMachineState {
    @Override
    public void insertDollar(VendingMachine vendingMachine) {
        System.out.println("You already inserted a dollar.");
    }

    @Override
    public void ejectMoney(VendingMachine vendingMachine) {
        System.out.println("Money returned. Thank you!");
        vendingMachine.setState(new IdleState());
    }

    @Override
    public void dispenseItem(VendingMachine vendingMachine) {
        if (vendingMachine.getItemCount() > 0) {
            vendingMachine.releaseItem();
            vendingMachine.setState(new IdleState());
        } else {
            System.out.println("Out of stock. Money returned.");
            vendingMachine.returnMoney();
            vendingMachine.setState(new OutOfStockState());
        }
    }
}
