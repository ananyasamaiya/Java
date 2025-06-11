//question 6
import java.util.Scanner;
class sumNo{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n  = in.nextInt();
        int sum = 0;
        while(n>0)
        {
            sum = sum + n;
            
            n--;
        }
        System.out.println(sum);
        
    }
}