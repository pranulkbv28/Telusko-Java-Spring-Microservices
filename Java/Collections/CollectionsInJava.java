package Java.Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class CollectionsInJava {
    public static void main(String[] args) {

        Collection<Integer> nums = new ArrayList<Integer>();
        nums.add(6);
        nums.add(5);
        nums.add(4);
        nums.add(3);
        nums.add(2);

        System.out.println(nums); // this is the output [6, 5, 4, 3, 2]

        List<Integer> nums2 = new ArrayList<Integer>();
        nums2.add(1);
        nums2.add(2);
        nums2.add(3);
        nums2.add(4);
        nums2.add(5);

        for (int n : nums2) {
            System.out.println(n);
        }

        Set<Integer> nums3 = new HashSet<Integer>();
        nums3.add(5);
        nums3.add(1);
        nums3.add(3);
        nums3.add(5);
        nums3.add(2);

        for (int n : nums3) {
            System.out.println(n);
        } // here, we do not get repeated values and also we get in a random format. It
          // does not even have index values

        Set<Integer> nums4 = new TreeSet<Integer>();
        nums4.add(1);
        nums4.add(2);
        nums4.add(3);
        nums4.add(4);
        nums4.add(5);

        for (int n : nums4) {
            System.out.println(n);
        } // here, we get the values in a sorted format

        // we can use Maps if we want to work with key-value pairs
        Map<String, Integer> students = new HashMap<String, Integer>();

        students.put("Pranaav", 90);
        students.put("Vaisnavi", 90);
        students.put("Tushar", 100);
        students.put("AK", 83);
        students.put("Viraj", 60);

        System.out.println(students); // here you will get
        // {Pranaav=90, Vaisnavi=90, Tushar=100, AK=83, Viraj=60}
        System.out.println(students.get("Pranaav")); // here, you will et 90

        students.put("Viraj", 80); // here, the integer field paired with Viraj will be replaced by 80
        // each key is unique in a map

        System.out.println(students.keySet()); // [Pranaav, Vaisnavi, Tushar, AK, Viraj]
        System.out.println(students.values());

        for (String key : students.keySet()) {
            System.out.println(key + ":" + students.get(key));
        }

    }
}
