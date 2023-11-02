public class StatePattern {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine(3);

        vendingMachine.insertDollar();
        vendingMachine.dispenseItem();

        vendingMachine.insertDollar();
        vendingMachine.ejectMoney();

        vendingMachine.insertDollar();
        vendingMachine.dispenseItem();
        vendingMachine.dispenseItem();
        vendingMachine.dispenseItem();
    }
}
