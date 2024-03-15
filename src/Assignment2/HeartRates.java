package Assignment2;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class HeartRates {
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;

    // Constants
    private static final int RESTING_HEART_RATE = 70;
    private static final double LOWER_BOUNDARY = 0.5;
    private static final double UPPER_BOUNDARY = 0.85;

    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    public HeartRates(String firstName, String lastName, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    // Getter and Setter methods for attributes
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    // Method to calculate age in years
    private int calculateAge() {
        LocalDate today = LocalDate.now();
        Period agePeriod = Period.between(dateOfBirth, today);
        return agePeriod.getYears();
    }

    // Method to calculate maximum heart rate
    private int calculateMaxHeartRate() {
        return 220 - calculateAge();
    }

    // Method to calculate and print target heart rate range
    private void calculateAndPrintTargetHeartRate() {
        int maxHeartRate = calculateMaxHeartRate();
        int averageHeartRate = maxHeartRate - RESTING_HEART_RATE;

        double lowerBoundaryTHR = averageHeartRate * LOWER_BOUNDARY + RESTING_HEART_RATE;
        double upperBoundaryTHR = averageHeartRate * UPPER_BOUNDARY + RESTING_HEART_RATE;

        System.out.printf("The Target Heart Rate Range is between %.2f and %.2f%n", lowerBoundaryTHR, upperBoundaryTHR);
    }

    // Override toString() method
    @Override
    public String toString() {
        return "First Name: " + firstName +
                "\nLast Name: " + lastName +
                "\nAge: " + calculateAge() +
                "\nDate of Birth: " + dateOfBirth +
                "\nMaximum Heart Rate: " + calculateMaxHeartRate();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Gather user information
        System.out.println("Please, enter your first name:");
        String firstName = scanner.nextLine();

        System.out.println("Please, enter your last name:");
        String lastName = scanner.nextLine();

        System.out.println("Please, enter your birth date in the format-(yyyy-MM-dd)-Example 1989-4-14");
        String dobInput = scanner.nextLine();
        LocalDate dateOfBirth = LocalDate.parse(dobInput);

        // Create HeartRates object
        HeartRates person = new HeartRates(firstName, lastName, dateOfBirth);

        // Display information
        System.out.println("\n" + person.toString());

        // Calculate and print target heart rate range
        person.calculateAndPrintTargetHeartRate();

        scanner.close();
    }

}
