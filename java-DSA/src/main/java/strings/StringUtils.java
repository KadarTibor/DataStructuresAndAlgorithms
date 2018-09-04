package strings;

public class StringUtils {

    /**
     * Implement an algorithm to determine if a string has all unique characters.
     * What if you can not use additional data structures?
     */
    public boolean determineUniquenessWithExtraDS(String input) {

        boolean[] characters = new boolean[256];
        boolean isUnique = true;
        for (char character : input.toCharArray()) {
            if (characters[character]) {
                isUnique = false;
                break;
            } else characters[character] = true;
        }

        return isUnique;
    }

    public boolean determineUniquenessWithoutExtraDS(String input) {
        boolean isUnique = true;
        for (int i = 0; i < input.length(); i++) {
            char current = input.charAt(i);
            for(int j = i + 1; j < input.length(); j++) {
               if(input.charAt(j) == current) {
                 isUnique = false;
                 break;
               }
            }
            if(!isUnique) {
              break;
            }
        }
        return isUnique;
    }

}
