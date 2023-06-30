public class piramid3 
{
 public static void main(String[] args) 
 {
    int row,collumn;
    int i=0,j=1;
    
    for (row=1;row<=5;row++)
    {
        for (collumn=1;collumn<=row;collumn++)
        {
            if (row%2==0)
                System.out.print(i + " ");
            else
                System.out.print(j + " ");
        }
        System.out.println();
    }
 }   
}
