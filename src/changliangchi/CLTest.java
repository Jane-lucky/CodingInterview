package changliangchi;

public class CLTest {
    public static void main(String[] args) {
        String s = new String("s");
        String s1 = "s";
        s.intern();
        System.out.println(s==s1);

        String s3 = new String("s") + new String("s");
        s3.intern();
        String s4 = "ss";
        System.out.println(s3==s4);
    }
}
