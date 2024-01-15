import java.math.BigDecimal;
public interface IAccount {
    public void deposit(java.math.BigDecimal amount);
    public void withdraw(BigDecimal amount);
    public void transfer(IAccount toAccount, BigDecimal amount);
    public int getAccountNumber();
    public BigDecimal showBalance();
}