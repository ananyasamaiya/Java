
// * * * * *
//   * * *
//     *

class pattern5{
    public static void main(String[] arg)
    {
        for(int i=5;i>=1;i--)
    {
        for(int a=1;a<=5-i;a++)
        {
            System.out.print("  ");
        }
        for(int j=1;j<=i*2-1;j++)
        {
            System.out.print("* ");
        }
        
        
        System.out.println();
    }
    }
    

}