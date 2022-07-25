// https://leetcode.com/problems/intersection-of-two-arrays/
import java.util.*;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) { // NlogN => O(NlogN) + O(m+n)
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int[] intersection = new int[nums1.length + nums2.length];
        int i = 0, j = 0, k = 0, n = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] > nums2[j]) {
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                intersection[k++] = nums1[i];
                i++;
                j++;
                n++;
                if (k - 2 >= 0 && intersection[k - 1] == intersection[k - 2]) {
                    k--;
                    n--; // to check duplicates in intersection
                }
            }
        }
        return Arrays.copyOf(intersection, n);
    }
}

public class IntersectionOfArray {
    public static void main(String[] args) {
        int[] a = { 4, 9, 5 };
        int[] b = { 9, 4, 9, 8, 4 };
        System.out.println(Arrays.toString(new Solution().intersection(a, b)));
    }
}