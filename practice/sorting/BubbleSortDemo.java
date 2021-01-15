package sorting;

/**
 * An outer loop makes N-1 passes over the array.
 * Each pass uses an inner loop to exchange data items such that the next smallest data item “bubbles” towards the beginning of the array.
 * But the problem is the algorithm needs one whole pass without any swap to know that the list is sorted.
 *
 * Bubble sort algo: a[] = {3, 6, 1, 8, 2, 5, 9, 0, 7, 4}
 * For Ascending order
 * <p>
 * for (i from 0 to length-1) {
 * for (j from 0 to length - i -1) {   //inner loop for comparing two adjacent elements
 * if(a[j] > a[j+1]) {
 * temp = a[j];
 * a[j]=a[j+1];
 * a[j+1]=temp;
 * }
 * }
 * }
 *
 * @author Simar Preet
 */
public class BubbleSortDemo {

    public static void main(String[] args) {
        int arr[] = new int[]{3, 6, 1, 8, 2, 5, 9, 0, 7, 4};
        bubbleSort(arr);
    }

    public static void bubbleSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length -i - 1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("sorted array = ");
        for (int k : arr) {
            System.out.println(k);
        }
    }
}
