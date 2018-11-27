package assignmentfive;

import java.util.Scanner;
import java.util.*;
/**
 *
 * @author jfuqua390
 */
public class One {
    public static void main() {
        Scanner in = new Scanner(System.in);
        double inputNumber, sum = 0.0;
        int wrongCount = 0;
        System.out.println("Please enter a numeric floating value:");
        while(wrongCount <=1) {
            try {
                inputNumber = in.nextDouble();
                sum += inputNumber;
                System.out.println("Number added to total.");
            } catch(InputMismatchException e) {
                if(wrongCount >= 1) {
                    System.out.println("Formatting has been wrong twice, aborting.");
                    wrongCount++;
                } else {
                wrongCount++;
                System.out.println("Please check formatting.");
                in = new Scanner(System.in);
                }
                
            }
        }
        System.out.print("Sum of inputs: ");
        System.out.println(sum);
    }
}
