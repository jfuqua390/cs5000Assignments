/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapterone;
import javax.swing.JOptionPane;
import java.net.URL;
import javax.swing.ImageIcon;
/**
 *
 * @author jfuqua390
 */
public class ChapterOne {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        //1
        One.main(args);
        //2
        Two.main();
        //3
        JOptionPane.showMessageDialog(null, "Hello, Jonathan!");
        //4
        String name = JOptionPane.showInputDialog("What is your name?");
        System.out.println(name);
        //5
        String nameFive = JOptionPane.showInputDialog("What is your name?");
        System.out.print("Hello, ");
        System.out.print(nameFive);
        System.out.println("!");

        String halsGreeting = "My name is Hal! What would you like me to do";
        String task = JOptionPane.showInputDialog(halsGreeting);
        System.out.print("I'm sorry, ");
        System.out.print(nameFive);
        System.out.println(". I'm afraid I can't do that.");
        //6
        URL imageLocation = new URL("http://horstmann.com/java4everyone/duke.gif");
			
        JOptionPane.showMessageDialog(null, "Hello People", "Cool popup window",
                
            JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLocation));


    }
    
}
