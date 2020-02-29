package IOPractice;

import java.io.IOException;
import java.io.PipedInputStream;

public class Recive implements Runnable {
    private PipedInputStream input=null;

    public Recive() {
        this.input = new PipedInputStream();
    }

    public PipedInputStream getInput() {
        return this.input;
    }

    @Override
    public void run() {

        byte[] b=new byte[1000];
        int len = 0;
        try {
            len=this.input.read(b);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            input.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("接受内容为："+(new String(b,0,len)));
    }
}
