package Strings;

/**
 * @author Simar Preet
 *
 * 1. check if string is palindrome
 *
 */
public class StringUtils {

    public static void main(String[] args) {
        System.out.println(checkPalindrome("geeeeg"));
    }


    //using string builder
    public static boolean checkPalindrome(String s){
        String s1 = s.replaceAll("//s+","").toLowerCase();
        StringBuilder sb = new StringBuilder();
        sb.append(s1);
        return s1.equals(sb.reverse().toString());
    }

}
