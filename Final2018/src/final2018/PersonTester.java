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
public class PersonTester {
    public static void main() {
        Person[] people = new Person[6];
        people[0] = new Person(175, "Jon");
        people[1] = new Person(185, "Billy");
        people[2] = new Person(170, "Kaleb");
        people[3] = new Person(165, "Brian");
        people[4] = new Person(180, "Josh");
        people[5] = new Person(190, "Jess");
        
        double average = Data.average(people);
        Measurable max = Data.max(people);
        
        System.out.print("Average Height: ");
        System.out.println(average);
        System.out.print("Tallest Person: ");
        System.out.println(max.getPersonName());
    }
}
