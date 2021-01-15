package sorting;

import java.util.Arrays;

/**
 * The selection sort algorithm sorts an array by repeatedly finding the minimum element
 * (considering ascending order) from unsorted part and putting it at the beginning of the array
 *
 * @author Simar Preet
 */
public class SelectionSortDemo {

    public static void main(String[] args) {
        int arr[] = new int[]{3, 6, 1, 8, 2, 5, 9, 0, 7, 4};
        selectionSort(arr);
    }

    public static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[min]) {                   // find the min or max of the array in each iteration
                    min = j;
                }
            }
            // swap the min-th element with the i-th element
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        System.out.println("sorted array = ");
        for (int k : arr) {
            System.out.println(k);
        }
    }
}

