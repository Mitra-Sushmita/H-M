abstract class A 
{
    
    int a;
    A(){

    }
    void m1()
    {
        System.out.println("hello m1");
    }

    abstract void m2();
}

class B extends A
{
    void m2()
    {
        System.out.println("Hello m2");
    }
}
public class AbstractClass 
{
    public static void main(String[] args) {
       // A a=new A();
       B b = new B();
       System.out.println(b.a);
       b.m1();
       b.m2();
    }
}
