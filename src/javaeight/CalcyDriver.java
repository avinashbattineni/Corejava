package javaeight;

public class CalcyDriver {
    public static void main(String[] args) throws InterruptedException{
        Calcy c = CalcyImpl::add;
        {
               int result=c.sum(10,456);
            System.out.println(result);
        }
    }
}
