class compare{
    public static void main(String[] args){
        String str1 = "hello";
        String str2 = "hilli";
         
        for(int i=0;i<str1.length();i++){
           int count = 0;
            for(int j=0;j<str2.length();j++)
            {
                
                if(str1.charAt(i)==str2.charAt(j))
                {
                    count++;
                    
                }

            }
             System.out.println("Number of " + str1.charAt(i) + " is " + count);
            
        }
       
            
    }

}