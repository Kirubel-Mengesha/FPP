package Assignment4;
import java.time.LocalDate;

public class Main2 {
    public static void main(String[] args) {
        Professor prof1 = new Professor("John Smith", LocalDate.now(), 60000, 10);
        Professor prof2 = new Professor("Alice Johnson", LocalDate.now(), 70000, 8);
        Professor prof3 = new Professor("Bob Williams", LocalDate.now(), 80000, 12);

        Secretary sec1 = new Secretary("Jane Doe", LocalDate.now(), 35000, 5);
        Secretary sec2 = new Secretary("Chris Brown", LocalDate.now(), 40000, 8);

        DeptEmployee[] department = new DeptEmployee[]{prof1, prof2, prof3, sec1, sec2};

        // Ask the user if they want to see the sum of all salaries
        // Assume user input is "Y" for simplicity purpose
        String userInput = "Y";

        if (userInput.equalsIgnoreCase("Y")) {
            double totalSalary = calculateTotalSalary(department);
            System.out.println("Total Salary of all employees: " + totalSalary);
        }
    }

    public static double calculateTotalSalary(DeptEmployee[] department) {
        double totalSalary = 0.0;

        for (DeptEmployee employee : department) {
            totalSalary += employee.computeSalary();
        }

        return totalSalary;
    }
}
