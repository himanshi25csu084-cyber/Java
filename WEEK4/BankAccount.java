public class BankAccount {
    private String accountNumber;
    private String ownerName;
    private double Balance;
    public BankAccount(String accountNumber,String ownerName){
        this.Balance = 0.0;
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
    }
    public BankAccount(String accountNumber, String ownerName, double balance){
        if(balance<0){
            System.out.println("Invalid Balance");
            return;
        }
        this.Balance = balance;
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
    }
    boolean deposit(double amount){
        if(amount>0){
            this.Balance+=amount;
            return true;
        }
        return false;
    }
    boolean withdraw(double amount){
        if(amount>this.Balance||amount<0){
            return false;
        }
        this.Balance = this.Balance-amount;
        return true;
    }
    public double GetBalance(){
        return Balance;
    }
    public void diusplay(){
        System.out.println("Account Number : "+accountNumber+" Owner name: "+ownerName+" Balance : "+Balance);
    }

}
