package IOPractice;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
//消息发送类
public class Send implements Runnable {
    private PipedOutputStream out = null;

    public Send(){
        out = new PipedOutputStream();
    }

    public PipedOutputStream getOut() {
        return this.out;
    }

    @Override
    public void run() {
        String message = "Hello,Jack";
        try {
            out.write(message.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
