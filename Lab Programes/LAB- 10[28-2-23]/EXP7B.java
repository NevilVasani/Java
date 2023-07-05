import java.util.Scanner;
class myexception extends Exception
{
    public myexception(String str)
    {
        super(str);
    }
}


public class EXP7B 
{
    static void validate(int attendence) throws myexception
    {
        if(attendence < 75)
        {
            throw new myexception("Attendence is not ....");
        }
        else
        {
            System.out.println("All teh best, You are eligible for exam");
        }
    }

    public static void main(String[] args)
    {
        int attendence;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your attendence:");
        attendence = sc.nextInt();
        try
        {
            validate(attendence);
        }
        catch(Exception e)
        {
            System.out.println("Caught the exception");
            System.out.println("exception occured:"+ e);
        }
        System.out.println("rest of the code...");
    }
}
