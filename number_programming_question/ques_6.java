
// 6.	WAP to extract and display all digits from a given number
import java.util.Scanner;
class ques_6{
    public static void main(String[] args){
        System.out.print("Enter a number: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        display(n);
    }
    public static void display(int n){
        while(n>vs
0){
            int digit = n%10;
            System.out.println(digit);
            n = n/10;
        }
    }
}
