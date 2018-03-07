package lab3;

public class Account {
    @SuppressWarnings("unused")
    private double balance;

    private Account(double balance) {
        this.balance = balance;
    }

    private void withdraw(double amount) throws NegativeWithdrawalException{
        if (amount < 0) {
            throw new NegativeWithdrawalException();
        }
        balance -= amount;
    }

    class NegativeWithdrawalException extends Exception {

        NegativeWithdrawalException() {}

        @Override
        public String getMessage() {
            return "Withdrawal amount must be positive";
        }
    }

    public static void main(String[] args) {
        Account account = new Account(200);
        try {
            account.withdraw(-300);
        } catch (NegativeWithdrawalException e) {
            e.printStackTrace();
        }
    }
}