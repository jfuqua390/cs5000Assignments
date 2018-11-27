/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentfive;
import java.io.*;
import java.util.*;
import java.util.Scanner;
/**
 *
 * @author jfuqua390
 */
public class CSVReader {
        public static int numberOfRows(String filePath) throws FileNotFoundException {
        Scanner in = new Scanner(new File(filePath));
        int totalRows = 0;
        while(in.hasNextLine()){
            in.nextLine();
            totalRows++;
        }
        in.close();
        return totalRows;
    }
        
        public static int numberOfFields(String filePath) throws FileNotFoundException {
           Scanner scan = new Scanner(new File(filePath));
           scan.useDelimiter(",");
           int total = 0;
           //counts number of fields but doesn't include first of each row
           while(scan.hasNext()) {
               scan.next();
               total ++;
           }
           //get total number of rows so we can add to total fields
           int rows = numberOfRows(filePath);
           //subtract one to eliminate some double counting (i.e. first field gets counted twice)
           total += rows - 1;
           return total;
        }
        
        public static int numberOfFieldsInRow(int row, String filePath) throws FileNotFoundException {
           Scanner scan = new Scanner(new File(filePath));
           int total = 0;
           int r = 1;
           while(scan.hasNextLine()) {
               if(r == row) {
                 String InputLine = scan.nextLine();
                 String[] arr = InputLine.split(",");
                 total += arr.length;
                 r++;
               } else {
                scan.nextLine();
                r++;   
               }
           }
           return total;
        }
        
        public static String getField(int row, int col, String filePath) throws FileNotFoundException {
            String field = "";
            Scanner in = new Scanner(new File(filePath));
            int r = 1;
            while(in.hasNextLine()) {
                if(r == row) {
                    String InputLine = in.nextLine();
                    String[] arr = InputLine.split(",");
                    //subtract one for index of 0
                    field = arr[col - 1];
                } else {
                    in.nextLine();
                    r++;
                }
            }
            return field;
        }
}
