class A
{
    A(){
    System.out.println("A class");
}
}

class B
{
    public static void main(String args[])
    {
        System.out.println("B class");
        A a=new A();
        Demo2 d=new Demo2();
    }
}


public class Demo2
{
    Demo2()
    {
        System.out.println("Demo2 class");
    }
}

// while compiling write filename.java
// while running write the classnam which is having main method
//we can make the class as public class which is having the same name as the file name