package Strings;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Simar Preet
 */
public class KFrequentElements {

    public static void main(String[] args) {
        int[] nums = new int[]{3, 1, 1, 2, 2, 1, 1, 1, 1, 2, 2};
        getKFrequentElements(nums, 2);
    }

    public static void getKFrequentElements(int[] nums, int k) {
        Map<Integer, Integer> result = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            result.put(nums[i], result.getOrDefault(nums[i], 0) + 1);
        }
        System.out.println(result);
    }

}
