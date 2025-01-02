package thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CustomThread2Driver {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService es= Executors.newFixedThreadPool(10);
        Future<Integer>f=es.submit(new CustomThread2());
        System.out.println(f.get());
    }
}
