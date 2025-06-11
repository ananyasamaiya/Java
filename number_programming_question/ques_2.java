// 2.	WAP to print all even numbers between two given range

import java.util.Scanner;
class ques_2{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter lower limit: ");
        int a = in.nextInt();
        System.out.print("Enter upper limit: ");
        int b = in.nextInt();

        Print_Even_No(a,b);
    }
    public static void Print_Even_No(int a,int b){
         System.out.println("Number:");
        for(int i=a;i<=b;i++){
            if(i%2 == 0){
                System.out.println(i);
            }
            
        }
    }
}