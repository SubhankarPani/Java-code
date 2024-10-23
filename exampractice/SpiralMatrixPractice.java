package exampractice;

import java.util.List;

public class SpiralMatrixPractice {
    public static String Spiral(int[][] matrix){
    int n=matrix.length;
    int m=matrix[0].length;

    int top=0;
    int left=0;
    int right=m-1;
    int bottom=n-1;
    StringBuilder sb=new StringBuilder();

        //left to right
    while(top<=bottom && left<=right) {
        for (int i = left; i <= right; i++) {
            sb.append(matrix[top][i]).append(" ");
        }
        top++;

        //top to bottom
        for (int i = top; i <= bottom; i++) {
            sb.append(matrix[i][right]).append(" ");
        }
        right--;


        if (top <= bottom) {
            for (int i = right; i >= left; i--) {
                sb.append(matrix[bottom][i]).append(" ");
            }
                bottom--;

        }
        if (left <= right) {
            for (int i = bottom; i >= top; i--) {
                sb.append(matrix[i][left]).append(" ");
            }
                left++;

        }
    }
        return sb.toString();
    }
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};
        String ans = Spiral(matrix);
        System.out.println(ans);
    }
}
