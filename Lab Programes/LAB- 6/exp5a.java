class student{
    int rollno;
    String name;
    
    void setrollno (int rollno)
    {
        this.rollno=rollno;
    }
    
    void setname (String name)
    {
        this.name=name;
    }
    int getrollno(){
        return rollno;    
    }
    String getname(){
        return name;
    }
}


class exp5a {
    public static void main(String[] args) {
       student s1= new student();
       student s2= new student();
       
       s1.setrollno(44);
       s1.setname("Nevil");
       s2.setrollno(29);
       s2.setname("Kishan");
       
       System.out.println("Student1-Name:"+ s1.getname()+"\nStudent1-Rollno:"+ s1.getrollno());
       System.out.println("Student2-Name:"+ s2.getname()+"\nStudent2-Rollno:"+ s2.getrollno());
       
    }
}