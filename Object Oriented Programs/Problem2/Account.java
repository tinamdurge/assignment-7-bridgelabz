public class Account {
    private int balance;

    public Account(int balance) {
        this.balance = balance;
    }

    public boolean debit(int amount) {
        if (amount < 0)
            return false;
        if (amount > this.balance) {
            System.out.println("Transaction unsuccessful.\nAmount exceeds the account balance.\n");
            return false;
        }

        System.out.println("Amount debited successfully.");
        this.balance -= amount;
        System.out.println("Account balance is: " + this.balance + "\n");
        return true;
    }

    public int checkBalance() {
        return this.balance;
    }
}
