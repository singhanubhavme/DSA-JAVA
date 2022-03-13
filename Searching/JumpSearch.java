public class JumpSearch {
    public static int jumpSearch(int arr[], int key) { // O(root(n))
        int i = 0;
        while (key > arr[i]) {
            if (i == 0)
                i = 1;
            else
                i *= 2;
            if (i >= arr.length)
                break;
        }
        i /= 2;
        for (int j = i; j < arr.length; j++) {
            if (key == arr[j]) {
                return j;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int arr[] = { -12, 0, 4, 12, 34, 45, 56, 87, 98, 111, 544, 654, 745, 856, 967 };
        int key = 111;
        int index = jumpSearch(arr, key);
        if (index != -1) {
            System.out.println("Element found at " + index);
        } else {
            System.out.println("Element not found");
        }
    }
}
