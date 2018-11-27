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
public class Employee {
    private String name;
    private Double salary;
    /**
     * Construct a new Employee
     * @param employeeName
     * @param currentSalary
     */
    public Employee(String employeeName, double currentSalary) {
        name = employeeName;
        salary = currentSalary;
    }
    
    /**
     * @return name of employee
     */
    public String getName() {
        return name;
    }
    
    /**
     * @return salary of employee
     */
    public double getSalary() {
        return salary;
    }
    
    /**
     * Raises salary of employee
     * @param percentRaise The percentage at which to raise the salary
     */
    public void raiseSalary(double percentRaise) {
       salary = salary + (salary * percentRaise);
    }
}
