/*
 * Takes income as an input and prints the tax
 */
package assignmenttwo;
import java.util.Scanner;
import java.text.NumberFormat;
/**
 *
 * @author jfuqua390
 */
public class numberThree {
    public static void main() {
       Scanner in = new Scanner(System.in);
       System.out.print("Please enter your income:");
       String incomeString = in.nextLine();
        
       
       //Remove string chars if necessary
       String noStrings = incomeString.replaceAll("[$,]", "");
       double income = Double.parseDouble(noStrings);
       double tax;
       
       if(income > 500000) {
           tax = income * .06;
       } else if(income > 250000) {
           tax = income * .05;
       } else if(income > 100000) {
           tax = income * .04;
       } else if(income > 75000) {
           tax = income * .03;
       } else if(income > 50000) {
           tax = income * .02;
       } else {
           tax = income * .01;
       }
       
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        System.out.print("The tax for your income is: ");
        System.out.println(formatter.format(tax));
    }
}
