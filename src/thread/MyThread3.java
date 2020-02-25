package thread;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class MyThread3 implements Callable<String> {
    private int count = 20;

    @Override
    public String call() throws Exception {
        for (int i = count; i > 0; i++) {
            Thread.yield();
            System.out.println(Thread.currentThread().getName()+"-当前剩余票数:"+count--);
        }
        return "sale out";
    }

    public static void main(String[] args) {
        Callable<String> callable=new MyThread3();
        FutureTask<String> futureTask = new FutureTask<>(callable);
        Thread thread1 = new Thread(futureTask);
        Thread thread2 = new Thread(futureTask);
        Thread thread3 = new Thread(futureTask);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
