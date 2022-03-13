import java.util.Arrays;

public class BubbleSort {
    static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void sort(int arr[]) {
        int len = arr.length;
        boolean swapped;
        for (int i = 0; i < len - 1; i++) {
            swapped = false;
            for (int j = 0; j < len - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                    swapped = true;
                }
            }
            if (swapped == false)
                break;
        }
    }

    public static void main(String args[]) {
        int arr[] = { 12, 43, 2, 65, 22, 2, 5, 99 };
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
