
class array8{
    public static void main(String[] args)
    {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,2,3,4,5};
        int[] arr = new int[10];

        int k = 0;
        for(int i=0;i<5;i++,k++)
        {
            arr[k] = arr1[i];
        }
        for(int j=0;j<5;j++,k++)
        {
            arr[k] = arr2[j];
        }
        System.out.println("Array");
        for(int i = 0;i<10;i++)
        {
           System.out.println(arr[i]);
 
        }

    }
}





