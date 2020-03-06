package InterView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class findNumber {
    public static void main(String[] args) {
    }
    public int[][] findContinuousSequence(int target){
        //暴力求解
        List<int[]> arr = new ArrayList<>();
        if (target<=2){
            return null;
        }
        for (int i=1;i<target/2+1;i++){
            int temp = target;
            int count = i;
            while (temp>0){
                temp-=count;
                count++;
            }
            if (temp == 0) {
                int[] arry = new int[count-i];
                int a =i;
                for (int j = 0; j < arry.length; j++) {
                    arry[j] = a;
                    a++;
                }
                arr.add(arry);
            }
        }
        return arr.toArray(new int[0][]);
        //滑动窗口
//        int min = 1;
//        int max = 2;
//        int sum = min+max;
//        while (min<max&&max<=target/2+1){
//            if(sum<target){
//                max++;
//                sum = sum+max;
//            } else if (sum > target) {
//                sum-=min;
//                min++;
//            }else {
//                int[] array = new int[max-min+1];
//                int j = min;
//                for (int k = 0; k < array.length; k++) {
//                    array[k] = j;
//                    j++;
//                }
//                arr.add(array);
//                sum-=min;
//                min++;
//            }
//        }
//        return arr.toArray(new int[0][]);
    }


}
