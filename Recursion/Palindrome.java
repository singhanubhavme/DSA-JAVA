public class Palindrome {
    static boolean palindrome(String s, int start, int end) {
        if (start >= end)
            return true;
        return (s.charAt(start) == s.charAt(end)) && palindrome(s, start + 1, end - 1);
    }

    public static void main(String args[]) {
        String s = "abba";
        int start = 0, end = s.length() - 1;
        if (palindrome(s, start, end))
            System.out.print("String is Palindrome");
        else
            System.out.print("String is Not Palindrome");
    }
}
