import java.util.ArrayList;
import java.util.Date;

public class EXP8A {
    public static void main(String[] args) {
        ArrayList<Object> arr_List =new ArrayList<Object>();
        arr_List.add(new loan(5000.50));
        arr_List.add(new Date());
        arr_List.add(new String("String class"));
        arr_List.add(new circle(3.45));

        for(int i =0; i< arr_List.size(); i++)
        {
            System.out.println((arr_List.get(i)).toString());
        }
    }
}

class circle
{
    double radius;
    circle(double r)
    {
        this.radius=r;
    }
    public String toString()
    {
        return "Circle with Radius "+this.radius;
    }
}

class loan
{
    double loan;
    loan(double l)
    {
        this.loan=l;
    }
    public String toString()
    {
        return "loan amount is "+this.loan;
    }
}
