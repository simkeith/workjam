package leetcode;

/**
 * Check if Word Equals Summation of Two Words
 * <p>
 * The letter value of a letter is its position in the alphabet starting from 0 (i.e. 'a' -> 0, 'b' -> 1, 'c' -> 2, etc.).
 * <p>
 * The numerical value of some string of lowercase English letters s is the concatenation of the letter values of each letter in s, which is then converted into an integer.
 * <p>
 * For example, if s = "acb", we concatenate each letter's letter value, resulting in "021". After converting it, we get 21.
 * You are given three strings firstWord, secondWord, and targetWord, each consisting of lowercase English letters 'a' through 'j' inclusive.
 * <p>
 * Return true if the summation of the numerical values of firstWord and secondWord equals the numerical value of targetWord, or false otherwise.
 * Example 1:
 * <p>
 * Input: firstWord = "acb", secondWord = "cba", targetWord = "cdb"
 * Output: true
 * Explanation:
 * The numerical value of firstWord is "acb" -> "021" -> 21.
 * The numerical value of secondWord is "cba" -> "210" -> 210.
 * The numerical value of targetWord is "cdb" -> "231" -> 231.
 * We return true because 21 + 210 == 231.
 * Example 2:
 * <p>
 * Input: firstWord = "aaa", secondWord = "a", targetWord = "aab"
 * Output: false
 * Explanation:
 * The numerical value of firstWord is "aaa" -> "000" -> 0.
 * The numerical value of secondWord is "a" -> "0" -> 0.
 * The numerical value of targetWord is "aab" -> "001" -> 1.
 * We return false because 0 + 0 != 1.
 */

public class WordEqualsSumOfTwoWords {

    public static void main(String args[]) {
        System.out.println("result = " + checkSum("aaa", "a", "aab"));
    }

    public static Integer returnIntegerForChar(char ch) {
        char[] chars = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
        for (int i = 0; i < chars.length-1; i++) {
            if (ch == chars[i]) {
                return i;
            }
        }
        System.out.println("cannot convert char into int");
        return null;
    }

    public static boolean checkSum(String first, String second, String target) {
        int firstSum = 0, secondSum = 0, thirdSum = 0;
        int targetSum;
        for (int i = 0; i <= first.length() - 1; i++) {
            Integer num = returnIntegerForChar(first.charAt(i));
            if (num != null) {
                firstSum = +num.intValue();
            }
        }
        for (int i = 0; i <= second.length() - 1; i++) {
            Integer num = returnIntegerForChar(second.charAt(i));
            if (num != null) {
                secondSum = +num.intValue();
            }
        }
        for (int i = 0; i <= target.length()-1; i++) {
            Integer num = returnIntegerForChar(second.charAt(i));
            if (num != null) {
                thirdSum = +num.intValue();
            }
        }
        return thirdSum == firstSum + secondSum;
    }
}
