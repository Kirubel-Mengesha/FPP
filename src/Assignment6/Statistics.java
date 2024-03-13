package Assignment6;
import java.util.*;
public class Statistics {
    public static double computeSumOfSalaries(List<EmployeeData> aList) {
        double sum = 0;
        //implement
        for(EmployeeData employeeData: aList){
            sum += employeeData.getSalary();
        }
        return sum;
    }

}
