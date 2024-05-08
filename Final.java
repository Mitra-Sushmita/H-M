final class A // making class as final means noone is allowed to inherit this class
{
    final int site=5;// making variable as final means no modification can be done
    String car="benz";
    final int speed=200;

    final void gaer() // making method as final means no one can override this method
    {
        System.out.println("4");
    }
}
class B 
{

}

public class Final
 {
    public static void main(String[] args) {
        A a=new A();
        a.gaer();
    }
}
