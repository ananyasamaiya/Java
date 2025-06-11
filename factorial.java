//question 12
import java.util.Scanner;
class factorial{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n  = in.nextInt();
        int fact = 1;
        for(int i=n;i>0;i--){
            fact = fact * i;
        }
        System.out.println("Factorial of " + n + " is " + fact);

        
        
    }
}