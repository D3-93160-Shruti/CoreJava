package com.sunbeam;

public class EmployeeTest {
    public static void main(String[] args) {
        // Create two Employee objects
        Employee emp1 = new Employee("Shruti", "Sendur", 70000);
        Employee emp2 = new Employee("Garv", "Yadav", 5605000);

        System.out.println("Initial Employee Details:");
        emp1.display();
        emp2.display();

        // Give 10% raise to both employees
        emp1.giveRaise(10);
        emp2.giveRaise(10);

        System.out.println("After 10% Raise:");
        emp1.display();
        emp2.display();
    }
}
