import java.util.Arrays;

class Solution {
    public void reverseString(char[] s) {
        int i = 0, j = s.length - 1;
        while (i < j) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
    }
}

public class ReverseString {
    public static void main(String[] args) {
        Solution obj = new Solution();
        char[] s = { 'h', 'a', 'n', 'n', 'a', 'H' };
        obj.reverseString(s);
        System.out.println(Arrays.toString(s));
    }

}
