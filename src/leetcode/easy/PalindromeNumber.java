package leetcode.easy;

/**
 * Given an integer x, return true if x is palindrome integer.
 * <p>
 * An integer is a palindrome when it reads the same backward as forward.
 * For example, 121 is palindrome while 123 is not.
 */
public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        StringBuilder sb = new StringBuilder();
        String s = sb.append(x).reverse().toString();
        try {
            return x == Integer.parseInt(s);
        } catch (NumberFormatException ne) {
            return false;
        }
    }

    public static void main(String args[]) {
        System.out.println(isPalindrome(-121121));
    }
}
