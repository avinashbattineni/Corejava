package thread;

public class CustomThread1 implements Runnable{
    public void run()
    {
        this.even(10);
    }
    public void even(int number)
    {
        if (number%2==0)
        {
            System.out.println("even number");
        }
        else
        {
            System.out.println("odd number");
        }
    }
}
