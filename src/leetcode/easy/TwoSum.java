package leetcode.easy;

import java.util.*;


/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * <p>
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * <p>
 * You can return the answer in any order.
 * <p>
 * For example, findTwoSum(new int[] { 3, 1, 5, 7, 5, 9 }, 10) should return a single dimensional array with two elements and contain any of the following pairs of indices:
 * <p>
 * 0 and 3 (or 3 and 0) as 3 + 7 = 10
 * 1 and 5 (or 5 and 1) as 1 + 9 = 10
 * 2 and 4 (or 4 and 2) as 5 + 5 = 10
 */

public class TwoSum {
    public static int[] findTwoSum(int[] list, int sum) {
        int[] result = new int[2];
        for (int i = 0; i < list.length; i++) {
            for (int j = i+1; j < list.length; j++) {
                if (sum == list[i] + list[j]) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }

        }
        return null;
    }

    public static void main(String[] args) {
     //   Optional<int[]> indices = Optional.ofNullable(findTwoSum(new int[]{2, 1, 5, 7, 5, 9}, 10));
        Optional<int[]> indices = Optional.ofNullable(findTwoSum(new int[]{3,2,4}, 6));
        if(indices.isPresent()) {
            int[] result = indices.get();
            System.out.println(result[0] + " " + result[1]);
        }
    }
}

