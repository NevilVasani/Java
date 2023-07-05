import java.util.Scanner;

class area{
    int l,b;
    float carea;
    float calc_area(int l){
        this.l=l;
        carea= (float)(3.14*l*l);
        return carea;
    }
    float calc_area(int l, int b){
        this.l=l;
        this.b=b;
        carea= l*b;
        return carea;
    }

    void display(){
        System.out.println("calculated area is "+ carea);
    }
}


public class exo5c {
    public static void main(String[] args) {
        area a1 = new area();
        area a2 = new area();        
        a1.calc_area(4);
        System.out.println("For Circle : ");
        a1.display();
        a2.calc_area(4,5);
        System.out.println("For Rectangle : ");
      
        a2.display();

    }    
}
