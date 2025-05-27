/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.schoolsystem;

import SchoolSystem.Staff;
import SchoolSystem.Student;
import SchoolSystem.Teacher;

/**
 *
 * @author stati
 */
public class SchoolSystem {
    public static void main(String[] args) {
        // Create a student
        Student student = new Student("Alice", 20, "Female", "S123", "Computer Science");

        // Create a teacher
        Teacher teacher = new Teacher("Mr. Kamau", 45, "Male", "T456", "Mathematics");

        // Create a staff member
        Staff staff = new Staff("Janet", 38, "Female", "ST789", "Library");

        // Display their details
        System.out.println("\n--- Displaying Details ---");
        student.displayDetails();
        System.out.println();
        teacher.displayDetails();
        System.out.println();
        staff.displayDetails();
    }
}

