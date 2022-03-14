import java.util.Arrays;

public class SortMidHighMergedArray {
    static int[] sort(int arr[], int low, int mid, int high) {
        int i = low, j = mid + 1, k = 0;
        int a[] = new int[high - low + 1];
        while (i <= mid && j <= high) {
            if (arr[i] >= arr[j]) {
                a[k++] = arr[j++];
            } else {
                a[k++] = arr[i++];
            }
        }
        while (i <= mid) {
            a[k++] = arr[i++];
        }
        while (j <= high) {
            a[k++] = arr[j++];
        }
        return a;
    }

    public static void main(String args[]) {
        int arr[] = { 12, 5, 8, 12, 14, 27, 56, 58, 12, 66 };
        int low = 1, mid = 4, high = 7;
        int a[] = sort(arr, low, mid, high);
        System.out.print(Arrays.toString(a));
    }
}
