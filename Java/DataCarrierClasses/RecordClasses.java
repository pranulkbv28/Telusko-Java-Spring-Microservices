package Java.DataCarrierClasses;

// class Student {
//     private String name;
//     private int age;

//     public Student(String name, int age) {
//         this.name = name;
//         this.age = age;
//     }

//     public String getName() {
//         return name;
//     }

//     public int getAge() {
//         return age;
//     }

//     @Override
//     public String toString() {
//         return "Student [name=" + name + ", age=" + age + "]";
//     }

//     @Override
//     public int hashCode() {
//         final int prime = 31;
//         int result = 1;
//         result = prime * result + ((name == null) ? 0 : name.hashCode());
//         result = prime * result + age;
//         return result;
//     }

//     @Override
//     public boolean equals(Object obj) {
//         if (this == obj)
//             return true;
//         if (obj == null)
//             return false;
//         if (getClass() != obj.getClass())
//             return false;
//         Student other = (Student) obj;
//         if (name == null) {
//             if (other.name != null)
//                 return false;
//         } else if (!name.equals(other.name))
//             return false;
//         if (age != other.age)
//             return false;
//         return true;
//     }
// }

record Student(String name, int age) {
    // public Student(String name, int age) {
    // if (age == 0)
    // throw new IllegalArgumentException("Age cannot be 0");

    // this.name = name;
    // this.age = age;
    // }

    public Student {
        if (age == 0)
            throw new IllegalArgumentException("Age cannot be 0");
    }
}

public class RecordClasses {
    public static void main(String[] args) {
        Student s1 = new Student("Pranaav", 23);
        Student s2 = new Student("Pranaav", 23);
        Student s3 = new Student("Pranaav", 0);

        System.out.println(s1);

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3)); // throws an exception according to the code
    }
}
