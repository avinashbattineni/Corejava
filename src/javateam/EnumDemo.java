package javateam;

public class EnumDemo
{
    enum Levels {
        LOW,
        MEDIUM,
        HIGH,
    }
    public static void main(String[] args)
    {
        for(Levels x:Levels.values())
        {
            System.out.println(x);
        }
    }
}
