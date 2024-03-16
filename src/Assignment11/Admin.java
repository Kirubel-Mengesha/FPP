package Assignment11;
import java.util.*;
import java.util.HashMap;

public class Admin {
    public static HashMap<Key, Student> processStudents(List<Student> students) {
        HashMap<Key, Student> map = new HashMap<>();
        for (Student student : students) {
            Key key = new Key(student.getFirstName(), student.getLastName());
            map.put(key, student);
        }
        return map;
    }

    public static double computeAverageGPA(HashMap<Key, Student> maps) {
        double totalGPA = 0.0;
        int count = 0;
        for (Student student : maps.values()) {
            totalGPA += student.getGpa();
            count++;
        }
        if (count > 0) {
            return totalGPA / count;
        } else {
            return 0.0; // to avoid division by zero
        }
    }
}

