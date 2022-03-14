import java.util.Arrays;

public class MergeTwoSortedArrays {
    static int[] merge(int a[], int b[]) {
        int arr[] = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] >= b[j]) {
                arr[k++] = b[j++];
            } else {
                arr[k++] = a[i++];
            }
        }
        while (i != a.length) {
            arr[k++] = a[i++];
        }
        while (j != b.length) {
            arr[k++] = b[j++];
        }
        return arr;
    }

    public static void main(String args[]) {
        int a[] = { -3, 0, 2, 10, 20, 35, 65 };
        int b[] = { 0, 1, 5, 50, 50, 56, 65, 88, 100 };
        int arr[] = merge(a, b);
        System.out.print(Arrays.toString(arr));
    }
}