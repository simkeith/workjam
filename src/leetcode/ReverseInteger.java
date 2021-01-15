package leetcode;

/**
 * @author Simar Preet
 * <p>
 * Given a 32-bit signed integer, reverse digits of an integer.
 * <p>
 * Note: Assume we are dealing with an environment that could only store integers within the 32-bit signed integer range: [−231,  231 − 1].
 * For this problem, assume that your function returns 0 when the reversed integer overflows.
 */
public class ReverseInteger {

    public static void main(String[] args) {
        System.out.println("reverse = " + reverseInt(-203900));
        System.out.println("reverse = " + reverseInt(-0));
    }

    public static int reverseInt(int number) {
        String result = new StringBuilder().append(Math.abs(number)).reverse().toString();
        try {
            return (number < 0) ? (Integer.parseInt(result) * -1) : Integer.parseInt(result);
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}
