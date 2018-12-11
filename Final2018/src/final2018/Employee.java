/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package final2018;

/**
 *
 * @author jfuqua390
 */
public class Employee {
    public double salary;
    public String name;
    
    public Employee(String aName, double aSalary) {
        salary=aSalary;
        name=aName;
    }
    
    // toString() method to print info of Employee 
    @Override
    public String toString()  
    { 
        return("Name: "+ name 
                +"\n"
                + "Salary: "+salary); 
    }  
}
