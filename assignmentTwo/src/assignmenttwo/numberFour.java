/*
 * Promputs user for month number and returns number of days for said month
 */
package assignmenttwo;

import java.util.Scanner;

/**
 *
 * @author jfuqua390
 */
public class numberFour {
    public static void main() {
       Scanner in = new Scanner(System.in);
       System.out.print("Enter a month:");
       int month = in.nextInt();
       
       if(month == 2) {
           System.out.println("28 days");
       } else if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
           System.out.println("31 days");
       } else {
           System.out.println("30 days");
       }
    }
}
