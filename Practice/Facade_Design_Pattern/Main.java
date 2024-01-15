import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        BankService bankService = new BankService();
        int savings = bankService.createNewAccount("saving", new BigDecimal(1000.00));
        BigDecimal savingsBalance = bankService.showBalance(savings);
        System.out.println("Savings Account Balance is: " + savingsBalance);

        int investment = bankService.createNewAccount("investment", new BigDecimal(2000.00));
        BigDecimal investmentBalance = bankService.showBalance(investment);
        System.out.println("Investment Account Balance is: " + investmentBalance);

        System.out.println();
        bankService.transferMoney(investment, savings, new BigDecimal(500.00));
        investmentBalance = bankService.showBalance(investment);
        savingsBalance = bankService.showBalance(savings);
        System.out.println("After Transfer, Savings Account Balance is: " + savingsBalance);
        System.out.println("After Transfer, Investment Account Balance is: " + investmentBalance);

        System.out.println();
        bankService.deposit(savings, new BigDecimal(3000.00));
        savingsBalance = bankService.showBalance(savings);
        System.out.println("After Deposit, Savings Account Balance is: " + savingsBalance);
    }
}