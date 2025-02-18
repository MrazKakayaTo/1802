class BankAccount {
    double balance;
    BankAccount(double balance) {
        this.balance = balance;
    }
    void popolnenieScheta(double amount) {
        balance += amount;
    }
    void snyatieSoScheta(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("недостаточно средств");
        }
    }
    void showBalance() {
        System.out.println("текущий баланс : " + balance);
    }
}
