import java.util.Scanner;
public class reverse {
    public static void main(String[] args)
     {
        System.out.println("ENTER a NUM:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Reverse number is:");


        while (num > 0)
        {
            int i=num%10;
            System.out.print(i);
            num /=10;
        }
        
    }
    
}
