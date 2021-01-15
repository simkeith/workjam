import java.util.stream.Stream;


public class MergeNamesArray {

    public static String[] uniqueNames(String[] names1, String[] names2) {

        Stream<String> stringStream1 = Stream.of(names1);
        Stream<String> stringStream2 = Stream.of(names2);
        return Stream.concat(stringStream1, stringStream2).distinct().toArray(String[]::new);

    }

    public static void main(String[] args) {
        String[] names1 = new String[] {"Ava", "Emma", "Olivia"};
        String[] names2 = new String[] {"Olivia", "Sophia", "Emma"};
        System.out.println(String.join(", ", MergeNamesArray.uniqueNames(names1, names2))); // should print Ava, Emma, Olivia, Sophia
    }
}