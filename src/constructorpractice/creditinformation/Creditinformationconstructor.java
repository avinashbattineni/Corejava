package constructorpractice.creditinformation;

public class Creditinformationconstructor {
    String creditCardName;
    String Accholder;
    int Creditlimit;
    Creditinformationconstructor()
    {
        creditCardName="AMEX";
        Accholder="ABHI";
        Creditlimit=1000;
    }
    public void disp()
    {
        System.out.println(creditCardName+ "\n"+ Accholder+ "\n"+ Creditlimit);

    }
    public static void main(String []args)
    {
        Creditinformationconstructor c= new Creditinformationconstructor();
        c.disp();

    }

}
