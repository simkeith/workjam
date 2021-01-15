//package leetcode;
//
//import Strings.*;
//
//import java.util.*;
//
///**
// * @author Simar Preet
// * <p>
// * Given a string s, return the longest palindromic substring in s
// * <p>
// * Example 1:
// * Input: s = "babad"
// * Output: "bab"
// * Note: "aba" is also a valid answer.
// * <p>
// * Example 2:
// * Input: s = "cbbd"
// * Output: "bb"
// */
//
//public class LongestPalindromicSubstring {
//
//    public static void main(String[] args) {
//        checkLongestPalindromeSubstring("spaaaap");
//    }
//
//    public static void checkLongestPalindromeSubstring(String s) {
//        if (s.isEmpty() || s==null){
//            System.out.println("Empty string");
//            return;
//        }
//        int maxLength=0;
//        Map<Integer, String> longestPalindrome = new HashMap<>();
//
//        // reverse s
//        String strRev = StringReverse.reverseByStringBuilder(s);
//
//        //find the common substring between s and s'
////        List<String> list1 = findSubStrings(s);
////        List<String> list2 = findSubStrings(strRev);
//        for (int i=0;i<s.length();i++){
//
//        }
//
//
//        //check if the common sub is a palindrome
//        for (String str : list1) {
//            if (StringUtils.checkPalindrome(str)) {
//                if (str.length()>maxLength)
//                    maxLength=str.length();
//                    longestPalindrome.put(maxLength,str);
//            }
//        }
//        TreeMap<Integer, String> sortedMap = new TreeMap<>();
//        sortedMap.putAll(longestPalindrome);
//        System.out.println("Longest palindromic substring is " + sortedMap.get(0));
//
//    }
//
////    public static List<String> findSubStrings(String s) {
////        List<String> commonSubStrings = new ArrayList<String>();
////        Set<Character> charSet = new HashSet<Character>();
////        char[] chars = s.toCharArray();
////        for (int i = 0; i < chars.length; i++) {
////            if (!charSet.add(chars[i])) {
////                commonSubStrings.add(charSet.toString());
////                charSet.clear();
////            }
////        }
////        return commonSubStrings;
////    }
//}
//
//
//
//
//
//
//
//
//
