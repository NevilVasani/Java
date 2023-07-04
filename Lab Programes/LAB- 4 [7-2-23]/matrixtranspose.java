import java.util.Scanner;

public class matrixtranspose 
{
    public static void main(String[] args)
    {
    //declare 2 [] [] array

    int org[][]= new int [3][3];
    int tranc[][]= new int [3][3];

    int row,collumn;
    Scanner sc = new Scanner(System.in);

    //intilize original matrix

    System.out.println("Enter the array Elements:");
    for ( row=0 ; row<org.length ; row++)
        for (collumn=0 ; collumn < org[row].length ; collumn++ )
        {
            org[row][collumn] = sc.nextInt();
        }

    //transpose

    for ( row=0 ; row<org.length ; row++)
        for (collumn=0 ; collumn < org[row].length ; collumn++ )
        {
            tranc[row][collumn] =  org[collumn][row];
        }
    

     //display original matrix

     System.out.println("Original array : ");
     for (row=0 ;row<org.length ; row++)
     {
         for(collumn=0 ; collumn<org[row].length ; collumn++)
         {
             System.out.print(org[row][collumn] + " ");
         }
         System.out.println("");
     }

     //display transpose matrix

     System.out.println("Transpose array : ");
     for (row=0 ;row<tranc.length ; row++)
     {
         for(collumn=0 ; collumn<org[row].length ; collumn++)
         {
             System.out.print(tranc[row][collumn] + " ");
         }
         System.out.println("");
     }

    }
    
}
