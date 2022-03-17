public class Subsets {
    static void generate(String s, String current, int index) {
        if (s.length() == index) {
            System.out.print(current + " ");
            return;
        }
        generate(s, current, index + 1);
        generate(s, current + s.charAt(index), index + 1);

    }

    public static void main(String args[]) {
        String s = "ABC";
        generate(s, "", 0);
    }

}
