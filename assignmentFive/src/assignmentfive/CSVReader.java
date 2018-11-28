/*
 * Various functions to interpolate data from a CSV file
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

    /**
     * Function to count the number of rows
     * @param filePath
     * @return integer amount of total rows
     * @throws FileNotFoundException
     */
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
        
    /**
     * Returns the number of fields of a given row
     * @param row Row to count fields
     * @param filePath File path of the csv
     * @return the number of fields for a given row
     * @throws FileNotFoundException
     */
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
        
    /**
     * Function to return a field of given row and column
     * @param row Row of field
     * @param col Column of Field
     * @param filePath File path of the csv
     * @return the string of what the field contains
     * @throws FileNotFoundException
     */
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
    
    /**
     * Function to get the sum of a column's data
     * @param col column wanted to analyze
     * @param filePath file path of CSV
     * @return double sum of the values within the column
     * @throws FileNotFoundException
     */
    public static double getSumOfCol(int col, String filePath) throws FileNotFoundException {
        Scanner in = new Scanner(new File(filePath));
        double total = 0;
        while(in.hasNextLine()) {
            String InputLine = in.nextLine();
            String[] arr = InputLine.split(",");
            total += Double.parseDouble(arr[col]);
        }
        return total;
    }
    
    /**
     * Function to get the average of a column's data
     * @param col column wanted to analyze
     * @param filePath file path of CSV
     * @return double average of the values within the column
     * @throws FileNotFoundException
     */
    public static double getAverageOfCol(int col, String filePath) throws FileNotFoundException {
        return getSumOfCol(col, filePath) / numberOfRows(filePath);     
    }
    
    /**
     * Function to find the maximum value of given column
     * @param col column to analyze
     * @param filePath file path to the CSV
     * @return double value of max within a column
     * @throws FileNotFoundException
     */
    public static double getMaxOfCol(int col, String filePath) throws FileNotFoundException {
        Scanner in = new Scanner(new File(filePath));
        double max = 0;
        while(in.hasNextLine()) {
            String InputLine = in.nextLine();
            String[] arr = InputLine.split(",");
            double number = Double.parseDouble(arr[col]);
            if(number >= max) {
                max = number;
            }
        }
        return max;
    }
    
      /**
     * Function to find the minimum value of given column
     * @param col column to analyze
     * @param filePath file path to the CSV
     * @return double value of min within a column
     * @throws FileNotFoundException
     */
    public static double getMinOfCol(int col, String filePath) throws FileNotFoundException {
        Scanner in = new Scanner(new File(filePath));
        double min = 0;
        int timesRan = 0;
        while(in.hasNextLine()) {
            String InputLine = in.nextLine();
            String[] arr = InputLine.split(",");
            double number = Double.parseDouble(arr[col]);
            if(number <= min || timesRan == 0) {
                min = number;
            }
            timesRan++;
        }
        return min;
    }
}
