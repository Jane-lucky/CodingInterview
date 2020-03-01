package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class AtomicMain {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService service = Executors.newCachedThreadPool();
        Count count = new Count();
        for (int i = 0; i < 100; i++) {
            service.execute(()->count.increase());
        }
        //等待上述线程执行完
        service.shutdown();
        service.awaitTermination(1, TimeUnit.DAYS);
        System.out.println("开始执行——————————");
        System.out.println(count.getCount());
    }
}
class Count{
//    private Integer count=0;


    private AtomicInteger count = new AtomicInteger(0);
    public Integer getCount() {
        return count.get();
    }
    public void increase(){
        count.incrementAndGet();
    }
}
