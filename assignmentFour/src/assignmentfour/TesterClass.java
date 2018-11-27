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
public class TesterClass {
    public static void main()
    {
        Person jonathan = new Person();
        jonathan.setName("Jonathan");
        jonathan.setDOB("07/30/1990");
        System.out.println("Jonathan's Info should be Jonathan and 07/30/1990");
        System.out.println(jonathan.toString());
        
        Student Marcus = new Student();
        Marcus.setName("Marcus");
        Marcus.setMajor("Accounting");
        System.out.println("Marcus' Information should be Major: Accounting");
        System.out.println(Marcus.toString());
        
        Instructor Steve = new Instructor();
        Steve.setSalary(100000.00);
        System.out.println("Steve's salary should be 100,000.00");
        System.out.println(Steve.toString());
    }
   
    
    
}
