import java.util.*;
import java.util.stream.Collectors;

/**
 * Prep questions eBay
 * 1. Find anagrams in the list of words given
 * 2. sort a given map based on values
 * <p>
 * https://codeinterview.io/playback/HNXNSUZUAT#?t=835
 *
 * @author Simar Preet
 */


public class Solution {

    public static void main(String[] args) {

        //1. find anagrams in this list
        // expected output: {{Rat, Tar}, {Car, Arc},{Elbow,Below}}
        List<String> words = new ArrayList<String>();

        words.add("Rat");
        words.add("Car");
        words.add("Below");
        words.add("Tast");
        words.add("Cried");
        words.add("Study");
        words.add("Thing");
        words.add("Chin");
        words.add("Grab");
        words.add("Act");
        words.add("Robed");
        words.add("Vase");
        words.add("Glean");
        words.add("Desserts");
        words.add("Tar");
        words.add("Arc");
        words.add("Elbow");
        words.add("State");
        words.add("Cider");
        words.add("Dusty");
        words.add("Night");
        words.add("Inch");
        words.add("Brag");
        words.add("Cat");
        words.add("Bored");
        words.add("Save");
        words.add("Angel");
        words.add("Streseed");


        getAnagrams(words);


        //2. Given a map of int,string KV pairs. sort it based on its values in desc order (Z->A)
        // expected output : [109=Rebeca, 19=Rahim, 18=Mohan, 10=Krishna, 101=Hemendra, 111=David, 11=Christine, 103=Anish, 99=Andrew]
        Map<Integer, String> map = new HashMap<Integer, String>();

        map.put(101, "Hemendra");
        map.put(99, "Andrew");
        map.put(103, "Anish");
        map.put(18, "Mohan");
        map.put(11, "Christine");
        map.put(109, "Rebeca");
        map.put(111, "David");
        map.put(19, "Rahim");
        map.put(10, "Krishna");
        map.put(1001, "Krishna");

     //   sortMap(map);

    }

    // when sorting based on keys - use treemap
    // when sorting based on values - use comparator (best approach) or like one below
    public static void sortMap(Map<Integer, String> map) {
        // map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(System.out::println);

        // using comparator and treemap
        Map<String, Integer> tree = new TreeMap<String, Integer>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);                    // reversing here
            }
        });
        for (Integer i : map.keySet()) {
            tree.put(map.get(i), i);
        }
        System.out.println("tree map = " + tree);
        Map<Integer, String> result = new LinkedHashMap<>();
        for (String s : tree.keySet()){
            result.put(tree.get(s),s);
        }
        System.out.println("sorted map = " + result);
    }


    // check if length of words are equal and characters are same in the set
    public static void getAnagrams(List<String> words) {
      Map<String, List<String>> result = new HashMap<>();
      words.stream().map(word->{
          char[] chars = word.toLowerCase().toCharArray();
          Arrays.sort(chars);
          return new String (chars);
      }).collect(Collectors.toSet()).forEach(val -> result.putIfAbsent(val, new ArrayList<>()));

      words.stream().forEach(word->{
          char[] chars = word.toLowerCase().toCharArray();
          Arrays.sort(chars);
         result.get(new String(chars)).add(word);
      });
        System.out.println("anagrams = " + result.values());
    }

}

//------------------------------------------------------------------------------------------------------------------------------------

// What is the output for the mentioned code and why?

class DemoExample {

    public static void main(String[] args) {
        ThreadDemo threadDemo = new ThreadDemo();
        threadDemo.start();

        for (int i = 0; i < 10; i++) {

            System.out.println("Value of i is : " + i);

        }
    }
}

class ThreadDemo extends Thread {

    @Override
    public synchronized void start() {
        System.out.println("Inside the start method!!!");
    }

    @Override
    public void run() {
        System.out.println("Inside the run method!!!");
    }
}

//Solution:
//        Inside the start method!!!
//        Value of i is : 0

// In the ThreadDemo class we are overriding both start and run method of the parent class Thread. The Thread class start method invokes the run method implicitly
// But since the start method is overriden here, we will follow that implementation. Here the start method does not call the run method inside it,
// therefore the run method will never get called.
//------------------------------------------------------------------------------------------------------------------------------------


// Make the mentioned class as singleton

//class Student{
//    private String name;
//    private List<String> courses;
//    public Student(){}
//
//    //getters
//    //setters
//}


/**
 * Points to remember for singleton -
 * 1. make constructor private
 * 2. create a static instance of the class
 * 3. expose the static instance from inside a get method
 */

//SOLUTION 1: SINGLETON WITH LAZY INITIALIZATION
class Student {

    private String name;
    private List<String> courses;
    private static Student student = null;

    //make the const private to prevent instantiation
    private Student(String name, List<String> courses) {
        this.name = name;
        this.courses = courses;
    }

    //expose a method that gives back one instance only
    public static Student getInstance(String name, List<String> courses) {
        if (student == null) {
            student = new Student(name, courses);
        }
        return student;
    }

    //only public getters
}

