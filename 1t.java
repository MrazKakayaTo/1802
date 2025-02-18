public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(5000);
        account.popolnenieScheta(1500);
        account.snyatieSoScheta(2000);
        account.showBalance();
    }
}
