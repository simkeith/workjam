package leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Simar Preet
 * <p>
 * Given a string s, find the length of the longest substring without repeating characters.
 * Input: s = "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 * Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */
public class LongestSubstringWithoutRepeat {

    public static int findLongestSubstring(String s) {
        Set<Character> dummySet = new HashSet<>();
        int max = 0;
        if (s.length() == 0) {
            return 0;
        }
        char[] charset = s.toCharArray();
        for (int i = 0; i < s.length() - 1; i++) {
            int length = 0;
            for (int j = i; j < s.length() - 1; j++) {
                if (dummySet.add(charset[j])) {
                    length++;
                } else {
                    break;
                }
            }
            dummySet.clear();
            if (length > max) {
                max = length;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println("Length of largest substring = " + LongestSubstringWithoutRepeat.findLongestSubstring("pwwkew"));
    }
}