class StudentDemo {
    public static void main(String[] args) {
        Student s = Student.getInstance("Sim", Arrays.asList("maths", "english"));
        Student s2 = Student.getInstance("Sur", Arrays.asList("maths", "english"));
        System.out.println("Student 1 hashcode = " + s.hashCode());
        System.out.println("Student 2 hashcode = " + s2.hashCode());
    }
}

//SOLUTION 2: THREAD SAFE SINGLETON
class StudentThreadSafe {
    private String name;
    private List<String> courses;
    // make the instance volatile
    private static volatile StudentThreadSafe student = null;


    private StudentThreadSafe(String name, List<String> courses) {
        this.name = name;
        this.courses = courses;
    }

    public static StudentThreadSafe getInstance(String name, List<String> courses) {
        // The approach taken here is called double-checked locking (DCL). It
        // exists to prevent race condition between multiple threads that may
        // attempt to get singleton instance at the same time, creating separate
        // instances as a result.
        //
        // It may seem that having the `result` variable here is completely
        // pointless. There is, however, a very important caveat when
        // implementing double-checked locking in Java, which is solved by
        // introducing this local variable.
        StudentThreadSafe result = student;
        if (result != null) // check for the first time
        {
            return result;
        }
        synchronized (StudentThreadSafe.class) {
            if (student == null) {
                student = new StudentThreadSafe(name, courses);
            }
            return student;
        }
    }
    //only public getters
}

class StudentThreadSafeDemo {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Thread1());
        Thread t2 = new Thread(new Thread2());
        t1.start();
        t2.start();
    }
}

class Thread1 implements Runnable {
    @Override
    public void run() {
        StudentThreadSafe s = StudentThreadSafe.getInstance("Sim", Arrays.asList("maths", "english"));
        System.out.println("Student 1 hashcode = " + s.hashCode());
    }
}

class Thread2 implements Runnable {
    @Override
    public void run() {
        StudentThreadSafe s1 = StudentThreadSafe.getInstance("Sur", Arrays.asList("maths", "english"));
        System.out.println("Student 1 hashcode = " + s1.hashCode());
    }
}


//------------------------------------------------------------------------------------------------------------------------------------


// Make the mentioned class immutable
//class Student{
//    private String name;
//    private List<String> courses;
//    public Student(){}
//    //getters
//    //setters
//}

/**
 * Steps to make immutable class
 * 1. Make your class final, so that no other classes can extend it.
 * 2. Make all your fields final, so that they’re initialized only once inside the constructor and never modified afterward.
 * 3. Expose only getters
 * 4. When exposing methods which modify the state of the class, you must always return a new instance of the class.
 * 5. If the class holds a mutable object:
 * 5.1. Inside the constructor, make sure to use a clone copy of the passed argument and never set your mutable field to the real instance passed through constructor,
 * this is to prevent the clients who pass the object from modifying it afterwards.
 * 5.2  Make sure to always return a clone copy of the field and never return the real object instance.
 */

final class StudentImmutable {
    private final String name;              // immutable field since String is immutable
    private final List<String> courses;        // mutable field

    public StudentImmutable(String name, List<String> courses) {
        this.name = name;
        //this.courses = courses;                 // this will only create a shallow copy
        List<String> temp = new ArrayList<>();                  //  5.1 deep copy using cloning
        temp.addAll(courses);
        this.courses = Collections.unmodifiableList(temp);           // make the clone unmodifiable
    }

    public String getName() {
        return name;
    }

    public List<String> getCourses() {
        return new ArrayList<>(courses);                        // 5.2
    }
}



//    public static void main(String[] args) {
//        String[] str = new String[] {"simar", "samir", "suresh"};   // s
//        // String[] str = new String[] {"simar", "siya", "sita", "siram"};    // si
//        //String[] str = new String[] {"simar","pranav", "siya"};    //""
//        System.out.println(getPrefix(str));
//    }
//
//    public static String getPrefix(String[] str){
//        StringBuilder sb = new StringBuilder();
//        String first = str[0];
//        for (int i=0;i<first.length();i++){
//            for(int j=1;j<str.length;j++){
//                if(first.charAt(i)==str[j].charAt(i)){
//                    continue;
//                }else{
//                    return sb.toString();
//                }
//            }
//            sb.append(first.charAt(i));
//        }
//        return sb.toString();
//    }


//input - aaabbccabd
// output - 3a2b2c1a1b1d
//
//    public static String transformString(String s){
//        StringBuilder sb = new StringBuilder();
//        int count=1;
//        for (int i=0;i<s.length()-1;i++){
//            if(s.charAt(i)==s.charAt(i+1)){
//                count++;
//            }else{
//                sb.append(count);
//                sb.append(s.charAt(i));
//                count=1;
//            }
//
//        }
//        return sb.toString();
//    }
//
//    // input = 5,3
//    //output = 125
//    public static int power(int num, int pow){
//        int result=num;
//        while(pow>0){
//            result = result * power(result,pow--);
//        }
//        return result;
//    }
//    public List<Integer> removeDuplicates(List<Integer> numbers){
//       // Set<Integer> set = numbers.stream().collect(Collectors.toSet());
//        List<Integer> result = new ArrayList<>();
//        for(Integer i:numbers){
//            if(!result.contains(i)){
//                result.add(i);
//            }
//        }
//        return result;
//    }
