/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentthree;
import java.util.Scanner;
/**
 *
 * @author jfuqua390
 */
public class magicSquare {

        public static void main()
    {
        int[][] array = readInput("Enter 16 integers:");

        printMagicSquare(array);

        if ((checkArray(array)) && RowsColumnsDiagonalSum(array))
        {
            System.out.println("This square is magic!");
        }
        else
        {
            System.out.println("square is not magic");
        }
    }

    /**
     * This method checks if sums of all rows, columns, and two diagonals
     *
     * @param arr Two dimensional array
     * @return TRUE if sums of all rows, columns and two diagonals are equal
     */
    public static boolean RowsColumnsDiagonalSum(int[][] arr)
    {
        int rowSum = 0;
        int colSum = 0;
        int majorDiagonalSum = 0;
        int minorDiagonalSum = 0;

        for (int i = 0; i < arr.length; i++)
        {
            rowSum += arr[0][i];
            colSum += arr[i][0];
            majorDiagonalSum += arr[i][i];
            minorDiagonalSum += arr[arr.length - i - 1][i];
        }

        if (rowSum == colSum && rowSum == majorDiagonalSum && rowSum == minorDiagonalSum)
        {
            for (int j = 1; j < arr.length; j++)
            {
                int nextRowSum = 0;
                int nextColSum = 0;

                for (int i = 0; i < arr.length; i++)
                {
                    nextColSum += arr[i][j];
                    nextRowSum += arr[j][i];
                }

                if (nextColSum == colSum || nextRowSum == rowSum)
                {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * This method checks whether all 2D-array values are unique and the values
     * do not exceed given range.
     *
     * @param A   2D-array
     * @return TRUE if all array values are unique and they do not exceed given range
     */
    public static boolean checkArray(int[][] A)
    {
        // Initialize 1D-array
        int sizeSquare = 16;
        int[] C = new int[sizeSquare];

        // Flatten 2D-array into 1D
        int cIndex = 0;
        for (int i = 0; i < 4; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                C[cIndex++] = A[i][j];
            }
        }

        // Compare values of the array
        for (int i = 0; i < sizeSquare; i++)
        {
            for (int j = i + 1; j < sizeSquare; j++)
            {
                if (C[j] == C[i])
                {
                    return false;
                }
            }

            // Check if array values fall into given range
            if (C[i] < 1 || C[i] > sizeSquare)
            {
                return false;
            }
        }
        return true;
    }

    /**
     * This method prompts user for input and returns 2D-array of integers.
     *
     * @param prompt String
     * @return 2D-array
     */
    public static int[][] readInput(String prompt)
    {
        Scanner in = new Scanner(System.in);
        System.out.print(prompt);

        int[][] arr = new int[4][4];
        for(int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr.length; j++)
            {
                arr[i][j] = in.nextInt();
            }
        }
        return arr;
    }

    /**
     * This method prints 2D-array.
     *
     * @param arr 2D-array
     */
    public static void printMagicSquare(int[][] arr)
    {
        for (int[] arr1 : arr)
        {
            for (int el : arr1)
            {
                System.out.printf("%3d", el);
            }
            System.out.println();
        }
        System.out.println();
    }
}
