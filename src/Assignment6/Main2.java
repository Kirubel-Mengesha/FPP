package Assignment6;
import java.util.*;
public class Main2 {

    public static void main(String[] args) {
        List<Staff> staff = new ArrayList<>();
        staff.add(new Staff("Bob", 1100, 2));
        staff.add(new Staff("Kira", 2100, 4));
        staff.add(new Staff("Sanju", 12000, 1));
        staff.add(new Staff("Luwam",9000, 3));
        staff.add(new Staff("Fani", 100000,1));

        List<Teacher> teachers = new ArrayList<>();
        teachers.add(new Teacher("Hadush", 11000, 1000));
        teachers.add(new Teacher("Obina", 130000, 15500));
        teachers.add(new Teacher("foden", 13500, 1200));
        teachers.add(new Teacher("ronaldo",95000, 6000));


        List<EmployeeData> combined = combine(staff, teachers);

        double salarySum = Statistics.computeSumOfSalaries(combined);
        System.out.println("Total sum of salaries: " + salarySum);

    }

    public static List<EmployeeData> combine(List<Staff> staff, List<Teacher> teachers) {
        List<EmployeeData> tmpArray = new ArrayList<>();
        tmpArray.addAll(staff);
        tmpArray.addAll(teachers);
        return tmpArray;
    }


}




