package com.zipcodewilmington.danny_do_better_exercises;

import com.sun.xml.internal.fastinfoset.util.CharArray;

/**
 * Created by dan on 6/14/17.
 */
public class StringUtilities {
    /**
     * @return `Hello World` as a string
     */
    public static String getHelloWorld() {
        return "Hello World";
    }

    /**
     * @param firstSegment  a string to be added to
     * @param secondSegment a string to add
     * @return the concatenation of two strings, `firstSegment`, and `secondSegment`
     */
    public static String concatenation(String firstSegment, String secondSegment) {
        return firstSegment + secondSegment;
    }

    /**
     * @param firstSegment  a string to be added to
     * @param secondSegment a string to add
     * @return the concatenation of an integer, `firstSegment`, and a String, `secondSegment`
     */
    public static String concatenation(int firstSegment, String secondSegment) {
        return firstSegment + secondSegment;
    }

    /**
     * @param input a string to be manipulated
     * @return the first 3 characters of `input`
     */
    public static String getPrefix(String input) {


        return input.substring(0, 3);
    }

    /**
     * @param input a string to be manipulated
     * @return the last 3 characters of `input`
     */
    public static String getSuffix(String input) {
        int num1 = input.length() - 3;
        int num2 = input.length();

        return input.substring(num1, num2);
    }

    /**
     * @param inputValue      the value to be compared
     * @param comparableValue the value to be compared against
     * @return the equivalence of two strings, `inputValue` and `comparableValue`
     */
    public static Boolean compareTwoStrings(String inputValue, String comparableValue) {


        return inputValue.equals(comparableValue);
    }

    /**
     * @param inputValue the value input from user
     * @return the middle character of `inputValue`
     */
    public static Character getMiddleCharacter(String inputValue) {
        int num = 0;
        if (inputValue.length() % 2 == 0) {
            num = (inputValue.length() / 2) - 1;
        } else {
            num = inputValue.length() / 2;
        }

        return inputValue.charAt(num);
    }

    /**
     * @param spaceDelimitedString a string, representative of a sentence, containing spaces
     * @return the first sequence of characters
     */
    public static String getFirstWord(String spaceDelimitedString) {
        /*StringBuilder firstWord = new StringBuilder();
        for (int i = 0; i< spaceDelimitedString.length(); i++){
            char temp = spaceDelimitedString.charAt(i);
            firstWord.append(temp);

            }
        System.out.println(firstWord);*/

        String test[] = spaceDelimitedString.split(" ", 2);
        return test[0];
    }

    /**
     * @param spaceDelimitedString a string delimited by spaces
     * @return the second word of a string delimited by spaces.
     */
    public static String getSecondWord(String spaceDelimitedString) {
        String test[] = spaceDelimitedString.split(" ", 2);

        return test[1];
    }

    /**
     * @param stringToReverse
     * @return an identical string with characters in reverse order.
     */
    public static String reverse(String stringToReverse) {
        StringBuilder newString = new StringBuilder();
        for (int i = stringToReverse.length()-1; i > -1 ; i--) {
            char temp = stringToReverse.toCharArray()[i];
            newString.append(temp);

        }
        return newString.toString();
    }
}
