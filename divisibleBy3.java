//question 10
import java.util.Scanner;
class divisibleBy3{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n  = in.nextInt();
        if(n%3 == 0)
        {
            System.out.println( n + " is divisible 3");
        }
        else {
          System.out.println( n + " is not divisible 3");
         
        }
        
    }
}