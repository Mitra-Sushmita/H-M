abstract class Bank
{
    abstract void ATM();
    abstract void KYC();
}

class SBI extends Bank
{
    void ATM()
    {
        System.out.println("500000");
    }

    void KYC()
    {
        System.out.println("SBI KYC");
    }
}

class Axis extends Bank
{
    void ATM()
    {
        System.out.println("30000");
    }

    void KYC()
    {
        System.out.println("Axis KYC");
    }
}


public class Abstraction 
{
    public static void main(String[] args) {
        SBI s=new SBI();
    s.ATM();
    s.KYC();

    Axis a=new Axis();
    a.ATM();
    a.KYC();
    }
        
}
