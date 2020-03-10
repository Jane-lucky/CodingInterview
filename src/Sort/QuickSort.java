package Sort;
/*
快速排序：分治的方法进行排序
 */
public class QuickSort {
    public int[] quickSort(int[] a) {
        if (a.length > 0) {
            quickSortRecursion(a,0,a.length-1);
        }
        return a;
    }

    public void quickSortRecursion(int[] data, int low, int high) {
        if (low < high) {
            int middle = partition(data,low,high);
            partition(data,low,middle-1);
            partition(data,middle+1,high);
        }
    }

    public int partition(int[] data, int low, int high) {
        int temp  =data[low];
        while (low < high) {
            while (low < high && data[high] >= temp) {
                high--;
            }
            data[low]=data[high];
            while (low < high && data[low] >= temp) {
                low++;
            }
            data[high] = data[low];
        }
        data[low] = temp;
        return low;
    }

    public void quickSoet(int arr[], int _left, int _right) {
        int left = _left;
        int right = _right;
        int temp;
        if (left < right) {
            temp = arr[left];//作为开始的基准
            while (left != right){
                while (right > left && arr[right] >= temp) right--;
                arr[left]=arr[right];
                while (left<right&&arr[left]<=temp) left++;
                arr[right] = arr[left];
            }
            arr[right] = temp;
            quickSoet(arr,_left,right-1);
            quickSoet(arr,right+1,_right);

        }
    }

}
