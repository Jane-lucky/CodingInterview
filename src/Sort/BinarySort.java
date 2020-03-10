package Sort;

public class BinarySort {
    public int[] binarySort(int[] a) {
        int i,j;
        int low,high,middle;
        int temp;
        for (i = 1; i < a.length; i++) {
            temp = a[i];
            low = 0;
            high = i-1;
            while (low < high) {
                middle = (low+high)/2;
                if (a[middle] > temp) {
                    high = middle-1;
                }else {
                    low = middle+1;
                }
            }
            for (j = i - 1; j > high; j--) {
                a[j+1] = a[j];
            }
            a[high +1] = temp;
        }
        return a;
    }
}
