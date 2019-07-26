package rocks.zipcode.quiz4.fundamentals;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

/**
 * @author leon on 21/12/2018.
 */
public class StringUtils {
    public static Character getMiddleCharacter(String string) {
        return string.charAt(string.length()/2);
    }

    public static String capitalizeMiddleCharacter(String str) {
        return midCase(str, true);
    }

    private static String midCase(String str, boolean upper){
        String[] arr = str.split("");
        arr[str.length()/2] = upper? arr[str.length()/2].toUpperCase() : arr[str.length()/2].toLowerCase();
        StringBuilder b = new StringBuilder();
        for(String x : arr){b.append(x);}
        return b.toString();
    }

    public static String lowerCaseMiddleCharacter(String str) {
        return midCase(str, false);
    }

    public static Boolean isIsogram(String str) {
        return null;
    }

    public static Boolean hasDuplicateConsecutiveCharacters(String str) {
        return null;
    }

    public static String removeConsecutiveDuplicateCharacters(String str) {
        return null;
    }

    public static String invertCasing(String str) {
        char[] arr = str.toCharArray();
        int count = 0;
        for(char x : arr){
            if(Character.isUpperCase(x)){
                arr[count] = Character.toLowerCase(x);
            } else {
                arr[count] = Character.toUpperCase(x);
            }
            count++;
        }
        return new String(arr);
    }
}