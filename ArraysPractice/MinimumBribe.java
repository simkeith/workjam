/**
 * @author Simar Preet
 */

import java.util.*;

/**
 *
 * It's New Year's Day and everyone's in line for the Wonderland rollercoaster ride!
 * There are a number of people queued up, and each person wears a sticker indicating their initial
 * position in the queue. Initial positions increment by  from  at the front of the line to  at the back.
 *
 * Any person in the queue can bribe the person directly in front of them to swap positions.
 * If two people swap positions, they still wear the same sticker denoting their original places in line.
 * One person can bribe at most two others. For example, if  and  bribes , the queue will look like this: .
 *
 * Fascinated by this chaotic queue, you decide you must know the minimum number of bribes that
 * took place to get the queue into its current state!
 *
 * Function Description
 * Complete the function minimumBribes in the editor below. It must print an integer representing
 * the minimum number of bribes necessary, or Too chaotic if the line configuration is not possible.
 * minimumBribes has the following parameter(s):
 *
 * q: an array of integers
 */
public class MinimumBribe {

    // Complete the minimumBribes function below.
    static void minimumBribes(int[] q) {
        int count = 0;
        if (q.length == 0) {
            System.out.println("result = " + 0);
        }
        for (int i = 0; i < q.length - 1; i++) {
            int first=q[i];
            for (int j = i; j < q.length - 1; j++) {
                if (first > q[j + 1]) {
                    count++;
                }
            }
        }
        System.out.println("result =" + count);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        minimumBribes(new int[]{3, 2, 1, 5, 4, 7, 6});
//        int t = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        for (int tItr = 0; tItr < t; tItr++) {
//            int n = scanner.nextInt();
//            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//            int[] q = new int[n];
//
//            String[] qItems = scanner.nextLine().split(" ");
//            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//            for (int i = 0; i < n; i++) {
//                int qItem = Integer.parseInt(qItems[i]);
//                q[i] = qItem;
//            }
//
//            minimumBribes(q);
//        }
//
//        scanner.close();
    }
}

