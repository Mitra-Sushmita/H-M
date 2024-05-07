class P
{
    P()
    {
        System.out.println("P class");
    }
}

class C extends P
{
    C()
    {
        System.out.println("C class");
    }
}

public class Demmo5 
{
    public static void main(String[] args) {
        C c =new C();// As soon as we create the child class object , then by default first parent class constructor will get executed then it will come to child class.
    }
    
}
