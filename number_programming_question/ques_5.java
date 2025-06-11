// 5.	WAP to find product of 'n' natural numbers

import java.util.Scanner;
class ques_5{
    public static void main(String[] args){
        System.out.print("Enter a number: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int product = Product(n);
        System.out.print("Product of: "+ product);
    }
    public static int Product(int n){
        int pro = 1;
        for(int i=1;i<=n;i++){
            pro = pro * i;
        }
        return pro;
    }
}
