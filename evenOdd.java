//question 1
import java.util.Scanner;
class evenOdd{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
         System.out.println("Enter a number:");
        int a  = in.nextInt();


        if(a%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}