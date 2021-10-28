package leetcode.easy;

import java.util.Optional;

/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 * <p>
 * If there is no common prefix, return an empty string "".
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: strs = ["flower","flow","flight"]
 * Output: "fl"
 * Example 2:
 * <p>
 * Input: strs = ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 */

public class LongestCommonPrefix {

    public static void main(String args[]) {
        String[] list = new String[]{"flower", "flow", "flight"};
        // String [] list = new String[]{"ab", "a"};
        System.out.println("longest prefix = " + longestCommonPrefix(list));
    }


    // using vertical scan i.e. checking if the first char of the first word is present in the 1st position of all other words and then moving to the next char
    public static String longestCommonPrefix(String[] list) {
        StringBuilder prefix = new StringBuilder().append("");
        if (list.length == 0) return "";
        char[] chars = list[0].toCharArray();
        first:
        for (int i = 0; i < chars.length; i++) {     //traverses characters of the first word in the list
            second:
            for (int j = 1; j < list.length; j++) {            // traverses the words in the list
                if (list[j].length() <= i || list[j].charAt(i) != chars[i]) {           //list[j].length()<=i  ---> to check if the length of the jth word is not less than the character being compared, otherwise indexOutOfBounds exception
                    break first;
                }
            }
            prefix.append(chars[i]);
        }
        if (prefix.toString().isEmpty()) {
            return "No prefix found";
        }
        return prefix.toString();

    }
}
