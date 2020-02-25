package thread;

public class MyThread1 extends Thread {
    public MyThread1() {

    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread()+":"+i);
        }
    }

    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread1 thread = new MyThread1();
        MyThread1 thread1 = new MyThread1();
        t1.start();
        thread.start();
        thread1.start();
    }
}
