package Assignment4_2;

public class SalariedEmployee extends Employee{
    private double weeklySalary;

    // Constructors
    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber,
                            double weeklySalary) {
        super(firstName, lastName, socialSecurityNumber);
        this.weeklySalary = weeklySalary;
    }

    // Getters and Setters
    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }

    // Calculate payment
    @Override
    public double getPayment() {
        return weeklySalary;
    }

    // Override toString method
    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "weeklySalary=" + weeklySalary +
                "} " + super.toString();
    }
}
