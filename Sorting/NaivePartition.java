import java.util.Arrays;

public class NaivePartition {
    static int partition(int arr[], int l, int h, int p) {
        int temp[] = new int[h - l + 1];
        int k = 0;
        for (int i = l; i <= h; i++) {
            if (arr[i] <= arr[p] && i!=p) {
                temp[k++] = arr[i];
            }
        }
        temp[k++] = arr[p];
        int x = k - 1;
        for (int i = l; i <= h; i++) {
            if (arr[i] > arr[p]) {
                temp[k++] = arr[i];
            }
        }
        for (int i = l; i <= h; i++) {
            arr[i] = temp[i - l];
        }
        return x;
    }

    public static void main(String args[]) {
        int arr[] = {  8, 4, 7, 9, 3, 10, 5 };
        int i = partition(arr, 0, arr.length-1, 0);
        System.out.println(Arrays.toString(arr));
        System.out.print(i);
    }
}
