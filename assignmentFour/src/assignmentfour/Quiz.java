/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentfour;

/**
 *
 * @author jfuqua390
 */
public class Quiz implements Measurable {
    private double score;
    private String letterGrade;
    
    public Quiz(double s, String g) {
        score=s;
        letterGrade=g;
    }
    
    @Override
    public double getMeasure() {
        return score;
    }
    
}
