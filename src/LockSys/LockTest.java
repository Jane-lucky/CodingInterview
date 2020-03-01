package LockSys;

import java.util.concurrent.locks.ReentrantLock;

public class LockTest {
    ReentrantLock reentrantLock = new ReentrantLock();
//标准用法
    public void m() {
        reentrantLock.lock();
        try {

        }finally {
            reentrantLock.unlock();
        }
    }
}
