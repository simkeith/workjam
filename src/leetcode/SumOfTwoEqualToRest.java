package leetcode;

import java.io.*;
import java.util.*;

/**
 * @author Simar Preet
 *
* Check if there exist two elements in an array whose sum is equal to the sum of rest of the array
* Input  : arr[] = {2, 11, 5, 1, 4, 7}
* Output : Elements are 4 and 11
* Note that 4 + 11 = 2 + 5 + 1 + 7
*
* Input  : arr[] = {1,  6, 5, 2, 8}
* Output : Elements are 5 and 6
* Note that 6 + 5 = 1 + 2 + 8
*
* Input  : arr[] = {2, 4, 2, 1, 11, 15}
* Output : Elements do not exist
*/

class MyCode {
    public static void main(String[] args) {


        int arr1[] = {4, 1, 3, 2};
        int n1 = arr1.length;
        if (isSumOf2EqualToRest(arr1, n1) == false) {
            System.out.println("No Pairs found");
        }
    }

    static boolean isSumOf2EqualToRest(int arr[], int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        if (sum % 2 != 0) {
            return false;
        }

        int sum1 = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                sum1 = arr[i] + arr[j];
                if (sum - sum1 == sum1) {
                    System.out.println("pair elements are = " + arr[i] + ", " + arr[j]);
                    return true;

                }
            }
        }

        // online solution

//        sum = sum/2;
//
//        HashSet<Integer> set = new HashSet<Integer>();
//        for(int i= 0; i<n; i++)
//        {
//            int val = sum - arr[i];
//            if(set.contains(val) && val == (int) set.toArray()[set.size() - 1])
//            {
//                System.out.printf("Pair elements are %d and %d\n", arr[i] , val);
//                return true;
//            }
//            set.add(arr[i]);
//
//        }

        return false;
    }
}




