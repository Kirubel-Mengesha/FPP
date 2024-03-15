package Assignment4_2;

public class BasePlusCommissionEmployee extends CommissionEmployee{
    private double baseSalary;

    // Constructors
    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber,
                                      double grossSales, double commissionRate, double baseSalary) {
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
        this.baseSalary = baseSalary;
    }

    // Getters and Setters
    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    // Calculate payment
    @Override
    public double getPayment() {
        return baseSalary + super.getPayment();
    }

    // Override toString method
    @Override
    public String toString() {
        return "BasePlusCommissionEmployee{" +
                "baseSalary=" + baseSalary +
                "} " + super.toString();
    }

}
