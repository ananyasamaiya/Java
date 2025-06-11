//A
//A B
//A B C

class pattern7{
    public static void main(String[] arg)
    {
        
        for(int i=1;i<=5;i++)
    {
        char ch = 'A';
        
        for(int j=1;j<=i;j++)
        {
            System.out.print(ch + " ");
            ch++;
        }
        
        System.out.println();
    }
    }
    

}