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
public class QuizTester {
    public static void main() {
        Quiz[] quizzes = new Quiz[6];
        quizzes[0] = new Quiz(95, "A");
        quizzes[1] = new Quiz(85, "B");
        quizzes[2] = new Quiz(80, "B-");
        quizzes[3] = new Quiz(75, "C");
        quizzes[4] = new Quiz(90, "A-");
        quizzes[5] = new Quiz(100, "A+");
        
        double avgQuiz = Data.average(quizzes);
        double maxQuiz = Data.max(quizzes);
        System.out.println("Expected average: 87.50");
        System.out.println("Acutal Average: " + avgQuiz);
        System.out.println("Expected max: 100 A+");
        System.out.println("Actual Max: " + maxQuiz);
    }
}
