/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package SchoolSystem;

public class Teacher extends Person {
    private final String employeeId;
    private final String subject;

    public Teacher(String name, int age, String gender, String employeeId, String subject) {
        super(name, age, gender);
        this.employeeId = employeeId;
        this.subject = subject;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Subject: " + subject);
    }
}
