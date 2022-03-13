public class LinearSearch {
    public static void linearSearch(int arr[], int key) { // O(n)
        for (int i = 0; i < arr.length; i++) {
            if (key == arr[i]) {
                System.out.println("Key found at " + i);
                System.out.println("Number of Comparisons are " + (i + 1));
                return;
            }
        }
    }

    public static void main(String args[]) {
        int arr[] = { 23, 534, 12, 65, 1, 2, 23, 54, 654 };
        int key = 12;
        linearSearch(arr, key);
    }
}
