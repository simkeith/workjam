package amazon;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Simar Preet
 */

/**
 * Given a list of reviews, a list of keywords and an integer k. Find the most popular k keywords in order of most to least frequently mentioned.
 * The comparison of strings is case-insensitive.
 * Multiple occurrences of a keyword in a review should be considered as a single mention.
 * If keywords are mentioned an equal number of times in reviews, sort alphabetically.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * k = 2
 * keywords = ["anacell", "cetracular", "betacellular"]
 * reviews = [
 * "Anacell provides the best services in the city",
 * "betacellular has awesome services",
 * "Best services provided by anacell, everyone should use anacell",
 * ]
 * <p>
 * Output:
 * ["anacell", "betacellular"]
 * <p>
 * Explanation:
 * "anacell" is occurring in 2 different reviews and "betacellular" is only occuring in 1 review.
 */

public class KFrequentlyMentionedWords {
    public static void main(String args[]) {
        int k = 2;
        String[] keywords = new String[]{"anacell", "betacellular", "cetracular", "deltacellular", "eurocell"};
        String[] reviews = new String[]{
                "I love anacell Best services; Best services provided by anacell",
                "betacellular has great services",
                "deltacellular provides much better services than betacellular",
                "cetracular is worse than anacell",
                "Betacellular is better than deltacellular."
        };
        String[] result = findKFrequencyWords(k, keywords, reviews);
        for (String s:result){
            System.out.println(s + "\n");
        }
    }

    public static String[] findKFrequencyWords(int k, String[] keywords, String[] reviews){
        String[] result = new String[k];

        //take every string from the keywords, check its occurrence in each line. store the number in an hashmap.

        Map<String, Integer> wordCount = new HashMap<String, Integer>();
        for (String keyword: keywords) {
            int count=0;
            for (String line : reviews) {
                List<String> l = Arrays.asList(line.split(" "));
                if(l.stream().map(s -> s.toLowerCase()).anyMatch(s ->  s.contains(keyword))){
                    count ++;
                }
            }
            wordCount.put(keyword,count);
        }

        // sort the hashmap based on values and display the top k keys in an array format
        int i=0;
        Map<String, Integer> sortedMap = wordCount.entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(e1,e2)->e2, LinkedHashMap::new));
      for (String e: sortedMap.keySet()){
          if(i<k){
              result[i]=e;
              i++;
          }
      }

        return result;
    }

}
