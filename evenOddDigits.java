class evenOddDigits{
    public static void main(String[] args){
        int a =123;
        while(a!=0){
            int digit = a%10;
            if(digit%2 == 0){
                System.out.println(digit + " is even");
            }
            else{
                System.out.println(digit + " is odd");
            }
            a = a/10;
        }
    }
}