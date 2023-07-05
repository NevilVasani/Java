abstract class Shape
{  
    abstract void draw();  
}  
      
class Rectangle extends Shape
{  
    void draw()
    {
        System.out.println("drawing rectangle");
    }  
}  
class Circle extends Shape
{  
    void draw()
    {
        System.out.println("drawing circle");
    }  
}  
      
class exp6d
{  
    public static void main(String args[])
    {  
        Shape s=new Circle();//In a real scenario, object is provided through method, e.g., getShape() method  
        s.draw();  
    } 
}