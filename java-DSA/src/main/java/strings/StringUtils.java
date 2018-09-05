package strings;

import java.util.ArrayList;
import java.util.List;

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
            for (int j = i + 1; j < input.length(); j++) {
                if (input.charAt(j) == current) {
                    isUnique = false;
                    break;
                }
            }
            if (!isUnique) {
                break;
            }
        }
        return isUnique;
    }

    /**
     * Write code to reverse a C-Style String.
     * (C-String means that “abcd” is represented as five characters, including the null character.)
     */
    public String reverseCString(String input) {
        if (input.charAt(input.length() - 1) != '\0') {
            System.out.println("Please insert a C Style string!");
            return null;
        } else {
            StringBuilder reversedString = new StringBuilder();
            for (int i = input.length() - 2; i >= 0; i--) {
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
        StringBuilder sb = new StringBuilder();
        StringBuilder triedCharacters = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char current = input.charAt(i);
            if (triedCharacters.toString().contains(current + "")) {
                continue;
            }
            boolean isDuplicate = false;
            for (int j = i + 1; j < input.length(); j++) {
                if (current == input.charAt(j)) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                sb.append(current);
            } else {
                triedCharacters.append(current);
            }
        }
        return sb.toString();
    }


    /**
     * Write a method to decide if two strings are anagrams or not.
     */
    public boolean checkAnagrams(String first, String second) {
        char[] firstWordChars = new char[256];
        char[] secondWordChars = new char[256];
        boolean isAnagramPair = true;
        if(first.length() != second.length()){
            isAnagramPair = false;
        } else {
            for (int i = 0; i < first.length(); i++) {
                firstWordChars[first.charAt(i)]++;
                secondWordChars[second.charAt(i)]++;
            }

            for(int i = 0; i< 256; i++) {
                if(firstWordChars[i] != secondWordChars[i]){
                    isAnagramPair = false;
                    break;
                }
            }
        }
        return isAnagramPair;
    }

    /**
     * Write a method to replace all spaces in a string with ‘%20’.
     */
    public String replaceSpaces(String input) {
        List<Character> characters = new ArrayList<>();

        for(char character : input.toCharArray()) {
            if(character == ' ') {
                characters.add('%');
                characters.add('2');
                characters.add('0');
            } else {
                characters.add(character);
            }
        }
        StringBuilder sb = new StringBuilder();
        characters.forEach(sb::append);

        return sb.toString();
    }
}
