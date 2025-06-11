import java.util.Scanner;
class arrayTargetSum {   public static void main(String[] args)
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

        System.out.println("Enter the target");
        int target = in.nextInt();

        
        for (int i=0;i<arr.length;i++)
        {
          for(int j=i+1;j<arr.length;j++)
          {
            if(arr[i] + arr[j]==target)
            {
                System.out.println(arr[i] + " + " + arr[j] + " = " + target);
            }
          }  
        }
       
       

    }
}