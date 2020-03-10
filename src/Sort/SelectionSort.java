package Sort;
/*
选择排序：每次从中寻找最小的数字
 */
public class SelectionSort {
    public int[] selectSort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j]=temp;
                }
            }
        }
        return a;
    }
}
