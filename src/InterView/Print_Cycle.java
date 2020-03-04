package InterView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * 求a/b的小数表现形式。如果a可以整除b则不需要小数点。如果是有限小数，则可以直接输出。
 * 如果是无限循环小数，则需要把小数循环的部分用"()"括起来。
 */
public class Print_Cycle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        if (a % b == 0) {
            System.out.println(a / b);//若为整数，则直接输出
        } else {
            //记录各位小数
            int c = a;
            ArrayList<Integer> xiaoshu = new ArrayList<Integer>();//存放小数
            HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();//使用hashMap查找重复的位置
            int loop = -1;
            c = c % b;
            while (c != 0) {
                if (map.containsKey(c)) {
                    loop = map.get(c);
                    break;
                } else {
                    xiaoshu.add(c * 10 / b);
                    map.put(c, map.size());//将小数对应位置记录
                }
                c = c * 10 / b;
            }
            if (loop == -1) {
                System.out.println(a / b);
                System.out.println('.');
                for (int i : xiaoshu) {
                    System.out.println(i);
                }
            } else {
                System.out.println(a / b);
                System.out.println('.');
                for (int j = 0; j < loop; j++) {
                    System.out.println(xiaoshu.get(j));
                }
                System.out.println('(');
                for (int k = 0; k < xiaoshu.size(); k++) {
                    System.out.println(xiaoshu.get(k));
                }
                System.out.println(')');

            }

        }
    }
}
