package IOPractice;

import java.io.IOException;

public class Hello {
    public static void main(String[] args) throws IOException{
        Send send = new Send();
        Recive recive = new Recive();
        try {
            send.getOut().connect(recive.getInput());
        } catch (IOException e) {
            e.printStackTrace();
        }
        new Thread(send).start();
        new Thread(recive).start();
    }
}
