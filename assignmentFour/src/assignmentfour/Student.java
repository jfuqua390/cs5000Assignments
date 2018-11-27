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
public class Student extends Person {
    private String major;
    
    /**
     * Constructs a student with a major
     */
    public Student()
    {
        major = "";
    }
    
    /**
     * Sets major for Student
     * @param m Major to set
     */
    public void setMajor(String m)
    {
        major = m;
    }
    /**
     * Returns info on Student
     * @return 
     */
    @Override
    public String toString() {
        return "Person[major=" + major + "]";
    }
}
