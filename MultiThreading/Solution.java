//Withdrawing 500, 800 from a Account whose balance is 1000 and using Thread to withDraw
class Account extends Thread{
    private static int balance = 1000;
    private int amount;


    public Account(int amount){
        this.amount = amount;
    }

    public void run(){
        if(balance >= amount){
            System.out.println("Amount Withdraw : " + amount);
            try{
                Thread.sleep(1000);
            } catch(InterruptedException ex){

            }
            balance = balance - amount;
            System.out.println("Balance Left : " + balance);
        }
        else{
            System.out.println("Paise nhi ha");
        }
    }
    

}
class Solution{
    

    public static void main(String[] args){
        Account t1 = new Account(800);
        Account t2 = new Account(500);

        t1.start();

        t2.start();
        
    
    }
}