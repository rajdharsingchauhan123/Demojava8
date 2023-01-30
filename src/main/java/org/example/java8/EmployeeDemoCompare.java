package org.example.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EmployeeDemoCompare {
    private Integer id;
    private String firstName;
    private String lastName;
    private Integer age;

    public EmployeeDemoCompare(Integer id, String firstName, String lastName, Integer age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "EmployeeDemoCompare{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
    private static List<EmployeeDemoCompare> getEmployees(){
        List<EmployeeDemoCompare> employees  = new ArrayList<>();
        employees.add(new EmployeeDemoCompare(6,"Yash", "Chopra", 25));
        employees.add(new EmployeeDemoCompare(2,"Aman", "Sharma", 28));
        employees.add(new EmployeeDemoCompare(3,"Aakash", "Yaadav", 52));
        employees.add(new EmployeeDemoCompare(5,"David", "Kameron", 19));
        employees.add(new EmployeeDemoCompare(4,"James", "Hedge", 72));
        employees.add(new EmployeeDemoCompare(8,"Balaji", "Subbu", 88));
        employees.add(new EmployeeDemoCompare(7,"Karan", "Johar", 59));
        employees.add(new EmployeeDemoCompare(1,"Lokesh", "Gupta", 32));
        employees.add(new EmployeeDemoCompare(9,"Vishu", "Bissi", 33));
        employees.add(new EmployeeDemoCompare(10,"Lokesh", "Ramachandran", 60));
        return employees;
    }

    public static void main(String[] args) {
        List<EmployeeDemoCompare> employees  = getEmployees();
        employees.sort(Comparator.comparing(e->e.firstName));
        System.out.println(employees);

    }
}
