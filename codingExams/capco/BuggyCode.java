package capco;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class BuggyCode {



    private static LongBinaryOperator addLongs = (t, u) -> t + u;

    public static long add(int a, int b) {
        return (int) addLongs.applyAsLong(a, b);
    }

    public static void main(String[] args) throws IOException {
//        Scanner in = new Scanner(System.in);
//        final String fileName = System.getenv("OUTPUT_PATH");
//        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
//
//        String line1 = in.nextLine().trim();
//        String[] numbers = line1.split(",");

        Long res = add(10,10);
        System.out.println(res);
//        bw.write(res.toString());
//        bw.newLine();
//        bw.close();
//        in.close();
    }
}
