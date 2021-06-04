package capco;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.stream.Collectors;

 class Solution {



    // Complete the firstUnique function below.
    static String firstUnique(List<String> words) {
        Map<String, Long> occurences =words.stream()
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

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        final String fileName = System.getenv("OUTPUT_PATH");
        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));

        String line1 = in.nextLine().trim();
        String[] wordsArray = line1.split(",");
        List<String> wordList = new ArrayList<String>();
        for(String item : wordsArray) {
            wordList.add(item.trim());
        }

        String res = firstUnique(wordList);

        bw.write(res);
        bw.newLine();
        bw.close();
        in.close();
    }
}