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
//         TODO code application logic here
//        One.main();
        int att2007Fields = CSVReader.numberOfFields("/Users/jfuqua390/UTC/CPSC-5000/Assignments/assignmentFive/att2007.csv");
        int quotesFields = CSVReader.numberOfFields("/Users/jfuqua390/UTC/CPSC-5000/Assignments/assignmentFive/quotes.csv");
        
        int att2007Rows = CSVReader.numberOfRows("/Users/jfuqua390/UTC/CPSC-5000/Assignments/assignmentFive/att2007.csv");
        int quotesRows = CSVReader.numberOfRows("/Users/jfuqua390/UTC/CPSC-5000/Assignments/assignmentFive/quotes.csv");
        
        System.out.print("Total Fields for att2007: ");
        System.out.println(att2007Fields);
        System.out.print("Total Fields for quotes: ");
        System.out.println(quotesFields);
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
    }
    
}
