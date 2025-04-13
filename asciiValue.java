//Question 11

import java.util.Scanner;

class asciiValue{
    public static void main(String[] args)
    {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter a character:");
    char c = in.next().charAt(0);

    int n = (int)c;

    System.out.println("ASCII value of " + c + " is " + n);
    }


}
