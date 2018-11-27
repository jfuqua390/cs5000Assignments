/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentfour;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author jfuqua390
 */
public class PersonTester {
    public static void main() {
        Person[] people = new Person[10];
        people[0] = new Person();
        people[1] = new Person();
        people[2] = new Person();
        people[3] = new Person();
        people[4] = new Person();
        people[5] = new Person();
        people[6] = new Person();
        people[7] = new Person();
        people[8] = new Person();
        people[9] = new Person();
        
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter 10 first names");
        people[0].setName(in.nextLine());
        people[1].setName(in.nextLine());
        people[2].setName(in.nextLine());
        people[3].setName(in.nextLine());
        people[4].setName(in.nextLine());
        people[5].setName(in.nextLine());
        people[6].setName(in.nextLine());
        people[7].setName(in.nextLine());
        people[8].setName(in.nextLine());
        people[9].setName(in.nextLine());
        
        Arrays.sort(people);
        String first = people[0].getName();
        String last = people[9].getName();
        System.out.println("First Person: " + first);
        System.out.println("Last Person: " + last);
    }
}
