/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chaptertwo;

import java.awt.Rectangle;

/**
 *
 * @author jfuqua390
 */
public class ChapterTwo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        kgToPounds.main(10);
        kgToPounds.main(50);
        kgToPounds.main(100);
        
        //2
        circleCalculation.main(3.2);
        
        areaTester(5,10);
    }
    
    public static void areaTester(int h, int w) {
        Rectangle box = new Rectangle(0,0,h,w);
        double width = box.getWidth();
        double height = box.getHeight();
        System.out.print("The area of rectangle with width: ");
        System.out.print(width);
        System.out.print(" and height: ");
        System.out.print(height);
        System.out.print(", is ");
        System.out.print(width*height);
    }
    
}
