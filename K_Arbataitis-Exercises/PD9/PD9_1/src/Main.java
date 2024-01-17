public class Main {
    public static void main(String[] args) {
BankAcoount myAccount = new BankAcoount("LT654876754586665665", "Karolis");
        System.out.println(myAccount.getBalance());
        myAccount.deposit(500);
        System.out.println(myAccount.getBalance());
        myAccount.withdraw(256);
        System.out.println(myAccount.getBalance());
        System.out.println(myAccount.withdraw(500));
        System.out.println(myAccount.getBalance());
    }
}
