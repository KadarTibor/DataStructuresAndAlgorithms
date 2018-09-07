package com.kdrt.strings;


public class StringUtilsTestCase {

    public static void main(String[] args) {
        StringUtils stringUtils = new StringUtils();

        testStringUniquenessWithExtraDS(stringUtils, "abcdef", "abcdeff");
        testStringUniquenessWithoutExtraDS(stringUtils, "abcdef", "abcdeff");

        testReverseCString(stringUtils, "geza kek az eg\0");

        testRemoveDuplicates(stringUtils);

        testCheckAnagrams(stringUtils, "abcd", "acdb");
        testCheckAnagrams(stringUtils, "dachshund", "beaglehun");

        testReplaceStrings(stringUtils,"This is a string containing spaces");
    }

    private static void testStringUniquenessWithExtraDS(StringUtils stringUtils, String goodExample, String badExample) {
        System.out.println("\nWith extra data structure:");
        /* tests whether a character string has duplicate elements*/
        System.out.println("Test for string with unique elements: " + goodExample);
        if (stringUtils.determineUniquenessWithExtraDS(goodExample)) {
            System.out.println("    As expected the input had only unique characters");
        } else {
            System.out.println("    Test failed");
        }

        System.out.println("Test for string with duplicate elements: " + badExample);
        if (!stringUtils.determineUniquenessWithExtraDS(badExample)) {
            System.out.println("    As expected the input had duplicate elements");
        } else {
            System.out.println("    Test failed");
        }
    }

    private static void testStringUniquenessWithoutExtraDS(StringUtils stringUtils, String goodExample, String badExample) {
        System.out.println("\nWithout extra data structure:");
        System.out.println("Test for string with unique elements: " + goodExample);

        if (stringUtils.determineUniquenessWithoutExtraDS(goodExample)) {
            System.out.println("    As expected the input had only unique characters");
        } else {
            System.out.println("    Test failed");
        }

        System.out.println("Test for string with duplicate elements :" + badExample);

        if (!stringUtils.determineUniquenessWithoutExtraDS(badExample)) {
            System.out.println("    As expected the input had duplicate elements");
        } else {
            System.out.println("    Test failed");
        }
    }

    private static void testReverseCString(StringUtils stringUtils, String input) {
        System.out.println("\nTesting the reverse C Style String utility");
        String result = stringUtils.reverseCString(input);

        if (result == null) {
            System.out.println("Bad input");
        } else if (result.equals(new StringBuilder(input.substring(0, input.length() - 1)).reverse().toString() + '\0')) {
            System.out.println("The string was reversed successfully\n input: " + input + "\noutput: " + result);
        } else {
            System.out.println("Test failed");
        }
    }

    private static void testRemoveDuplicates(StringUtils stringUtils) {
        System.out.println("\nTest for continuous duplicate characters");
        if (stringUtils.removeDuplicates("aaaa").equals("")) {
            System.out.println("  As expected the result is an empty string");
        }

        System.out.println("\nTest for alternative duplicate characters");
        if (stringUtils.removeDuplicates("abababab").equals("")) {
            System.out.println("  As expected the result is an empty string");
        }

        System.out.println("\nTest for mixed string with duplicate characters");
        if (stringUtils.removeDuplicates("abacada").equals("bcd")) {
            System.out.println("  As expected the result is containing only atomic characters");
        }

        System.out.println("\nTest for string made of atomic characters");
        if (stringUtils.removeDuplicates("abcd").equals("abcd")) {
            System.out.println("  As expected the result is the same with the input");
        }
    }

    private static void testCheckAnagrams(StringUtils stringUtils, String first, String second) {
        System.out.println("\nTest the two string if they are anagrams: " + first + " " + second);
        if (stringUtils.checkAnagrams(first, second)) {
            System.out.println("    The two strings are anagrams");
        } else {
            System.out.println("    Thw two strings are not anagrams");
        }
    }

    private static void testReplaceStrings(StringUtils stringUtils, String input) {
        System.out.println("\nTest the replace strings with %20 method on string: " + input);

        System.out.println("    The result is: " + stringUtils.replaceSpaces(input));
    }

}
