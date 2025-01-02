package constructorpractice.creditinformation;

public class creditinformationparametarised {
    String creditCardName;
    String Accholder;
    int creditlimit;
    creditinformationparametarised(String creditCardName, String Accholder, int creditlimit)
    {
        this.creditCardName=creditCardName;
                this.Accholder=Accholder;
        this.creditlimit=creditlimit;

    }
    public void disp()
    {
        System.out.println(creditCardName+ "\n"+ Accholder+ "\n"+ creditlimit);

    }
    public static void main(String []args)
    {
        creditinformationparametarised c= new creditinformationparametarised("AMEX","ABHI",1000);
        creditinformationparametarised c1= new creditinformationparametarised("JPMC","ANJANI",2000);

        c.disp();
        c1.disp();

    }
}

