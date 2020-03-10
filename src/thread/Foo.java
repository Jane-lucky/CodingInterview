package thread;

import java.util.concurrent.atomic.AtomicInteger;

/*
我们提供了一个类：

public class Foo {
  public void one() { print("one"); }
  public void two() { print("two"); }
  public void three() { print("three"); }
}
三个不同的线程将会共用一个 Foo 实例。

线程 A 将会调用 one() 方法
线程 B 将会调用 two() 方法
线程 C 将会调用 three() 方法
请设计修改程序，以确保 two() 方法在 one() 方法之后被执行，three() 方法在 two() 方法之后被执行。
 */
public class Foo {

    private AtomicInteger firstJobDone = new AtomicInteger(0);
    private AtomicInteger secondJobDone = new AtomicInteger(0);
    public Foo() {

    }

    public void first(Runnable printFirst) throws InterruptedException {

        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        //mark the first job as done,by increasing its counts
        firstJobDone.incrementAndGet();
    }

    public void second(Runnable printSecond) throws InterruptedException {

        while (firstJobDone.get()!=1){
            //waiting
        }
        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();
        secondJobDone.incrementAndGet();
    }

    public void third(Runnable printThird) throws InterruptedException {

        while (secondJobDone.get()!=1){
            //waiting
        }
        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
    }
}
