class exp6b{
    public static void main(String args[])
    {
        Science obj=new Science();
        obj.total_sal=obj.salary+obj.hra+obj.da+obj.bonous;
        System.out.println("Total Salary is:"+obj.total_sal);
    }
}
class Faculty
{
    float total_sal=0, salary=30000;
}

class HRA extends Faculty
{
    float hra=3000;
}

class DA extends HRA
{
    float da=2000;
}

class Science extends DA
{
    float bonous=2000;

}