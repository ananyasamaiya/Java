class uniqueElement{
    public static void main(String[] args)
    {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {2,3,4,7,1};
        System.out.println("Unique elements: ");
        for(int i = 0;i<arr1.length;i++)
        {
            boolean found = false;
            for(int j = 0;j<arr2.length;j++)
            {
                if(arr1[i] == arr2[j])
                {
                    found = true;
                    break;
                }
            }
            if(!found)
            {
                System.out.println(arr1[i]);
            }
        }

        for(int j = 0;j<arr2.length;j++)
        {
            boolean found = false;
            for(int i = 0;i<arr1.length;i++)
            {
                if(arr1[i] == arr2[j])
                {
                    found = true;
                    break;
                }
            }
            if(!found)
            {
                System.out.println(arr2[j]);
            }
        }
        
    }
}