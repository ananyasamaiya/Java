class primeno{
    public static void main(String[] args){
        int[] arr = {2,3,4,56,54,26,17};

        for(int i = 0;i<arr.length;i++){
            int j;
            for(j = 2;j<arr[i];j++)
            {
                if(arr[i]%j==0){
                break;
            }
            }
            if(j==arr[i]){
                System.out.println(arr[i] + " is prime");
            }
            else{
                System.out.println(arr[i] + " is not prime");
            }
            
        }
    }
}