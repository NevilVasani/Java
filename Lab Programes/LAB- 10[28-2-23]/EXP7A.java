import java.util.Scanner;

class EXP7A
{
    public static void main(String[] args) 
    {
        int num1,num2;
        Scanner sc = new Scanner(System.in);

        try
        {
            System.out.println("Enter NUmber 1:");
            num1 = sc.nextInt();
            System.out.println("Enter Number 2:");
            num2 = sc.nextInt();

            int data = num1/num2;
            System.out.println("Answer of division is :"+ data);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally
        {
            System.out.println("Finally block is always executed");
        }
        System.out.println("rest of the code...");
    }
}