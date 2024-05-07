class P
{
    int money=20000;
    String car="Bmw";
    private String newcar="Benz";  // making it private, so scope is within the class
    int site=5;

    void use()
    {
        System.out.println("Money: "+ money);
        System.out.println("car: "+ car);
        System.out.println("newcar: "+ newcar);

    }
}

class C extends P
{
    int money=1000;

    void use()
    {
        System.out.println("Money:"+money);
        System.out.println("Parent money: "+ super.money); //if child and parent class is having same variable name then super keyword is used to identify the parent class property
        System.out.println("car:"+car);
        System.out.println("site: "+site);
    }
}

class SnglLvlInheritance
{
    public static void main(String[] args) 
    {
        C c=new C();
         c.use();
    }
    
}
