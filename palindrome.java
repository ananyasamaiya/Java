import java.util.Scanner;
class palindrome{
    public static void main(String [] args){

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the number: ");

        int n = sc.nextInt();
        int original = n; 
        int res = 0;

        while(n!=0){
            int digit = n%10;
            res = res*10 + digit;
            n = n/10;
        }

        if(original == res)
        {
            System.out.println("Yes. it is a palindrome");
        }
        else{
            System.out.println("Yes. it is not a palindrome");

        }
         
}
}