/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentone;

/**
 *
 * @author jfuqua390
 */
public class EmployeeTester {

    
    public static void main() {
        Employee Jon = new Employee("Jon", 50000);
        System.out.print("Employee Name: ");
        System.out.println(Jon.getName());
        System.out.print("Employee Salary: ");
        System.out.println(Jon.getSalary());
        Jon.raiseSalary(.05);
        System.out.println("Raising salary by .05");
        System.out.print("New Salary: ");
        System.out.println(Jon.getSalary());
        System.out.print("Expected Salary: ");
        System.out.println(52500);
    }
}
