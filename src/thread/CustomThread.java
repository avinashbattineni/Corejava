package thread;

public class CustomThread extends Thread{
    public void run()
    {
        this.disp();
    }
    public void disp()
    {
        for(int i=0;i<=10;i++)
        {
            System.out.println(i);
        }
    }
}
