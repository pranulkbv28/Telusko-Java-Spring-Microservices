package Java.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamsInJava {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4, 5, 6, 7, 1, 0, 3);
        List<Integer> nums2 = Arrays.asList(4, 5, 6, 7, 1, 0, 3);

        // Stream<Integer> s1 = nums.stream();
        // Stream<Integer> s2 = s1.filter(n -> n % 2 == 0); // only even numbers are
        // passed on to s2
        // Stream<Integer> s3 = s2.map(n -> n * 2); // all the numbers in s2 are doubled
        // int result = s3.reduce(0, (c, e) -> c+e); // this is used to add all the
        // elements in s3
        // System.out.println(result);

        int result = nums.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 2)
                .reduce(0, (c, e) -> c + e);
        System.out.println(result);

        Stream<Integer> sortedValues = nums2.stream().filter(n -> n % 2 == 0).sorted();

        nums.forEach(n -> System.out.println(n));
        sortedValues.forEach(i -> System.out.println(i));
        // nums.forEach(n -> System.out.println(n)); // this here will cause a compile
        // time error as you cannot REUSE a stream
    }
}
