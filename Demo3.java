import java.util.Scanner;

public class Demo3 
{
    public static void main(String args[])
    {
        System.out.println("Hello");
        A a=new A();
        a.display();
    }
}

class A 
{
    int id;
    int age;
    String name;
    float salary;
    String designation;
    A()
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter your ID");
        id=sc.nextInt();

        System.out.println("Enter your name:");
        name=sc.next();

        System.out.println("Enter your age");
        age=sc.nextInt();

        System.out.println("Enter your salary:");
         salary=sc.nextFloat();

        System.out.println("Enter your designation:");
        designation=sc.next();
        
    }

    void display()
    {
        System.out.println("==============");
        System.out.println("Id: " + id);
        System.out.println("Name "+ name) ;
        System.out.println("Age: "+ age) ;
        System.out.println("Salary: "+ salary) ;
        System.out.println("Designation: "+ designation) ;
    }

}
