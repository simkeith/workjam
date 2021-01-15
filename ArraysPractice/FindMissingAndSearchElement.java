import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


/**
 * 1. To find a single missing number from an array
 * with or without additional DS
 * 2. Search for an existing element
 *
 * @author Simar Preet
 */

public class FindMissingAndSearchElement {


//    public static void main(String[] args) {
//            int[] arr = {2,4,1,3,5,7};
//            int sum=0;
//            int n = arr.length + 1;
//            int s = (n * (n+ 1))/2;
//            for (int i=0;i < arr.length;i++){
//                sum += arr[i];
//            }
//        System.out.println("missing no. is "+ (s - sum));
//    }


    //with additional DS
    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 3, 5, 7, 6, 9};
//        FindMissingAndSearchElement.removeDuplicates(arr);
//        FindMissingAndSearchElement.findPairsOfASum(arr, 5);
//        FindMissingAndSearchElement.findExistingElement(arr,3);
//        FindMissingAndSearchElement.findExistingElementWithIndex(arr, 2);
//        Arrays.sort(arr);
//        for (int i=0;i < arr.length-1;i++){
//            if(arr[i+1]-arr[i]!=1){
//                int n = arr[i];
//                System.out.println("missing no. is "+ ++n);
//            }
//        }
    }

    // checking for an existing element
    public static void findExistingElement(int[] arr, int n) {
        List<Integer> arrList = Arrays.stream(arr).boxed().collect(Collectors.toList());
        if (arrList.contains(n)) {
            System.out.println("Element found!");
        }
    }


    // checking for an existing element and return its index
    public static void findExistingElementWithIndex(int[] arr, int n) {
        List<Integer> arrList = Arrays.stream(arr).boxed().collect(Collectors.toList());
        System.out.println("Element found at " + arrList.indexOf(n));
    }

    //find all pairs whose sum is equal to a given number
    public static void findPairsOfASum(int[] arr, int sum) {
        Arrays.sort(arr);
        int first = arr[0], second = arr[0];
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        for (int i = 0; i < sum-1; i++) {
            first = arr[i];
            if (list.contains(sum - first)) {
                second = list.indexOf(sum - first);
            }
            System.out.println(first + "," + list.get(second));
        }
    }

    // remove duplicates
    public static void removeDuplicates(int[] arr){
        List<Integer> list = Arrays.stream(arr).distinct().boxed().collect(Collectors.toList());
        System.out.println(" without duplicates = " + list);
    }

}
