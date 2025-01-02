package javateam;

public class SingletonEx
{
    private static Demo d=null;
    private SingletonEx()
    {

    }
    public static Demo getInstance()
    {
        if(d==null)
        {
            d=new Demo();
        }
        return d;
    }


}
