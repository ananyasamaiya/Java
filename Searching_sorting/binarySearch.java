class binarySearch{
    public static void main(String[] args){
        int[] arr = {5,6,7,8,9,10,11};
        int target = 9;
        int l = 0;
        int h = arr.length-1;
        int key = BinarySearch(arr,l,h,target);
        if(key == -1){
            System.out.println(target + " is not found ");
        }
        else{
            System.out.println(target + " is found at index number " + key);
        }
    }

    public static int BinarySearch(int[] arr,int l ,int h,int target){
        while(l<=h){
        int mid = (l+h)/2;

        if(arr[mid] ==target){
            return mid;
        }
        else if(arr[mid] > target){
                h = mid -1;
            }
        else{
                l = mid +1;
        }
        }
        return -1;
    }
}