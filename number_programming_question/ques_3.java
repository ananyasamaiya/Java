// 3.	WAP to print 'n' natural numbers in reverse order
import java.util.Scanner;
class ques_3{
    public static void main(String[] args){
        System.out.print("Enter a number: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Print_reverse_number(n);
    }
    public static void Print_reverse_number(int n){
        for(int i=n;i>=1;i--){
            System.out.println(i);
        }
    }
}