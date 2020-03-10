package Sort;

/*
归并排序：每次都会自动成为一组。两两合并
 */
public class MergingSort {
    public int[] mergingSort(int[] a) {
        if (a.length > 0) {
            mergingSortRecursion(a,0,a.length-1);
        }
        return a;
    }

    public void mergingSortRecursion(int[] a, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;
            mergingSortRecursion(a,left,middle);
            mergingSortRecursion(a,middle+1,right);
            merge(a,left,middle,right);
        }
    }

    public void merge(int[] a, int left, int right, int middle) {
        int[] temp = new int[a.length];
        int i = left;//左边序列的游标
        int j = middle + 1;//右边序列的游标
        int k = right;//临时序列的游标

        //从两个数组中取出最小的放入中间数组
        while (i <= middle && j <= right) {
            if (a[i] <= a[j]) {
                temp[k++] = a[i++];
            }else {
                temp[k++] = a[j++];
            }
        }

        //剩余的部分一次放入中间组
        while (j <= right) {
            temp[k++] = a[j++];
        }
        while (i <= middle) {
            temp[k++] = a[i++];
        }

        //将中间的数组中的内容复制回原数组
        while (left <= right) {
            a[left] = temp[left++];
        }
    }

}
