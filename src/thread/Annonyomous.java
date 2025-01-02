package thread;

public class Annonyomous {
    public static void main(String[] args) {
        Thread t=new Thread()
        {
            public void run()
            {
                for(int i=1;i<=10;i++)
                {
                    System.out.println(i);
                }
            }
        };
        t.start();
    }
}
