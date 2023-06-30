public class piramid2 
{
    public static void main(String[] args)
    {
        char i='A';
        int row,collumn;
        for (row=1;row<=4;row++)
        {
         for (collumn=1;collumn<=row;collumn++)
         {
             System.out.print(i + " ");
             i++;
         }
         System.out.println();
         
        }   
    }
}
