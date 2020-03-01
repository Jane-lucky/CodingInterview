package thread;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer> {
    private int number;

    public MyCallable(int number) {
        this.number=number;
    }

    @Override
    public Integer call() throws Exception {
        int sum=0;
        for (int i = 0; i <= number; i++) {
            sum+=i;
        }

        return sum;
    }
}
