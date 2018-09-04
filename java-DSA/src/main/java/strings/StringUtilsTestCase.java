package strings;

import java.sql.SQLOutput;

public class StringUtilsTestCase {

    public static void main(String[] args) {
        StringUtils stringUtils = new StringUtils();
        testStringUniquenessWithExtraDS(stringUtils, "abcdef", "abcdeff");
        testStringUniquenessWithoutExtraDS(stringUtils, "abcdef", "abcdeff");
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
}
