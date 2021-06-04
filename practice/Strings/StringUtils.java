package Strings;

import java.util.stream.IntStream;

/**
 * @author Simar Preet
 *
 * check if string is palindrome
 * check if the string equals its reverse
 */
public class StringUtils {

    public static void main(String[] args) {
        System.out.println(checkPalindrome("geeeeg"));
        System.out.println(checkPalindrome2("radars"));
    }


    //using string builder
    public static boolean checkPalindrome(String s){
        String s1 = s.replaceAll("//s+","").toLowerCase();
        StringBuilder sb = new StringBuilder();
        sb.append(s1);
        return s1.equals(sb.reverse().toString());
    }

    public static boolean checkPalindrome2(String s){
        String s1 = s.replaceAll("//s+","").toLowerCase();
        return IntStream.range(0,s1.length()-1).noneMatch(i->s1.charAt(i)!=s1.charAt(s1.length()-1-i));
    }

}
