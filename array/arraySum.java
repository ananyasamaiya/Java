import java.util.Scanner;
class arraySum {
    public static void main(String[] args)
    {
       Scanner in = new Scanner(System.in);
        
       System.out.println("Enter size of array");
       int n = in.nextInt();
       int[] arr = new int[n];
       System.out.println("Enter value of array");

       for(int i =0;i<n;i++)
       {
        arr[i] = in.nextInt();
       }
       int sum = 0;
       for (int k=0;k<arr.length;k++)
        {
           sum = sum + arr[k]; 
        }
        System.out.println("Sum of array:" + sum);

       

    }
}