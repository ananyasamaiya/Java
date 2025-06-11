// 4.	WAP to find sum of 'n' natural numbers
import java.util.Scanner;
class ques_4{
    public static void main(String[] args){
        System.out.print("Enter a number: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = Sum(n);
        System.out.print("Sum of: "+ sum);
    }
    public static int Sum(int n){
        int sum = 0;
        for(int i=1;i<=n;i++){
            sum = sum + i;
        }
        return sum;
    }
}
