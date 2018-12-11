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
public class Person implements Measurable {
    public String name;
    public double height;
    public Person(double aHeight, String aName) {
        name = aName;
        height=aHeight;
    }
    
    @Override
    public String getPersonName() {
        return name;
    }

    @Override
    public double getMeasure() {
        return height;
    }
}
