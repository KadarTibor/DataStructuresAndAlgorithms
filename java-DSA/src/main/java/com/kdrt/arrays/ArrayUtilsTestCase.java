package com.kdrt.arrays;

public class ArrayUtilsTestCase {

    public static void main(String[] args) {
        ArrayUtils arrayUtils = new ArrayUtils();

        int[][] matrix = {{3, 1, 3}, {3, 0, 3}, {3, 1, 3}};

        testMatrixRotation(arrayUtils, matrix);

        testZeroOutMatrix(arrayUtils, matrix);
    }

    public static void testMatrixRotation(ArrayUtils arrayUtils, int[][] matrix) {
        System.out.println("\nTest Matrix Rotation");
        arrayUtils.printMatrix(matrix);
        arrayUtils.printMatrix(arrayUtils.rotateMatrix(matrix));
    }

    public static void testZeroOutMatrix(ArrayUtils arrayUtils, int[][] matrix) {
        System.out.println("\nTest zeroing out matrix");
        arrayUtils.printMatrix(matrix);
        arrayUtils.printMatrix(arrayUtils.zeroOutMatrix(matrix));
    }
}
