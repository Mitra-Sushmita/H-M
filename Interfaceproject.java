import java.util.Scanner;

interface company
{
    void cab();
    void pf();
}


abstract class Emp
{
	int id,age;
	String name;
	int salary;
	String desig;
	Emp()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println(" Enter ID : ");
		 id=sc.nextInt();
		System.out.println(" Enter Name : ");
		 name=sc.next();
		System.out.println(" Enter Age : ");
		 age=sc.nextInt();			
	}
	public void display()
	{
		System.out.println(" Hi ID "+id);	
		System.out.println(" My Name : "+name);	
		System.out.println(" Hi AGE "+age);	
		System.out.println(" My Salary : "+salary);		
		System.out.println(" My Designation : "+desig);	
	}
	public abstract void raiseSalry();
	
}
final class Manager extends Emp implements company
{	
	Manager()
	{
		salary=800000;
		desig="Manager";
	}

    public void raiseSalry()
    {
		salary=salary+((salary*10)/100) ;

        System.out.println("salary: "+ salary);
	}

    public void cab()
    {
        System.out.println("Cab is allocated for manager");
    }

    public void pf()
    {
        System.out.println(" manager's pf");
    }


}
 final class Tester extends Emp implements company
{
	
	int salary=300000;
	String desig="Tester";
	Tester()
	{
	}	
    
    public void raiseSalry()
    {
		salary=salary+((salary*10)/100) ;

        System.out.println("salary: "+ salary);
	}

    public void cab()
    {
        System.out.println("Cab is allocated for manager");
    }

    public void pf()
    {
        System.out.println(" manager's pf");
    }
}
 final class Dev extends Emp implements company
{
	Dev()
	{
        salary=60000;
        desig="Developer";
	}	

    public void raiseSalry()
    {
		salary=salary+((salary*10)/100) ;

        System.out.println("salary: "+ salary);
	}

    public void cab()
    {
        System.out.println("Cab is allocated for manager");
    }

    public void pf()
    {
        System.out.println(" manager's pf");
    }
}
final class Clerk extends Emp implements company
{
	Clerk()
	{	
        salary=20000;
        desig="Clerk";
	}	

    public void raiseSalry()
    {
		salary=salary+((salary*10)/100) ;

        System.out.println("salary: "+ salary);
	}

    public void cab()
    {
        System.out.println("Cab is allocated for manager");
    }

    public void pf()
    {
        System.out.println(" manager's pf");
    }
}	
public class Interfaceproject
{
	public static void main(String args[])
	{
		int ch1,ch2=0;
        Dev d=null;
		Tester t=null;
        Manager m=null;
        Clerk c=null;
        
		do{
			System.out.println("1) Create");
			System.out.println("2) Display");
			System.out.println("3) Raise Salary");
            System.out.println("4) Facilities");
			System.out.println("5) Exit");

			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the choice :");
			ch1= sc.nextInt();
		
			if(ch1==1)
			{
				do{
					System.out.println("1) Developer");
					System.out.println("2) Clerk");
					System.out.println("3) Manager");
					System.out.println("4) Tester");
					System.out.println("5) Exit");

					System.out.print("Enter the choice :");
			 		ch2= sc.nextInt();
		
					if(ch2==1)
					{
						d = new Dev();
					}
					if(ch2==2)
					{
						c = new Clerk();
					}
					if(ch2==3)
					{
						 m = new Manager();
					}
					if(ch2==4)
					{
						t = new Tester();
					}
                    if(ch2==5)
                    {
                        break;
                    }

				}while(ch1!=5);	
			}
			if(ch1==2)
			{       
                do{
					System.out.println("Display Profile .............!");
                    System.out.println("Enter whose salary you want tp raise: 1. developer\n 2.clerk\n 3.tester\n 4.manager\n 5.exit");
                    ch2=sc.nextInt();
                    
                    if(ch2==1)
                    d.display();
                    if(ch2==4)
					m.display();
                    if(ch2==2)
                    c.display();
                    if(ch2==3)
                    t.display();
                    if(ch2==5)
                    break;
                }while(ch2!=5);
                    
			}
			
			if(ch1==3)
			{       
                do{
					System.out.println("Raise Salary .............!");
                    System.out.println("Enter whose salary you want tp raise: 1. developer\n 2.clerk\n 3.tester\n 4.manager\n 5.exit");
                    ch2=sc.nextInt();
                    
                    if(ch2==1)
                    d.raiseSalry();
                    if(ch2==4)
					m.raiseSalry();
                    if(ch2==2)
                    c.raiseSalry();
                    if(ch2==3)
                    t.raiseSalry();
                    if(ch2==5)
                    break;
                }while(ch2!=5);
                    
			}

            else if(ch1==4)
            {
                do{
					System.out.println("facilitiess .............!");
                    System.out.println("Enter whose facility you want to see: 1. developer\n 2.clerk\n 3.tester\n 4.manager\n 5.exit");
                    ch2=sc.nextInt();
                    
                    if(ch2==1)
                    {
                         d.cab();
                        d.pf();
                    }

                    if(ch2==4)
                    {
					    m.cab();
                        m.pf();
                    }

                    if(ch2==2)
                    {
                        c.cab();
                        c.pf();
                    }

                    if(ch2==3)
                    {
                        t.cab();
                        t.pf();
                    }

                    if(ch2==5)
                    break;
                }while(ch2!=5);
                    
            }
			if(ch1==5)
			{
				System.out.println("Thank You");
				System.exit(0);
			}



		}while(ch1!=5);
		
	}
}

