public class BankAcoount {
    private final String accountNumber;
    private final String owner;
    private double balance;

    public BankAcoount(java.lang.String accountNumber, java.lang.String owner) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = 0.0;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount){
        if (amount > 0){
            balance += amount;
        }
    }

    public boolean withdraw(double amount){
        if (amount > 0 && balance >= amount){
            balance -=amount;
            return true;
        }
        return false;
    }
    //public double exchange(double amount, String ??? ){
   //     return 0.0;
   // }
}
