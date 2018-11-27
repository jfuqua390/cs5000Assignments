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
public class GradeTester {
    public static void main() {
        Grade Aplus = new Grade("A+");
        Grade A = new Grade("A");
        Grade Aminus = new Grade("A-");
        Grade Bplus = new Grade("B+");
        Grade B = new Grade("B");
        Grade Bminus = new Grade("B-");
        Grade Cplus = new Grade("C+");
        Grade C = new Grade("C");
        Grade Cminus = new Grade("C-");
        Grade Dplus = new Grade("D+");
        Grade D = new Grade("D");
        Grade Dminus = new Grade("D-");
        Grade F = new Grade("F");
        System.out.print("A+:");
        System.out.println(Aplus.getNumericGrade());
        System.out.print("A:");
        System.out.println(A.getNumericGrade());
        System.out.print("A-:");
        System.out.println(Aminus.getNumericGrade());
        System.out.print("B+:");
        System.out.println(Bplus.getNumericGrade());
        System.out.print("B:");
        System.out.println(B.getNumericGrade());
        System.out.print("B-:");
        System.out.println(Bminus.getNumericGrade());
        System.out.print("C+:");
        System.out.println(Cplus.getNumericGrade());
        System.out.print("C:");
        System.out.println(C.getNumericGrade());
        System.out.print("C-:");
        System.out.println(Cminus.getNumericGrade());
        System.out.print("D+:");
        System.out.println(Dplus.getNumericGrade());
        System.out.print("D:");
        System.out.println(D.getNumericGrade());
        System.out.print("D-:");
        System.out.println(Dminus.getNumericGrade());
        System.out.print("F:");
        System.out.println(F.getNumericGrade());
    }
}
