/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.employee;

public class Employee {
    private static int employeeCount = 0;

    static String Name = "Delulu Company";
    static String Address = "Konoha, Barishal";
    private String name;
    private int age;
    private String designation;
    private double salary;

 
    public Employee(String name, int age, String designation, double salary) {
        this.name = name;
        this.age = age;
        this.designation = designation;
        this.salary = salary;
    }

    
    public void display_Employee_Details() {
        System.out.println("Employee Name =  " + name);
        System.out.println("Age =  " + age);
        System.out.println("Designation =  " + designation);
        System.out.println("Salary =  " + salary + "Tk");
        System.out.println("Company Name =  " + Name);
        System.out.println("Company Address =  " + Address);
        System.out.println();
    }
    public static int displayEmployeeCount(){
    
        System.out.println("Total Number of Employees = " + employeeCount );
        return employeeCount;
    }

  
    


    public static void main(String[] args) {
   
        Employee ep1 = new Employee("Muzan", 50, "Toilet Service Manager", 500.0);
        Employee ep2 = new Employee("Inosuke", 22, "HR Manager", 95000.0);
        Employee ep3 = new Employee("Mitsuri", 25, "Food Service manager", 66000.0);

        ep1.display_Employee_Details();
        ep2.display_Employee_Details();
        ep3.display_Employee_Details();

        // Display total number of employees
        Employee.displayEmployeeCount();
    }
}
