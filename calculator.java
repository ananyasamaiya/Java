
import java.util.Scanner;


class calculator{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter First number:");
        int a = in.nextInt();

        System.out.println("Enter Second number:");
        int b = in.nextInt();

        System.out.println("Enter operator :");
        char op = in.next().charAt(0);

        double result;

        switch (op) {
            case '+':
                result = a + b;
                System.out.println(result);
                break;
            case '-':
                result = a - b;
                System.out.println(result);
                break;
            case '*':
                result = a * b;
                System.out.println(result);
                break;
            case '/':
                if (b!= 0)
                {
                  result = a / b;
                }
                else {
                    System.out.println("Error");
                }
                
                System.out.println(result);
                break;

            default:
                System.out.println("Invalid input");
        }




    }
}