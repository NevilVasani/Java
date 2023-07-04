import java.util.Scanner;
public class BMIcalc {
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Input weight in kilogram: ");
      double weight = sc.nextDouble();
      System.out.print("Input height in meters: ");
      double height = sc.nextDouble();
      double BMI = weight / (height * height);
      System.out.print("The Body Mass Index (BMI) is " + BMI + " kg/m2");
   
        if(BMI < 18.5) {
            System.out.println("You are underweight");
        }else if (BMI < 25) {
            System.out.println("You are normal");
        }else if (BMI < 30) {
            System.out.println("You are overweight");
        }else {
            System.out.println("You are obese");
 
        }
    }
}