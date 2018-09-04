package strings;


public class StringUtilsTestCase {

    public static void main(String[] args) {
        StringUtils stringUtils = new StringUtils();

        testStringUniquenessWithExtraDS(stringUtils, "abcdef", "abcdeff");
        testStringUniquenessWithoutExtraDS(stringUtils, "abcdef", "abcdeff");

        testReverseCString(stringUtils, "geza kek az eg\0");
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

      if(result == null) {
        System.out.println("Bad input");
      } else if(result.equals(new StringBuilder(input.substring(0, input.length() - 1)).reverse().toString() + '\0')){
        System.out.println("The string was reversed successfully\n input: " + input + "\noutput: " + result);
      } else {
          System.out.println("Test failed");
      }
    }

}
