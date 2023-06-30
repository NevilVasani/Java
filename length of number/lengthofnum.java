import java.util.Scanner;

public class lengthofnum 
{
    public static void main(String[] args)
    {
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        long number = sc.nextLong();
        int i=0;

        while (number>0)
        {
            number = number/10;
            i++;
        }
        System.out.println("length of given number is:"+i);
    }
}
