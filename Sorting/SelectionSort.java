import java.util.Arrays;

public class SelectionSort {
    static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void sort(int arr[]) {
        int len = arr.length;
        for (int i = 0; i < len - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < len; j++) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
            swap(arr, i, minIndex);
        }
    }

    public static void main(String args[]) {
        int arr[] = { 10, 5, 8, 20, 2, 18 };
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}