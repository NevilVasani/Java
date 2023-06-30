public class piramid1 
{
 public static void main(String[] args) 
 {
   int i=1,row,collumn;
   
   for (row=1;row<=5;row++)
   {
    for (collumn=1;collumn<=row;collumn++)
    {
        System.out.print(i + " ");
    }
    System.out.println();
    i++;
   }
 }   
}
