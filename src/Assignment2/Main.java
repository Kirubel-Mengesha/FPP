package Assignment2;
import java.lang.String;
public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Joe", "Smith", "332-221-4444");
        Customer customer2 = new Customer("Alice", "Johnson", "555-666-7777");
        Customer customer3 = new Customer("Bob", "Miller", "888-999-0000");

        Address address1 = new Address("123 Main St", "Chicago", "IL", "60601");
        Address address2 = new Address("456 Oak St", "New York", "NY", "10001");
        Address address3 = new Address("789 Pine St", "Chicago", "IL", "60602");

        customer1.setBillingAddress(address1);
        customer1.setShippingAddress(address2);

        customer2.setBillingAddress(address2);
        customer2.setShippingAddress(address3);

        customer3.setBillingAddress(address3);
        customer3.setShippingAddress(address1);

        Customer[] customers = {customer1, customer2, customer3};

        for (Customer customer : customers) {
            if (customer.getBillingAddress().getCity().equals("Chicago")) {
                System.out.println(customer);
            }
        }
    }
}
