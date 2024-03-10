package com.zipcodewilmington;

import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return array[array.length-1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length-2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        //convert the String array to a single String and the contains method is applied to the string to check if it contains value
        if(Arrays.toString(array).contains(value)){

        }
        return true;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        Collections.reverse(Arrays.asList(array));
        return array;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {

        // two different counters
        int i = 0;
        int j = array.length -1;

        while (i < array.length-1){

            // if interate at i is equal to j
            if(array[i].equals(array[j])){
                i++;
                j--;
            }else{
                return false;
            }
        }
        return true;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {

        // Define a string containing all the lowercase letters of the alphabet
        String alpha = "abcdefghijklmnopqrstuvwxyz";

        // Convert the alpha string into a char array and assign it to alphaArray
        char[] alphaArray = alpha.toCharArray();


        // Make Stringbuilder object
        StringBuilder stringBuilder = new StringBuilder();


        // Loop through each index of array to append to lowercase
        for (String i : array){
            stringBuilder.append(i.toLowerCase());
        }

        // Assign Stringbuilder instance to new var
        String newConcatedString = stringBuilder.toString();

        // Loop though each char of created alphabet array
        for (char character : alphaArray){

            // if concated string does not contain each character of alphaArray return false
            if(!newConcatedString.contains(String.valueOf(character))) {
                return false;
            }
        }
        return true;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int valueCounter = 0;

        for (String word : array) {

            //check if current element is the same as given string if it is increase the counter
            if (word.equals(value)){
                valueCounter++;
            }
        }
        return valueCounter;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove){
        // Make new array and size it to given array -1 since were only removing 1 value from it
        String[] newArray = new String[array.length-1];

        // Have a counter for index were currently on
        int currentIndex =0;

        // Interate through the given array
        for(String i : array){

            // See if element matches given value "im checking if its not the same"
            if(!i.equals(valueToRemove)){

                // Add i to current index of new array if its not the same
                newArray[currentIndex] += i;

                //
                currentIndex++;
            }
        }
        return newArray;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        // Create a new array list
          List<String> noConsecDupes = new ArrayList<>();

          // Store the first element of array into the new array list
          noConsecDupes.add(array[0]);

          // Iterate throught the array starting at the second index because we already added the first element
          for (int i = 1; i < array.length; i ++){

              // Check to see if the i is different than i-1
              if(!array[i - 1].equals(array[i])){

                  // Store i if it different
                  noConsecDupes.add(array[i]);
              }
          }
          // Change list back to array and return
          return noConsecDupes.toArray(new String[0]);
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        return null;
    }


}
