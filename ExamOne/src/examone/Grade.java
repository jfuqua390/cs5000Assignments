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
public class Grade {
    private String letterGrade;
    /**
     * constructs new grade
     * @param grade Grade to be evaluated
     */
    public Grade(String grade) {
        letterGrade = grade;
    }
    
    public double getNumericGrade() {
        double numericGrade = 0;
                
        if(letterGrade.contains("A")) {
            numericGrade = 4;
        } else if (letterGrade.contains("B")) {
            numericGrade = 3;
        } else if (letterGrade.contains("C")) {
            numericGrade = 2;
        } else if (letterGrade.contains("D")) {
            numericGrade = 1;
        } else {
            numericGrade = 0;
        }
        
        if(letterGrade.contains("+") && !letterGrade.contains("A")) {
            numericGrade += 0.3;
        } else if(letterGrade.contains("-")) {
            numericGrade -= 0.3;
        }
        return numericGrade;
    }
}
