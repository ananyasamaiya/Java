// 1.	WAP to print natural numbers up-to 'n'
import java.util.Scanner;
class ques_1{
    public static void main(String[] args){
        System.out.print("Enter a number: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Print_number(n);
    }
    public static void Print_number(int n){
        for(int i=1;i<=n;i++){
            System.out.println(i);
        }
    }
}
