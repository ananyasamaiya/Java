class palindromstring{
    
    public static void main(String[] args){
        String str = "racecar";
        int i,j;
        for(i=0,j=str.length()-1;i<str.length();i++,j--)
        {
            if(str.charAt(i)!=str.charAt(j)){
                break;
            }
        }
        if(i==str.length())
        {
            System.out.println("palindrome");
        }
        else{
            System.out.println("not a palindrome");
        }
    }
}
