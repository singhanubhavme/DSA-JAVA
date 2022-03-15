import java.util.Arrays;

public class HoaresPartition {
    static void swap(int arr[], int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    static int partition(int arr[], int l, int h) {
        int pivot = arr[l];
        int i = l - 1, j = h + 1;
        while (true) {
            do {
                i++;
            } while (arr[i] < pivot);
            do {
                j--;
            } while (arr[j] > pivot);
            if (i >= j) {
                System.out.println(Arrays.toString(arr));
                return j;
            }
            swap(arr, i, j);
        }
    }

    public static void main(String args[]) {
        int arr[] = { 5, 3, 8, 4, 2, 7, 1, 10 };
        int n = partition(arr, 0, arr.length - 1);
        System.out.print(n);
    }
}