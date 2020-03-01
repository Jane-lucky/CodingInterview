package thread;

import java.util.concurrent.*;

public class CallableDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
//创建线程池对象
        ExecutorService pool= Executors.newFixedThreadPool(80);
        Future<Integer> f1=pool.submit(new MyCallable(100));
        Future<Integer> f2=pool.submit(new MyCallable(200));
        Integer i1= f1.get();
        Integer i2= f2.get();
        System.out.println(i1);
        System.out.println(i2);
        pool.shutdown();
    }
}
