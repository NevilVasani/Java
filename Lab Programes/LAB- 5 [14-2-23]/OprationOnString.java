import java.util.Scanner;
public class OprationOnString {
    public static void main(String[] args) 
    {
 //a. Print the string in reverse order

        //declare the string  
        String org ="",rev ="",odd ="";
        int i, j, k, vowels=0;
        char ch1,ch2;

        //get string from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        org = sc.nextLine();
        System.out.println("----------------------------------------------------------------------------------");

        //reverse a string 

        for (i=0; i<org.length(); i++)
        {
            ch1 = org.charAt(i);
            rev = ch1 + rev;
        }
        

        //print reverse string 

        System.out.println("reverse string is : "+ rev );
        System.out.println("----------------------------------------------------------------------------------");
       

 //b. print all odd indexed characters of string in java

        System.out.print("All odd indexed characters = ");

        for (i=1; i<org.length(); i+=2)
        {
            System.out.print(org.charAt(i));
        }

        System.out.println();
        System.out.println("----------------------------------------------------------------------------------");
        

  //c. print the count of vowels in string
        
        for (i=0; i<org.length(); i++)
        {
            if (org.charAt(i)== 'a' || org.charAt(i)== 'e' || org.charAt(i)== 'i' || org.charAt(i)== 'o' || org.charAt(i)== 'u' || org.charAt(i)== 'A' || org.charAt(i)== 'E' || org.charAt(i)== 'I' || org.charAt(i)== 'O' || org.charAt(i)== 'U')
            {
                vowels++; 
            }
        }
        System.out.println("count of vowels in string is: " + vowels);
        System.out.println("----------------------------------------------------------------------------------");
        
        

  //d.  count frequency of string
         //Declare frequency array == length of original string 

        int frequency[] = new int[org.length()];

        //Declare charter str array for convert a original string into char array 
        char str[] = org.toCharArray();

        for (j=0; j<org.length(); j++)
        {
            frequency[j] = 1;
            for (k=j+1; k<org.length(); k++)
            {
                if (str[j] == str[k])
                {
                    frequency[j]++;
                    str[k] = '0';
                }
            }
        }

        //print a frequency for each char 
        System.out.println("frequency of each character : ");
        for( i = 0; i <frequency.length; i++) 
        {  
            if(str[i] != ' ' && str[i] != '0')  
                System.out.println(str[i] + "  -  " + frequency[i]);  
        }  
    }
}
