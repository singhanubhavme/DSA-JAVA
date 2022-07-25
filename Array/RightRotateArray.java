import java.util.Arrays;

class RightRotateArray {
    static int[] rightRotate(int[] nums, int d) {
        int len = nums.length;
        int[] arr = new int[len];

        while (d >= len) {
            d -= len;
        }
        if (len < 2 || d == 0)
            return nums;
        int start = len - d, end = start - 1;
        int k = 0;
        while (start != end) {
            arr[k++] = nums[start++];
            if (start == len) {
                start = 0;
            }
        }
        arr[k] = nums[end];
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int d = 4;
        arr = rightRotate(arr, d);
        System.out.println(Arrays.toString(arr));
    }
}