/*
 * Prints path after a series of inputs
 */
package assignmenttwo;
import java.util.Scanner;
/**
 *
 * @author jfuqua390
 */
public class numberTwo {
    public static void main() {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Please enter drive letter: ");
        String drive = in.next();
        System.out.print("Please enter the path: ");
        String path = in.next();
        System.out.print("Please enter the file name: ");
        String file = in.next();
        String fileTwo = in.next();
        System.out.print("Please enter the extension: ");
        String ext = in.next();
        
        String fullPath = drive + ":" + path + "\\" + file + " " + fileTwo + "." + ext;
        System.out.println(fullPath);
        
    }
}
