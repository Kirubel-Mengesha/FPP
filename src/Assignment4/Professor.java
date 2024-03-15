package Assignment4;

import java.time.LocalDate;

public class Professor extends DeptEmployee{
    private int numberOfPublications;

    public Professor(String name, LocalDate hireDate, double salary, int numberOfPublications) {
        super(name, hireDate, salary);
        this.numberOfPublications = numberOfPublications;
    }

    public int getNumberOfPublications() {
        return numberOfPublications;
    }
}
