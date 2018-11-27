/*
 * Takes an input and prints out the number without a comma
 */
package assignmenttwo;
import javax.swing.JOptionPane;
/**
 *
 * @author jfuqua390
 */
public class numberOne {
     
     public static void main() {
        // TODO code application logic here
        String numberString = JOptionPane.showInputDialog("Enter a number from 1,000 to 999,999 (include comma).");
        
        //Easiest way to do this, but not sure I would get credit
        String noCommas = numberString.replaceAll(",","");
        
        //More cumbersome but will get credit I think?
        int lengthOfString = numberString.length();
        String noCommasTwo = "";
        
        //Should use switch here, but don't think we have learned yet.
        if(lengthOfString == 7) {
            String beg = numberString.substring(0,3);
            String end = numberString.substring(4,7);
            noCommasTwo = beg + end;
        } else if(lengthOfString == 6) {
            String beg = numberString.substring(0,2);
            String end = numberString.substring(3,6);
            noCommasTwo = beg + end;
        } else if(lengthOfString == 5) {
            String beg = numberString.substring(0,1);
            String end = numberString.substring(2,5);
            noCommasTwo = beg + end;
        } else {
            System.out.println("Please enter a valid number next time.");
        }
        
        System.out.println(noCommasTwo);
    }
}
