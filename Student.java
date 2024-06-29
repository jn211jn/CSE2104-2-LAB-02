/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.student;

/**
 *
 * @author Shimi
 */
public class Student {
    
    static String university = "ULAB University";
    private static int student_Count = 0;
    private int id;
    private String name;
    private String department;
    private double cgpa;

    
    public Student(int Id, String Name, String Department, double CGPA) {
        this.id = Id;
        this.name = Name;
        this.department = Department;
        this.cgpa = CGPA;
        Student.student_Count++;
    }

    
    public void display_Student_Details() {
        System.out.println("ID = " + id);
        System.out.println("Name = " + name);
        System.out.println("Department = " + department);
        System.out.println("CGPA = " + cgpa);
        System.out.println("University = " + university);
        System.out.println();
    }
   
    public static void display_Student_Count() {
        System.out.println("Total Number of Students: " + student_Count);
    }

    public static void main(String[] args) {
        
        Student s1 = new Student(211056921, "Aurikto", "BBA", 3.0);
        Student s2 = new Student(211014021, "Nezuko Chan", "Computer Science", 3.5);
        Student s3 = new Student(222012356, "Kamado Tanjiro", "MSJ", 3.8);

        s1.display_Student_Details();
        s2.display_Student_Details();
        s3.display_Student_Details();

        Student.display_Student_Count();
    }
}
