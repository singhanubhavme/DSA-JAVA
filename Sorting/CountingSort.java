import java.util.Arrays;

public class CountingSort {
    static void sort(int arr[], int k) {
        int count[] = new int[k];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        int index = 0;
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < count[i]; j++) {
                arr[index++] = i;
            }

        }
    }

    public static void main(String args[]) {
        int arr[] = { 2, 1, 8, 9, 4 };
        sort(arr, 10);
        System.out.println(Arrays.toString(arr));
    }
}
