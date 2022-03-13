import java.util.Arrays;

public class InsertionSort {
    static void sort(int arr[]) {
        int len = arr.length;
        for (int i = 1; i < len; i++) {
            int key = arr[i], j = i - 1;
            while (j >= 0) {
                if (key > arr[j])
                    break;
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String ar[]) {
        int arr[] = { 20, 5, 40, 60, 10, 30 };
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
