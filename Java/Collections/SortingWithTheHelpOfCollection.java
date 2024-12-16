package Java.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student> {
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }

    public int compareTo(Student o) {
        if (this.age > o.age) {
            return 1;
        } else {
            return -1;
        }
    }

}

public class SortingWithTheHelpOfCollection {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(); // it is not always neccessary to add the type on the RHS

        nums.add(4);
        nums.add(3);
        nums.add(8);
        nums.add(1);

        System.out.println(nums); // [4, 3, 8, 1]

        Collections.sort(nums);
        System.out.println(nums); // [1, 3, 4, 8]

        List<Integer> nums2 = new ArrayList<>();

        Comparator<Integer> com = new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                if (o1 % 10 > o2 % 10) {
                    return 1;
                } else {
                    return -1;
                }
            }
        };

        nums2.add(42);
        nums2.add(37);
        nums2.add(81);
        nums2.add(15);

        Collections.sort(nums2, com);
        System.out.println(nums2); // [81, 42, 37, 15]

        List<Student> studs = new ArrayList<>();

        // Comparator<Student> studCom = (o1, o2) -> o1.age > o2.age ? 1 : -1;

        studs.add(new Student(22, "Pranaav"));
        studs.add(new Student(21, "Vaisnavi"));
        studs.add(new Student(25, "Tushar"));
        studs.add(new Student(20, "AK"));
        studs.add(new Student(18, "Viraj"));

        for (Student s : studs) {
            System.out.println(s);
        }

        // Collections.sort(studs, studCom);
        Collections.sort(studs); // by adding the compareTo function which we got by implementing Comparable, we
                                 // have made Student itself comparable

        for (Student s : studs) {
            System.out.println(s);
        }

    }
}
