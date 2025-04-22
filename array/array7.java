class array7{
    public static void main(String[] args)
    {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,2,3,4,5};
        int[] arr = new int[5];
        int sum1 = 0,sum2 = 0,Totalsum = 0;

        for(int i = 0;i<5;i++)
        {
            sum1 = sum1 + arr1[i];
        }
        for(int j = 0;j<5;j++)
        {
            sum1 = sum1 + arr2[j];
        }
        Totalsum = sum1 + sum2;
        int sum = 0;
        for(int k =0;k<5;k++)
        {
            arr[k] = arr1[k] +arr2[k];
        }

        System.out.println("Sum of both array" + Totalsum);


        System.out.println("Sum Array");
        for(int i = 0;i<5;i++)
        {
           System.out.println(arr[i]);
 
        }


    }
}