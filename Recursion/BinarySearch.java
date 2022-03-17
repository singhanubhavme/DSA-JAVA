public class BinarySearch {
    static int search(int arr[], int key, int start, int mid, int end) {
        if (start > end)
            return -1;
        else if (key < arr[mid])
            return search(arr, key, start, start + (end - start) / 2, mid - 1);
        else if (key > arr[mid])
            return search(arr, key, mid + 1, start + (end - start) / 2, end);
        else
            return mid;
    }

    public static void main(String args[]) {
        int arr[] = { -12, 0, 1, 16, 43, 65, 765, 876 };
        int key = 0, start = 0, end = arr.length - 1, mid = start + (end - start) / 2;
        int index = search(arr, key, start, mid, end);
        if (index != -1)
            System.out.println(key + " is found at Index " + index);
        else
            System.out.println(key + " is not found");
    }

}
