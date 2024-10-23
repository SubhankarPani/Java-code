package exampractice;
import java.util.*;
public class SpiralMatrix {
    public static void spiralPrint(int[][] matrix) {
        if (matrix.length == 0) return; // Handle empty matrix

        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        StringBuilder result = new StringBuilder();

        while (top <= bottom && left <= right) {
            // Traverse from left to right along the top row
            for (int i = left; i <= right; i++) {
                result.append(matrix[top][i]).append(" ");
            }
            top++;

            // Traverse from top to bottom along the right column
            for (int i = top; i <= bottom; i++) {
                result.append(matrix[i][right]).append(" ");
            }
            right--;

            // Traverse from right to left along the bottom row, if still in bounds
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    result.append(matrix[bottom][i]).append(" ");
                }
                bottom--;
            }

            // Traverse from bottom to top along the left column, if still in bounds
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result.append(matrix[i][left]).append(" ");
                }
                left++;
            }
        }

        System.out.println(result.toString().trim()); // Print the result
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the dimensions of the matrix
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = scanner.nextInt();

        int[][] matrix = new int[rows][cols];

        // Taking user input for the matrix elements
        System.out.println("Enter the matrix elements row by row:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Print the matrix in spiral order
        System.out.println("Spiral order of the matrix:");
        spiralPrint(matrix);

        scanner.close(); // Close the scanner
    }
}
