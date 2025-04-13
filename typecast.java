//question 9
import java.util.Scanner;

class typecast{
     public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number:");
        float f = in.nextFloat();

        int a = (int)f;
        System.out.println(f + " number in float");
        System.out.println(a + " number in int");
     }
}