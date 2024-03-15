package Assignment3;

public class CountDigits {
    public static void main(String[] args) {
        int number = 1234567;
        System.out.println("Number of digits in " + number + ": " + countDigits(number));
    }

    public static int countDigits(int n) {
        // Base case
        if (n < 10) {
            return 1;
        } else {
            // Recursive case
            return 1 + countDigits(n / 10);
        }
    }
}
