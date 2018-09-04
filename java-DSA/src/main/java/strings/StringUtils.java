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

    /**
    * Write code to reverse a C-Style String.
    * (C-String means that “abcd” is represented as five characters, including the null character.)
    */
    public String reverseCString(String input){
      if(input.charAt(input.length() - 1) != '\0') {
        System.out.println("Please insert a C Style string!");
        return null;
      } else {
        StringBuilder reversedString = new StringBuilder();
        for(int i = input.length() - 2; i >= 0; i--) {
          reversedString.append(input.charAt(i));
        }
        reversedString.append('\0');
        return reversedString.toString();
      }
    }


    /**
     * Design an algorithm and write code to remove the duplicate characters in a string
     * without using any additional buffer. NOTE: One or two additional variables are fine.
     * An extra copy of the array is not.
     */
    public String removeDuplicates(String input) {


        return "";
    }

}
