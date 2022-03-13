public class BinarySearch {
    public static void binarySearch(int arr[], int key) { // O(log(n))
        int start = 0, end = arr.length - 1, mid;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (arr[mid] > key) {
                end = mid - 1;
            } else if (arr[mid] < key) {
                start = mid + 1;
            } else {
                System.out.println("Element found at " + mid);
                break;
            }
        }
    }

    public static void main(String args[]) {
        int arr[] = { -12, 0, 4, 12, 34, 45, 56, 87, 98, 111, 544 };
        int key = 0;
        binarySearch(arr, key);
    }
}
