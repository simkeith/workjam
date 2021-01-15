package amazon;

/**
 * GCD of more than two (or array) numbers
 * Given an array of numbers, find GCD of the array elements. In a previous post we find GCD of two number.
 *
 * Examples:
 *
 * Input  : arr[] = {1, 2, 3}
 * Output : 1
 *
 * Input  : arr[] = {2, 4, 6, 8}
 * Output : 2
 */

/**
 * @author Simar Preet
 */
public class GCD {

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 16 };
        int n = arr.length;
        System.out.println(generalizedGCD(n, arr));
    }

        public static int generalizedGCD(int num, int[] arr)
        {
            int result = arr[0];
            for (int i=1;i<num;i++){
                result = findGCD(arr[i], result);

                if (result == 1){
                    return 1;
                }
            }
            return result;
        }

        public static int findGCD(int a, int b){
            if (a==0){
                return b;
            }else{
                return findGCD(b % a, a);
            }
        }

    }

