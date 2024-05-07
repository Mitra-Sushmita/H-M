public class Static {
    public static void main(String[] args) {
        System.out.println(A.x);
        A.display();
    }
}

class A 
{
    static int x=1000; //By making it static we can avoid of creating objects. Thats why main method is static.
    static void display()
    {
        System.out.println("helloo");
    }
}
