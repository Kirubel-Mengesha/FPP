package Assignment3;

public class ReverseDigits {
    public static void main(String[] args) {
        int number = 12345;
        System.out.println("Original number: " + number);
        System.out.println("Digits in reverse order:");
        displayDigitsReverse(number);
    }

    public static void displayDigitsReverse(int n) {
        // Base case
        if (n < 10) {
            System.out.println(n);
        } else {
            // Print the last digit
            System.out.println(n % 10);
            // Recursively call the function with the remaining digits
            displayDigitsReverse(n / 10);
        }
    }
}
