import java.util.Arrays;

public class NextGreaterNumber {
    public static void main(String[] args) {
        int[] digits = {2, 1, 8, 7, 6, 5};
        nextGreater(digits); // Output: 251678
    public static void nextGreater(int[] digits) {
        int n = digits.length;
        int i = n - 2;

        // Step 1: Find the first decreasing element from the right
        while (i >= 0 && digits[i] >= digits[i + 1]) {
            i--;
        }

        if (i == -1) {
            System.out.println("-1"); // No greater number possible
            return;
        }

        // Step 2: Find the smallest number greater than digits[i] to the right
        int j = n - 1;
        while (digits[j] <= digits[i]) {
            j--;
        }

        // Step 3: Swap
        int temp = digits[i];
        digits[i] = digits[j];
        digits[j] = temp;

        // Step 4: Reverse the right part
        Arrays.sort(digits, i + 1, n);

        // Print the result
        for (int num : digits) {
            System.out.print(num);
        }
    }

   
    }
}

