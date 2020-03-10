package Sort;
/*
插入排序：每次都被规定成为有序
 */
public class InsertSort {
    public int[] insertSort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int temp = a[i];//哨兵的位置
            int j=i;
            while (j > 0 && temp < a[j - 1]) {
                a[j] = a[j-1];
                j--;
            }
            a[j]=temp;
        }
        return a;
    }
}
