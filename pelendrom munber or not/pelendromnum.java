import java.util.Scanner;

public class pelendromnum 
{
 public static void main(String[] args)
 {
    int r,sum=0,temp;  

    System.out.println("Enter a number:");
    Scanner sc = new Scanner(System.in);
    int n =sc.nextInt();                        //if n=454

    temp=n;    

    while(n>0)
    {    

     r=n%10;  //getting remainder  //r=4-------->r=5------------->r=4
     sum=(sum*10)+r;               //sum=4------>sum=40+S=45----->sum=450+4=454
     n=n/10;                       //n=45------->n=4------------->N=0

    }

    if(temp==sum)    
        System.out.println("palindrome number ");    

    else    
        System.out.println("not palindrome");    

    }  

}  