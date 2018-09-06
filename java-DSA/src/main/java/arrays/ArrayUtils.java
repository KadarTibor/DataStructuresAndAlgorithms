package arrays;

import java.util.HashSet;
import java.util.Set;

public class ArrayUtils {


    public ArrayUtils() {

    }

    /**
     * Given an image represented by an NxN matrix, where each pixel in the image is 4 bytes,
     * write a method to rotate the image by 90 degrees. Can you do this in place?
     */
    public int[][] rotateMatrix(int[][] input) {

        for (int i = 0; i < input.length / 2; i++) {
            int layer = i;
            for (int j = layer; j < input.length - layer; j++) {
                //save top-left value
                int topLeft = input[layer][j];
                //save top-right value
                int topRight = input[j][input.length - 1 - layer];
                //save bottom-right value
                int bottomRight = input[input.length - 1 - layer][input.length - 1 - j];
                //save bottom-left value
                int bottomLeft = input[input.length - 1 - j][layer];

                //move top-right to bottom-right
                input[input.length - 1 - layer][input.length - 1 - j] = topRight;

                //move bottom-right to bottom-left
                input[input.length - 1 - j][layer] = bottomRight;

                //move bottom-left to top-left
                input[layer][j] = bottomLeft;

                //move top-left to top-right
                input[layer + j][input.length - 1 - layer] = topLeft;
            }
        }

        return input;
    }


    /**
     * Write an algorithm such that if an element in an MxN matrix is 0, its entire row and column is set to 0.
     *
     * @param matrix
     */
    public int[][] zeroOutMatrix(int[][] matrix) {

        Set<Integer> columns = new HashSet<>();
        Set<Integer> rows = new HashSet<>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] == 0) {
                    rows.add(i);
                    columns.add(j);
                    matrix = clearRowsAndColumns(matrix, i, j);
                }

                if (columns.contains(j) || rows.contains(i)) {
                    matrix[i][j] = 0;
                }

            }
        }

        return matrix;
    }

    private int[][] clearRowsAndColumns(int[][] matrix, int row, int column) {

        for (int i = 0; i < row; i++) {
            matrix[i][column] = 0;
        }

        for (int i = 0; i < column; i++) {
            matrix[column][i] = 0;
        }

        return matrix;
    }


    public void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
