package com.java.task.task01.task0101;


class EmployeeSon extends Employee {

    private String field1;
    private String field2;
    private Integer field4;
    private int field5;


    public EmployeeSon(String field1) {

        this.field1 = field1;
    }

    public EmployeeSon(String field1, String field2, int field4) {

        this.field1 = field1;
        this.field2 = field2;
        this.field4 = field4;
    }

    public EmployeeSon(int field4, String field1, String field2) {

        this.field1 = field1;
        this.field2 = field2;
        this.field4 = field4;
        this.field5 = field5;
    }

    public EmployeeSon() {

    }

    public static void staticEmployee(){
        System.out.println("inside staticEmployeeSon");
    }


    @Override
    public String toString() {
        return "EmployeeSon{" +
                "field1='" + field1 + '\'' +
                "field2='" + field2 + '\'' +
                ", age=" + age +
                ", name=" + name +
                '}';
    }
}


public class Employee implements Comparable<Employee> {

    public static String name = "Ivan";
    int age;
    private String designation;
    private double salary;


    @Override
    public int compareTo(Employee o) {
        return 0;
    }

    public static void staticEmployee(){
        System.out.println("inside staticEmployee");
    }


    public static class Node {
        public static int node = 111;

        public static int getNode() {
            return node;
        }
    }


    public Employee() {
    }

   // This is the constructor of the class Employee
   public Employee(String name, Integer ages) {
      Employee.name = name;
      age = ages;
   }

    public String getName() {
        return name;
    }

    // Assign the age of the Employee  to the variable age.
    public static int empAge(int empAge) {
        // age = empAge;
        return empAge;
    }

    /* Assign the designation to the variable designation.*/
    public void empDesignation(String empDesig) {
        designation = empDesig;
        int x = 0;
        int y = x++;
        System.out.println(x);

    }

    /* Assign the salary to the variable	salary.*/
    public void empSalary(double empSalary) {
        salary = empSalary;
    }

    /* Print the Employee details */
    public void printEmployee() {
        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
        System.out.println("Designation:" + designation);
        System.out.println("Salary:" + salary);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "age=" + age +
                ", designation='" + designation + '\'' +
                ", salary=" + salary +
                '}';
    }
}
