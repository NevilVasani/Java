import java.util.Scanner;

class employee {
    int employeeid,salary;
    String name;


    employee(int employeeid, String name)
    {
        this.employeeid= employeeid;
        this.name= name;
    }

    employee(int employeeid, String name, int salary)
    {
        this.employeeid= employeeid;
        this.name= name;
        this.salary= salary;
    }

    void display(){
        System.out.println("Employee-id is:"+employeeid+"\nEmployee name is:"+name+"\nEmployee salary is:"+salary);
    }

}

//driver class

public class exp5b {
    public static void main(String[] args) {
       employee e1 = new employee(44,"Nevil");
       employee e2 = new employee(03,"Prashant",50000);
       
       e1.display();
       e2.display();
        
        
    }
    
}
