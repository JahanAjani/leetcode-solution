/**
 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/770/
 */
public class RotateImage {

    public void rotate90(int[][] matrix) {
        doTranspose(matrix);
        doReverse(matrix);
    }

    private void doTranspose(int[][] matrix) {
        int tmp;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[i].length; j++) {
                tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }
    }

    private void doReverse(int[][] matrix) {
        int tmp;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < (matrix[i].length / 2); j++) {
                tmp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix[i].length - 1 - j];
                matrix[i][matrix[i].length - 1 - j] = tmp;
            }

        }

    }
}
