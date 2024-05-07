public class Method_Overriding {
    public static void main(String[] args) {
        SBI s =new SBI();
        s.roi();

        Axis a=new Axis();
        a.roi();
    }
}

class Bank
{
    public void roi()
    {
        System.out.println("10%");
    }
}

class Axis extends Bank
{
    public void roi()
    {
        System.out.println("12%");
    }
}

class SBI extends Bank{

}
