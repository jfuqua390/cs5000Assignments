/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentfive;

import java.io.FileNotFoundException;

/**
 *
 * @author jfuqua390
 */
public class AssignmentFive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        One.main();
        
        int att2007Rows = CSVReader.numberOfRows("/Users/jfuqua390/UTC/CPSC-5000/Assignments/assignmentFive/att2007.csv");
        int quotesRows = CSVReader.numberOfRows("/Users/jfuqua390/UTC/CPSC-5000/Assignments/assignmentFive/quotes.csv");
        
        System.out.print("Total Rows for att2007: ");
        System.out.println(att2007Rows);
        System.out.print("Total Rows for quotes: ");
        System.out.println(quotesRows);
        
        System.out.print("Field for (2,3) of quotes: ");
        System.out.println(CSVReader.getField(2, 3, "/Users/jfuqua390/UTC/CPSC-5000/Assignments/assignmentFive/quotes.csv"));
        
        System.out.print("Total Fields in Row 3 of att2007.csv: ");
        System.out.println(CSVReader.numberOfFieldsInRow(3,"/Users/jfuqua390/UTC/CPSC-5000/Assignments/assignmentFive/att2007.csv"));
        System.out.print("Total Fields in Row 2 of quotes.csv: ");
        System.out.println(CSVReader.numberOfFieldsInRow(2,"/Users/jfuqua390/UTC/CPSC-5000/Assignments/assignmentFive/quotes.csv"));

        double sum = CSVReader.getSumOfCol(1, "/Users/jfuqua390/UTC/CPSC-5000/Assignments/assignmentFive/att2007.csv");
        double avg = CSVReader.getAverageOfCol(1, "/Users/jfuqua390/UTC/CPSC-5000/Assignments/assignmentFive/att2007.csv");
        int rows = att2007Rows;
        double max = CSVReader.getMaxOfCol(1, "/Users/jfuqua390/UTC/CPSC-5000/Assignments/assignmentFive/att2007.csv");
        double min = CSVReader.getMinOfCol(1, "/Users/jfuqua390/UTC/CPSC-5000/Assignments/assignmentFive/att2007.csv");
        
        System.out.printf("%-10s%10.2f", "Sum:", sum);
        System.out.println("");
        System.out.printf("%-10s%10d", "Rows:", rows);
        System.out.println("");
        System.out.printf("%-10s%10.2f", "Max:", max);
        System.out.println("");
        System.out.printf("%-10s%10.2f", "Min:", min);
        System.out.println("");
        System.out.printf("%-10s%10.2f", "Average:", avg);
        System.out.println("");
    }
    
}
