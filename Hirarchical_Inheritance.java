import java.util.Scanner;

class Emp
{
    int id,age;
        String name;

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
}

class Dev extends Emp
{
    
        int salary=60000;
        String designation="Developer";
        
    Dev()
    {
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


class Clerk extends Emp
{
        int salary=30000;
        String designation="Clerk";
        
    Clerk()
    {
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


public class Hirarchical_Inheritance
{
    public static void main(String agrs[])
    {
        int ch=0;
        
        do{
            System.out.println("1. Developer");
        System.out.println("2. Clerk");
        System.out.println("3. Exit");

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
        System.out.println("thank you");

        else
        System.out.println("Please enter valid choice");


        }while(ch!=3);

        
    
    }    
}

