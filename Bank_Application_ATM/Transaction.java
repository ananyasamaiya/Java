public class Transaction{
    Account account;
    public Transaction(Account account){
        this.account = account;
    }

    public void deposit(double amount){
        account.addAmount(amount);
        account.getTransactionHistory().add("Deposit amount : " + amount);
        System.out.println("Amount Deposit Successfully");
        checkBalance();
    }
    public void withdraw(double amount){
        account.deductAmount(amount);
        if(account.getBalance() >=amount){
            account.getTransactionHistory().add("Withdrawal amount : " + amount);
            System.out.println("Amount Withdrawal Successfully");
        }
        else{
            System.out.println("Request for Withdrawal Fail");
        }
        checkBalance();
    }
    public void checkBalance(){
        System.out.println("Your Current Balance is: " + account.getBalance());
    }
    public void printTransactionHistory(){
            System.out.println("Your Transaction History is : ");
        for(String message : account.getTransactionHistory()){
            System.out.println(message);
        }
    }
}