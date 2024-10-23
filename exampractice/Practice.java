package exampractice;

public class Practice {
    public static void SpiralMatrix(int[][] matrix ) {
        int n = matrix.length;
        int m = matrix[0].length;
      StringBuilder sb=new StringBuilder();
        int top = 0;
        int left = 0;
        int right = m - 1;
        int bottom = n - 1;

        while (top <= bottom && left <= right) {
            for(int i = left ;i<=right;i++){
                sb.append(matrix[top][i]).append(" ");
            }
            top++;

            for (int i =top; i <=bottom; i++) {
                sb.append(matrix[i][right]).append(" ");
            }
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--)
                    sb.append(matrix[bottom][i]).append(" ");

                bottom--;
            }

            // For moving bottom to top.
            if (left <= right) {
                for (int i = bottom; i >= top; i--)
                    sb.append(matrix[i][left]).append(" ");

                left++;
            }
        }
        System.out.println(sb.toString());
    }
    public static void main(String[] args) {
        int[][] matrix={{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};
SpiralMatrix(matrix);

    }
}
