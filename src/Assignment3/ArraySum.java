package Assignment3;

public class ArraySum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        System.out.println("Sum of array elements: " + arraySum(arr, n));
    }

    public static int arraySum(int[] arr, int n) {
        // Base case
        if (n == 0) {
            return 0;
        } else {
            // Recursive case
            return arr[n - 1] + arraySum(arr, n - 1);
        }
    }
}
