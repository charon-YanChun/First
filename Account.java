public class Account {
    private String accountID;
    private int balance;
    public Account(){
        this("",0);
    }
    public Account(String accountID){
        this(accountID,0);
    }
    public Account(String accountID,int balance){
        if(accountID!=null){
            this.accountID = accountID;
        }else{
            this.accountID = "";
        }
        this.balance = balance;
    }
    public String getAccountID(){
        return accountID;
    }
    public void setAccountID(String accountID){
        this.accountID = accountID;
    }
    public int getBalance(){
        return balance;
    }
    public void withdraw(int amount){
        this.balance -= amount;
    }
    public void deposit(int amount){
        this.balance += amount;
    }
}
