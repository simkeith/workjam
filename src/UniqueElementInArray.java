import java.util.*;
import java.util.stream.Collectors;


/**
 *  FIND THE FIRST ELEMENT IN THE ARRAY THAT OCCURS UNIQUELY. If no unique products, return null.
 *  Should return "computer"
 */


public class UniqueElementInArray {

    public static String firstUniqueProduct(String[] arr) {
        Map<String, Long> occurences = Arrays.stream(arr)
                .collect(Collectors.groupingBy(s -> s,Collectors.counting()));
        if(!occurences.isEmpty()){
            for (Map.Entry<String,Long> i : occurences.entrySet()){
                if(i.getValue() == Long.valueOf(1)){
                    return i.getKey();
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(UniqueElementInArray.firstUniqueProduct(new String[]{"Apple", "Computer", "Apple", "Bag"}));
    }
}

