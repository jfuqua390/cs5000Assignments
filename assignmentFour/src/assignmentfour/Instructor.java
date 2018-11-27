/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentfour;

/**
 *
 * @author jfuqua390
 */
public class Instructor extends Person {
    private double salary;
     /**
     * Constructs an Instructor with a salary
     */
    public Instructor()
    {
        salary = 0;
    }
    
     /**
     * Sets Salary for Instructor
     * @param m Amount to set salary at
     */
public void setSalary(Double amt)
    {
        salary = amt;
    }
    
    /**
     * Returns info on Instructor
     * @return 
     */
    @Override
    public String toString() {
        return "Instructor[salary=" + salary + "]";
    }
}
