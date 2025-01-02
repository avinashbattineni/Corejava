package javaeight;
public class ThreadByLambda {
    public static void main(String[] args) {
        Runnable r=()->
        {
              for(int i=0;i<=10;i++)
              {
                  System.out.println(i);
                  try{
                      Thread.sleep(1000);
                  }
                  catch(Exception e)
                  { }
              }
        };
        Thread t=new Thread(r);
        t.start();
    }
}
