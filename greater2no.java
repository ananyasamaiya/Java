//Question 3
import java.util.Scanner;
class greater2no{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a  = in.nextInt();
        System.out.println("Enter second number:");
        int b  = in.nextInt();
        if(a>b)
        {
            System.out.println(a + " is greater");
        }
        else if(a<b)
        {
            System.out.println(b + " is greater");
        }
        else{
            System.out.println("a and b are equal");
        }
    }
}