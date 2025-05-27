/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SchoolSystem;

/**
 *
 * @author stati888888
 */
public class Staff extends Person {

    private String staffId;
    private String department;

    public Staff(String name, int age, String gender, String staffId, String department) {
        super(name, age, gender);
        this.staffId = staffId;
        this.department = department;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Staff ID: " + staffId);
        System.out.println("Department: " + department);
        System.out.println();
    }
}
