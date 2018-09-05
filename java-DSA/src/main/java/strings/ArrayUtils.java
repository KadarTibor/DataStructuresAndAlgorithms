package strings;

public class ArrayUtils {


    public ArrayUtils(){

    }

    /**
     * Given an image represented by an NxN matrix, where each pixel in the image is 4 bytes,
     * write a method to rotate the image by 90 degrees. Can you do this in place?
     */
    public int[][] rotateMatrix(int[][] input){

        for(int i = 0; i < input.length / 2; i++) {
            int layer = i;
            for(int j = layer; j < input.length - layer; j++) {
                //save up-left value
                int topLeft = input[layer][input.length-layer];

                //move top-right to bottom-right
                input[input.length - layer][input.length - layer] = input[layer][input.length-layer];

                //move up-left to up-right
                input[layer][input.length-layer] = input[layer][j];

                //move up
            }
        }

        return input;
    }
}
