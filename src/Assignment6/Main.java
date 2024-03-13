package Assignment6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Marketing> marketingList = new ArrayList<>();

        // a. Add objects to the Marketing
        marketingList.add(new Marketing("John", "Product1", 1500));
        marketingList.add(new Marketing("Alice", "Product2", 800));
        marketingList.add(new Marketing("Bob", "Product3", 1200));

        // b. Remove an object from Marketing
        marketingList.remove(1);

        // c. Print the size of the list
        System.out.println("Size of the list: " + marketingList.size());

        // d. Override toString() method to display the contents in the list
        System.out.println("Contents of the list:");
        System.out.println(marketingList);

        // e. Override the equals() method

        // f. Sort the list in natural order for the field salesamount using comparator interface
        //marketingList.sort(Comparator.comparingDouble(Marketing::getSalesAmount));
        marketingList.sort(new Comparator<Marketing>() {
            @Override
            public int compare(Marketing o1, Marketing o2) {
                return (int) (o1.getSalesAmount() - o2.getSalesAmount());
            }
        });

        // g. Sort the list in natural order using employeename with the criteria of the employee who achieves more than $1000 of salesamount
        List<Marketing> listMoreThan1000 = listMoreThan1000(marketingList);
        //listMoreThan1000.sort(Comparator.comparing(Marketing::getEmployeeName));
        listMoreThan1000.sort(new Comparator<Marketing>() {
            @Override
            public int compare(Marketing o1, Marketing o2) {
                return o1.getEmployeeName().compareTo(o2.getEmployeeName());
            }
        });

        // Print the sorted list
        System.out.println("Sorted list of employees with sales amount > $1000 by employee name:");
        System.out.println(listMoreThan1000);
    }

    public static List<Marketing> listMoreThan1000(List<Marketing> list) {
        List<Marketing> result = new ArrayList<>();
        for (Marketing marketing : list) {
            if (marketing.getSalesAmount() > 1000) {
                result.add(marketing);
            }
        }
        return result;
    }
}
