//same constructor name with different parameters multiple times in the same class is known as constructor overloading
class A
{
    A()
    {
        System.out.println("A()");
    }

    A(int a)
    {
        System.out.println("A(int a)");
    }

    A(int a,int b)
    {
        System.out.println("A(int a,int b)");
    }

    A(String a,int b)
    {
        System.out.println("A(String a,int b)");
    }

}

public class Constructor_Overloading 
{
    public static void main(String[] args) {
        A a=new A();
        A a1=new A(10);
        A a2=new A(2,3);
    }    
}
