import java.math.BigDecimal;

public class Investment implements IAccount {
    private final int accountNumber;
    private BigDecimal balance;

    public Investment(int accountNumber, BigDecimal initAmount) {
        this.accountNumber = accountNumber;
        this.balance = initAmount;
    }

    @Override
    public void deposit(BigDecimal amount) {
        balance = balance.add(amount);
    }

    @Override
    public void transfer(IAccount toAccount, BigDecimal amount) {
        toAccount.deposit(amount);
        balance = balance.subtract(amount);
    }

    @Override
    public void withdraw(BigDecimal amount) {
        balance = balance.subtract(amount);
    }

    @Override
    public int getAccountNumber() {
        return accountNumber;
    }

    public BigDecimal showBalance() {
        return balance;
    }
}
