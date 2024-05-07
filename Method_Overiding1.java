
import java.util.Scanner;

class Emp
{
    int id,age;
        String name;
        String designation;
        int salary;


        Emp()
        {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter id:");
        id=sc.nextInt();
        System.out.println("enter name:");
        name=sc.next();
        System.out.println("Enter age:");
        age=sc.nextInt();
        }
         
        void display()
    {
        System.out.println("Id: "+id);
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Salary:  "+salary);
        System.out.println("Designation: "+designation);

    }
}

class Dev extends Emp
{
        
    Dev()
    {
        salary=60000;
        designation="Developer";
    }

    
}


class Clerk extends Emp
{
    Clerk()
    {
         salary=30000;
         designation="Clerk";
    }

}

class Manager extends Emp
{
    int salary=30000; // if we will not write sal and desig in manager() then default values will get printed for manager.
    String designation="Clerk";
    Manager()
    {
         
    }

}


public class Method_Overiding1
{
    public static void main(String agrs[])
    {
        int ch=0;
        
        do{
            System.out.println("1. Developer");
        System.out.println("2. Clerk");
        System.out.println("3.Manager");
        System.out.println("4. Exit");

        Scanner sc=new Scanner(System.in);  
        System.out.println("Enter your choice:");  
        ch=sc.nextInt();

        if(ch==1)
        {
            Dev d=new Dev();
            d.display();
        }

        else if(ch==2)
        {
            Clerk c=new Clerk();
            c.display();
        }

        else if(ch==3)
        {
            Manager m=new Manager();
            m.display();
        }

        else if(ch==4)
        System.out.println("thank you");

        else
        System.out.println("Please enter valid choice");


        }while(ch!=4);

        
    
    }    
}

