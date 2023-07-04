import java.util.Scanner;

public class sum_avg
{
public static void main(String[] args)
 {
    //declare array
    int a[] = new int[10];

    System.out.println("Enter the array elements :");
    Scanner sc =new Scanner(System.in);
    
    //intilize Array

    for (int i=0 ;i<a.length ;i++)
    {
        a[i] = sc.nextInt();
    }

    //sum of all elements

    int sum = 0;

    for (int i=0 ; i<a.length ; i++)
    {
        sum = sum + a[i];
    }

    //display the sum and avg

    float avg = (float)sum/a.length;
    System.out.println("Sum of the array is :" + sum);
    System.out.println("average of the array is :"+avg);
 }
}