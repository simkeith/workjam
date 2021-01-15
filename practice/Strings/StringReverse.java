package Strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * @author Simar Preet
 * <p>
 * 3 approaches
 * 1. basic - by converting string to byte[]
 * 2. using stringbuilder.reverse()
 * 3. using string.tocharArray()
 * 4. using ArrayList and Collections.reverse()
 */
public class StringReverse {

    public static void main(String[] args) {
        System.out.println("1. " + reverseByBytes("Geeks for Geeks"));
        System.out.println("2. " + reverseByStringBuilder("Geeks for Geeks"));
        System.out.println("3. " + reverseWithCharArray("Geeks for Geeks"));
        System.out.println("4. " + reverseWithArrayList("Geeks for Geeks"));
    }

    // 1
    public static String reverseByBytes(String s) {
        byte[] strBytes = s.getBytes();
        byte[] result = new byte[strBytes.length];

        for (int i = 0; i < strBytes.length; i++) {
            result[i] = strBytes[strBytes.length - i - 1];
        }
        return new String(result);
    }

    //2. Can use StringBuffer also -- incase you want to make it threadsafe
    public static String reverseByStringBuilder(String s) {
        StringBuilder sb = new StringBuilder();
        sb.append(s);
       // return new String(sb.reverse());
        return sb.reverse().toString();
    }


    //3. using toCharArray()
    public static String reverseWithCharArray(String s) {
        char[] result = s.toCharArray();
        char[] r = new char[result.length];
        int i, j;
        for (i = s.length() - 1, j = 0; i >= 0 && j < result.length; i--, j++) {
            r[j] = result[i];
        }
        return new String(r);
    }

    //4. using ArrayList and Collections.reverse()
    public static String reverseWithArrayList(String s) {
        List<Character> l = new ArrayList<>();
        for (char c : s.toCharArray()) {
            l.add(c);
        }
        Collections.reverse(l);
        StringBuilder sb = new StringBuilder();
        Iterator<Character> it = l.listIterator();
        while (it.hasNext()) {
            sb.append(it.next());
        }
        return sb.toString();
    }
}
