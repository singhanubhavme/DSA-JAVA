import java.util.Arrays;

public class MoveNegativesToOneSide {
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int[] moveElements(int[] arr) { // check for all cases
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            if (arr[low] < 0) {
                low++;
            } else if (arr[low] >= 0 && arr[high] < 0) {
                swap(arr, low, high);
                low++;
                high--;
            } else if (arr[low] < 0 && arr[high] < 0) {
                low++;
            } else if (arr[low] >= 0 && arr[high] >= 0) {
                high--;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { -12, 11, -13, -5, 6, -7, 5, -3, -6, 13, 0, 54, -34, 543, 2134, -11, 0 };
        arr = moveElements(arr);
        System.out.println(Arrays.toString(arr));
    }
}
