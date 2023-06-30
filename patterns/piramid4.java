public class piramid4 
{
    public static void main(String[] args) 
    {
        int row,collumn;
        int i=1,j=0;
        
        for (row=1;row<=5;row++)
        {
            for (collumn=1;collumn<=row;collumn++)
            {
                if (collumn%2==0)
            {
                System.out.print(j + " ");
            }

            else
                {
                    System.out.print(i + " ");
                } 
            }
            
            System.out.println();
        }
    }  
}
