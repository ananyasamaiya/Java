class targetcount{
    public static void main(String[] args){
        String str = "racecar";
        char target = 'r';

        char[] arr = str.toCharArray();
        int count = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == target){
                count++;
            }
        }
        System.out.println("the number of time "+ target + " appears is " + count );
    }
}