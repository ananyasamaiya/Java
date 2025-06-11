import java.util.Scanner;

class reverse{
    public static void main(String [] args){

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the number to reverse: ");

        int n = sc.nextInt();

        int rev = 0;

        while(n!=0){
            int digit = n%10;
            rev = rev*10 + digit;
            n = n/10;
        }
        System.out.println("The reverse of the number is: " + rev);

}
}