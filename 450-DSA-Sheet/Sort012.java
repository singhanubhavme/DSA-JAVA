// https://leetcode.com/problems/sort-colors/

import java.util.Arrays;

class Solution {
    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void sortColors(int[] nums) { // DNF sort
        // decrease the size of unknown array partition
        // keep adding elements to knows partitions
        int low = 0, mid = 0, high = nums.length - 1;
        while (mid <= high) {
            if (nums[mid] == 1) {
                mid++;
            } else if (nums[mid] == 0) {
                swap(nums, mid, low);
                mid++;
                low++;
            } else if (nums[mid] == 2) {
                swap(nums, mid, high);
                high--;
            }
        }
    }
}

public class Sort012 {
    public static void main(String[] args) {
        int[] nums = { 2, 0, 2, 1, 1, 0 };
        new Solution().sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
}