public class AccountTest {
    public static void main(String[] args) {
        // creating account having balance 5000
        Account account = new Account(5000);

        // will execute successfully
        account.debit(1000);

        // will throw an error
        account.debit(15000);
    }
}
