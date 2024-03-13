package Assignment6;

import java.util.Arrays;

class Person {
    private String lastName;
    private String firstName;
    private int age;

    public Person(String last, String first, int a) {
        lastName = last;
        firstName = first;
        age = a;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Person [lastName=" + lastName + ", FirstName=" + firstName + ", Age=" + age + "]";
    }
}


