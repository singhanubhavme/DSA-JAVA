public class FrequencyInSortedArray {
    static void findFrequencyInSortedArray(int[] arr) {
        if (arr.length == 1) {
            System.out.println(arr[0] + " " + 1);
            return;
        }
        int freq = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                freq++;
            } else {
                System.out.println(arr[i - 1] + " " + freq);
                freq = 1;
            }

            if (i == arr.length - 1) {
                System.out.println(arr[i] + " " + freq);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 10, 10, 10, 25, 30, 30, 30, 30, 40, 40 };
        findFrequencyInSortedArray(arr);
    }
}
