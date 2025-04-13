//question 2
import java.util.Scanner;

class pos_neg_zero{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number:");
        int a  = in.nextInt();
        if(a>0)
        {
            System.out.println("Positive");
        }
        else if(a<0)
        {
            System.out.println("Negative");
        }
        else {
            System.out.println("Zero");
        }
    }
}