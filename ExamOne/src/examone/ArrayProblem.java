/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examone;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author jfuqua390
 */
public class ArrayProblem {
    public static void main() {
       
        final int initial = 5;
        int[] values = new int[initial];
        int currentSize = 0;
        System.out.println("Enter values, Q to quit:");
        Scanner in = new Scanner(System.in);
        
        while (in.hasNextInt()) {
            if(currentSize >= values.length) {
                values = Arrays.copyOf(values, 2*values.length);
            }
            
            values[currentSize] = in.nextInt();
            currentSize++;
        }
        values = Arrays.copyOf(values, currentSize);
       int total = 0;
       for(int i = 0; i<values.length; i++) {
          if(i%2 == 0) {
              total += values[i];
          } else {
              total -= values[i];
          }
       }
        System.out.print("Your array calculates to: ");
        System.out.println(total);
    }
}
