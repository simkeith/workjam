package Strings;

import java.util.HashMap;
import java.util.Map;

/**
 * Check if two given strings are isomorphic to each other
 * Two strings str1 and str2 are called isomorphic if there is a one to one mapping possible for every character of str1 to every character of str2. And all occurrences of every character in ‘str1’ map to same character in ‘str2’.
 * <p>
 * Examples:
 * <p>
 * Input:  str1 = "aab", str2 = "xxy"
 * Output: True
 * 'a' is mapped to 'x' and 'b' is mapped to 'y'.
 * <p>
 * Input:  str1 = "aab", str2 = "xyz"
 * Output: False
 * One occurrence of 'a' in str1 has 'x' in str2 and
 * other occurrence of 'a' has 'y'.
 * <p>
 * st1 = "lalalyly", str2="ababafaf"
 * Output = true
 * l-->a
 * a-->b
 * y-->f
 */

// Strings with unequal lengths -- return null
// use hashmap and set


public class IsomorphicStrings {

    public static void main(String args[]) {
        System.out.println(isIsomorphicStrings("lalalaaly","abababbau"));
    }

    public static boolean isIsomorphicStrings(String str1, String str2) {
        // if strings are not of equal length, they're not isomorphic
        if (str1.length() != str2.length()) {
            return false;
        }
        //using HM for character mapping
        Map<Character, Character> characterMap = new HashMap<>();

       //added the first characters of each string in the HM
        characterMap.put(str1.charAt(0), str2.charAt(0));

        // for each character of first string
        for (int i = 1; i < str1.length(); i++) {
            if (!characterMap.containsKey(str1.charAt(i))) {
                if (!characterMap.containsValue(str2.charAt(i))) {
                    // If the ith char in both strings does exist in the HM, then add a new entry
                    characterMap.put(str1.charAt(i), str2.charAt(i));
                }
            } else {
                // If the ith char in first string exists,
                // but doesn't match the ith char in second string, then return false
                if (str2.charAt(i) != characterMap.get(str1.charAt(i))) {
                    return false;
                }
            }
        }
        return true;
    }
}
