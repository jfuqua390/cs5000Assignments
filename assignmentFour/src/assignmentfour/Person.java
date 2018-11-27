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
public class Person implements Comparable {
    private String name;
    private String dob;
    
    /**
     * Constructs a person with a name and DOB
     * @param n
     * @param d
     */
    public Person()
    {
        name = "";
        dob = "";
    }
    
    public void setName(String n) 
    {
        name = n;
    }
    
    /**
     * Returns name of person
     * @return name of Person
     */
    public String getName() {
        return name;
    }
    
    public void setDOB(String d)
    {
        dob = d;
    }
    /**
     * Returns the information on Person
     * @return 
     */
    @Override
    public String toString() {
        return "Person[name=" + name + ",dob=" + dob + "]";
    }

    @Override
    public int compareTo(Object otherObject) {
        Person other = (Person) otherObject;
       int diff = name.compareTo(other.name);
       return diff;
    }
}
