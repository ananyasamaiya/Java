import java.util.Random;
import java.util.ArrayList;
public class Account {
   
    private int accountNumber;
    private String name;
    private double balance;
    private ArrayList<String> transactionHistory = new ArrayList<>();

    public Account(String name){
        this.name = name;
        setAccountNumber();
        balance = 0.0;
    }
    public String getName(){
        return name;
    }
    public int getAccountNumber(){
        return accountNumber;
    }
    public void setAccountNumber(){
        Random random = new Random();
        this.accountNumber = 10000 + random.nextInt(90000);
    }
    public double getBalance(){
        return balance;
    }
    public void addAmount(double amount){
        balance+=amount;
    }
    public void deductAmount(double amount){
        if(balance >= amount){
            balance-=amount;
        }
        else{
            System.out.println("Insufficient amount");
        }
    }
    public ArrayList<String> getTransactionHistory(){
        return transactionHistory;
    }
    
}