package changliangchi;

import java.util.HashSet;
import java.util.Set;

/**
 * 内存泄露
 */
public class LeakOut {
    public static void main(String[] args) {
        Set set = new HashSet();
        for (int i = 0; i < 10; i++) {
            Object object = new Object();
            set.add(object);
            //对象设置为空，我之后不会再使用
            object=null;
        }
        System.out.println(set);//对象依旧被维护，所以GC不会回收该垃圾
    }
}
