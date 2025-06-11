class linearSearch{
    public static void main(String[] args){
        int[] arr = {22,4,7,6,3,0,12};
        int target = 44;

        LinearSearch(arr,target);
    }

    public static void LinearSearch(int[] arr,int t){
        int i;
        for(i = 0;i<arr.length;i++){
            if(arr[i] == t){
                System.out.println(t + " is found at index number " + i);
                break;
            }
        }
        if(i==arr.length){
            System.out.println(t + " is not found ");
        }
    }
}