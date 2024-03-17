public class TestAccount {
    public static void main(String[] args) {
        Account account1 = new Account();
        System.out.println("accountID=" + account1.getAccountID() + ",balance=" + account1.getBalance());
        account1.setAccountID("CS001");
        account1.deposit(1000);
        System.out.println("accountID" + account1.getAccountID() + ",balance=" + account1.getBalance());

        Account account2 = new Account("CS002",2000);
        System.out.println("accountID" + account2.getAccountID() + ",balance=" + account2.getBalance());
        account2.withdraw(200);
        System.out.println("accountID" + account2.getAccountID() + ",balance=" + account2.getBalance());

        Account account3 = new Account("CS003");
        System.out.println("accountID" + account3.getAccountID() + ",balance=" + account3.getBalance());
    }
}
