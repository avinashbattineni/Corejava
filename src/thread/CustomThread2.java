package thread;

import java.util.concurrent.Callable;
public class CustomThread2 implements Callable {
    public Integer call( )
    {
          int n1=10;
          int n2=20;
          int sum=n1+n2;
          return sum;
    }
  }
