package thread;

public class MyThread2 implements Runnable {
    public static int count=20;
    @Override
    public void run() {
        while (count > 0) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"-当前剩余票数:"+count--);
        }

    }

    public static void main(String[] args) {
        MyThread2 myThread2 = new MyThread2();
        Thread thread1 = new Thread(myThread2, "线程1");
        Thread thread2 = new Thread(myThread2, "线程2");
        Thread thread3 = new Thread(myThread2, "线程3");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
