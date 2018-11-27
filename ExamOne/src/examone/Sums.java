/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examone;

/**
 *
 * @author jfuqua390
 */
public class Sums {
    public static void main(int n) {
        int sum = 0;
        for(int i=1; i<=n; i++) {
            sum += i;
            System.out.print("The sum of all positive integers from 1 to ");
            System.out.print(i);
            System.out.print(" is ");
            System.out.println(sum);
        }
    }
}
