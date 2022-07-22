// https://leetcode.com/problems/removing-minimum-and-maximum-from-array/

class Solution {
    public int minimumDeletions(int[] nums) {
        int len = nums.length;
        int max = nums[0], maxIndex = 0, min = nums[0], minIndex = 0;
        for (int i = 0; i < len; i++) {
            if (nums[i] > max) {
                max = nums[i];
                maxIndex = i;
            }
            if (nums[i] < min) {
                min = nums[i];
                minIndex = i;
            }
        }
        int minToRemove1 = -1, minToRemove2 = -1, minToRemove3 = -1;
        // case 1 : delete from front
        int rightNum = maxIndex > minIndex ? maxIndex : minIndex;
        minToRemove1 = (rightNum + 1);

        // case 2 : delete from back
        int leftNum = maxIndex < minIndex ? maxIndex : minIndex;
        minToRemove2 = (len - leftNum);

        // case 3 : delete from front and back
        minToRemove3 = (len - rightNum) + (leftNum + 1);

        return Math.min(Math.min(minToRemove1, minToRemove2), minToRemove3);
    }
}

public class RemoveMinimumAndMaximumFromArray {
    public static void main(String[] args) {

        int[] nums = { 2, 10, 7, 5, 4, 1, 8, 6 };
        System.out.println(new Solution().minimumDeletions(nums));
    }
}
