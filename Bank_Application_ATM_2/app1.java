import java.util.Scanner;
class app1{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int input = 0;
        System.out.println("Welcome");
        System.out.println("Creating an Account");
        System.out.print("Please Enter your name:");
        String name = scanner.nextLine();
        Account account = new Account(name);
        Transaction transaction = new Transaction(account);
        System.out.println("WELCOME:" + account.getName().toUpperCase());
        System.out.println("Your Account number is : " + account.getAccountNumber());
        do{
        System.out.println("\nOptions:");
        System.out.println("Press 1 for Deposit");
        System.out.println("Press 2 for Withdraw");
        System.out.println("Press 3 for Check Balance");
        System.out.println("Press 4 for View Transaction");
        System.out.println("Press 5 for Exit");
        System.out.print("Enter choice:");
        input = scanner.nextInt();
        switch(input){
            case 1:
                System.out.print("Enter amount to be deposit : ");
                double depositAmount = scanner.nextDouble();
                transaction.deposit(depositAmount);
                break;
            case 2:
                System.out.print("Enter amount to be withdraw : ");
                double withdrawAmount = scanner.nextDouble();
                transaction.withdraw(withdrawAmount);
                break;
            case 3:
               transaction.checkBalance();
                break;
            case 4:
                transaction.printTransactionHistory();
                break;
            case 5:
                System.out.println("Thank you ");
                break;
            default: 
             System.out.println("Invalid Input ");
             System.out.println("Please try again ");
        }
        }while(input !=5);
    }
}