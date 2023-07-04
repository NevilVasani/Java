import java.util.Scanner;

public class primenumber
{
    public static void main(String[] args)
    {
        int i,flag=0;
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
    
        
        for (i=2;i<=num/2;i++)
        {
            if(num%i==0)
            {
                flag++;
				break;
            }
        }
     
        if (flag==1)
        {
            System.out.println(num + " IS NOT PRIME NUMBER");
        }
        else
        {
            System.out.println(num +" IS PRIME NUMBER");
        }
    }
}