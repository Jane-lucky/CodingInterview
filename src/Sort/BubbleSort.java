package Sort;

/**
 * 冒泡排序：比较相邻的元素
 * 升序
 */
public class BubbleSort {
    public void Bubble(int[] arr) {
        int j,i;
        for (i = 0; i < arr.length; i++) {//保证循环次数
            int flag=0;
            for (j = 0; j < arr.length-i-1; j++) {//每次都会保证最大值在最后一个
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag=1;
                }
            }
            if(flag==0) break;
        }
        //输出
    }
}
