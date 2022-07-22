import java.util.Arrays;

public class QuickSort {
    static void swap(int arr[], int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    static int partition(int arr[], int l, int h) { // Hoares Partition
        int pivot = arr[l];
        int i = l - 1, j = h + 1;
        while (true) {
            do {
                i++;
            } while (arr[i] < pivot);
            do {
                j--;
            } while (arr[j] > pivot);
            if (i >= j)
                return j;
            swap(arr, i, j);
        }
    }

    static int partitionNaive(int[] arr, int s, int e) { // Naive Partition
        int pivot = s;
        int[] temp = new int[e - s + 1];
        int k = 0;
        for (int i = s; i <= e; i++) {
            if (arr[i] < arr[pivot]) {
                temp[k++] = arr[i];
            }
        }
        int part = s + k;
        for (int i = s; i <= e; i++) {
            if (arr[i] == arr[pivot]) {
                temp[k++] = arr[i];
            }
        }
        for (int i = s; i <= e; i++) {
            if (arr[i] > arr[pivot]) {
                temp[k++] = arr[i];
            }
        }
        for (int i = s; i <= e; i++) {
            arr[i] = temp[i - s];
        }
        return part;
    }

    static void sort(int arr[], int l, int h) {
        if (l < h) {
            int p = partition(arr, l, h);
            sort(arr, l, p);
            sort(arr, p + 1, h);
        }
    }

    public static void main(String args[]) {
        int arr[] = { 8, 4, 7, 9, 3, 10, 5, 15 , 234, -23, 0, 436, -12312, 534, 765, 0, 6546, 1};
        sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
