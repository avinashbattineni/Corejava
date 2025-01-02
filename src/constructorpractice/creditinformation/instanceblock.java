package constructorpractice.creditinformation;

public class instanceblock {
    String creditCardName;
    String Accholder;
    int Creditlimit;

    {
         creditCardName="AMEX";
        Accholder="abhi";
         Creditlimit=1000;
    }
    public void disp()
    {
        System.out.println(creditCardName+ "\n"+ Accholder+ "\n"+ Creditlimit);

    }
    public static void main(String []args)
    {
        instanceblock i =new instanceblock();
        i.disp();

    }
}
