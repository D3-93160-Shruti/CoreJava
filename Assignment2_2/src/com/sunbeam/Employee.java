package com.sunbeam;

public class Employee {
    private String firstName;
    private String lastName;
    private double monthlySalary;

    // Constructor
    public Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        if (monthlySalary > 0)
            this.monthlySalary = monthlySalary;
        else
            this.monthlySalary = 0.0;
    }

    // Setter and Getter for firstName
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    // Setter and Getter for lastName
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    // Setter and Getter for monthlySalary
    public void setMonthlySalary(double monthlySalary) {
        if (monthlySalary > 0)
            this.monthlySalary = monthlySalary;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    // Method to calculate yearly salary
    public double getYearlySalary() {
        return monthlySalary * 12;
    }

    // Method to give a raise
    public void giveRaise(double percent) {
        if (percent > 0)
            this.monthlySalary += this.monthlySalary * percent / 100;
    }

    // Display employee details
    public void display() {
        System.out.println("Employee Name: " + firstName + " " + lastName);
        System.out.println("Monthly Salary: " + monthlySalary);
        System.out.println("Yearly Salary: " + getYearlySalary());
        System.out.println("----------------------------------");
    }
}
