import java.util.*;

class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        int n = arr.length;
        if (n < 1)
            return new ArrayList<Integer>();
        int biggest = arr[n - 1];
        ArrayList<Integer> lads = new ArrayList<Integer>();
        lads.add(arr[n - 1]);
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] >= biggest) {
                lads.add(arr[i]);
                biggest = arr[i];
            }
        }
        Collections.reverse(lads);
        return lads;
    }
}

public class LeadersInArray {
    public static void main(String[] args) {
        int[] A = { 16, 17, 4, 3, 5, 2 };
        System.out.println(Solution.leaders(A));
    }
}