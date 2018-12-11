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
public class Manager extends Employee{
    public String department;
    
    public Manager(String aName, double aSalary, String aDepartment) {
        super(aName, aSalary);
        department = aDepartment;
    }
    
    @Override
    public String toString() {
        return(super.toString()+ 
                "\nDepartment: "+department); 
    }
}
