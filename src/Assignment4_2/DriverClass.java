package Assignment4_2;

public class DriverClass {
    public static void main(String[] args) {
        // Creating an array of five objects for various employee categories
        Employee[] employees = new Employee[5];
        employees[0] = new CommissionEmployee("John", "Doe", "123-45-6789", 50000, 0.05);
        employees[1] = new BasePlusCommissionEmployee("Jane", "Smith", "987-65-4321", 80000, 0.03, 2000);
        employees[2] = new HourlyEmployee("Bob", "Johnson", "234-56-7890", 20, 40);
        employees[3] = new SalariedEmployee("Alice", "Williams", "345-67-8901", 1000);
        employees[4] = new HourlyEmployee("Charlie", "Brown", "456-78-9012", 15, 35);

        // Displaying the current status of the objects
        for (Employee employee : employees) {
            System.out.println(employee);
            System.out.println("Payment: $" + employee.getPayment());
            System.out.println("----------------------------");
        }

        // Calculating the total salaries of all employees
        double totalSalaries = 0;
        for (Employee employee : employees) {
            totalSalaries += employee.getPayment();
        }

        // Printing the total salaries to the console
        System.out.println("Total Salaries of All Employees: $" + totalSalaries);
    }
}
