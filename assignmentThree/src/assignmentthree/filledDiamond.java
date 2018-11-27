/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentthree;
import java.util.Scanner;
/**
 *
 * @author jfuqua390
 */
public class filledDiamond {
    public static void main() {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the size of your diamond.");
        int size = in.nextInt();
        int i, n, s, space=1;
        space = size-1;
        
        //First for loop to build up to max width row
        for(i = 1; i<=size; i++) {
            //Space out where to start entering asterisk
            for(n=1; n<=space; n++) {
                System.out.print(" ");
            }
            //Reduce the spaces needed for next row
            space--;
            //Start printing asterisks and print 1 on row 1, 3 on row 2, increasing by 2 each row
            for (n = 1; n <= 2 * i - 1; n++) 
            {
                System.out.print("*");                
            }
            System.out.println("");
        }
        //reset spaces
        space=1;
        //Second for loop to go back down to 1 asterisk
        for(i=1; i<= size - 1; i++) {
            //Space out to where to start asterisk
            for(n=1; n<=space; n++) {
                System.out.print(" ");
            }
            //Increase spaces needed for next row
            space++;
            //Write as many asterisks as needed denoted by row number, decreasing by two each row
            for(n=1; n <= 2 * (size-i) -1; n++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
