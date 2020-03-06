package InterView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> arr = new ArrayList<String>();
        Long num = input.nextLong();
        int index = input.nextInt();
        String s = num.toString();
        String s1 = new String();
        String s2 = new String();
        char[] c1 = s.toCharArray();
        for (int i = index-1;i<c1.length-1;i++){
            c1[i] = c1[i+1];
        }

        for (int i = 0; i < c1.length; i++) {
            System.out.print(c1[i]);
        }
        System.out.println("\n");
        if (s.length() != 8) {
            System.out.println("error");
        } else {
            s1 = s.substring(index);
            s2 = s.substring(0,index-1);
            s=s2.concat(s1);
            char[] c = s.toCharArray();
            Arrays.sort(c);
            for (int i = 0; i < c.length; i++) {
                System.out.print(c[i]);
            }
//            arr.add(s);
//            Collections.sort(arr);
//            for (String str:arr){
//                System.out.println(str);
//            }
        }
//        ArrayList<Integer> arr = new ArrayList<Integer>();
//        while (input.hasNext()) {
//            int h = input.nextInt();//晚上下落的高度
//            if (h == 0) {
//                break;
//            }
//            int m = input.nextInt();//白天爬的高度
//            int n = input.nextInt();//井深
//            int day = (h - m)/(m-n)+1;
//            arr.add(day);
//        }
//        for (int i=0;i<arr.size();i++)
//            System.out.println(arr.get(i));



    }
}
