package arrays;

public class ArrayUtilsTestCase {

    public static void main(String[] args) {
        ArrayUtils arrayUtils = new ArrayUtils();

        int[][] matrix = {{3,1,3},{3,1,3},{3,1,3}};

        testMatrixRotation(arrayUtils, matrix);
    }

    public static void testMatrixRotation(ArrayUtils arrayUtils,int[][] matrix) {
        arrayUtils.printMatrix(matrix);
        arrayUtils.printMatrix(arrayUtils.rotateMatrix(matrix));
    }
}
