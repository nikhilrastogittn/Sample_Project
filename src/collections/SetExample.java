package collections;

import java.util.*;

public class SetExample {

    public static void main(String[] args) {

        // no order
        Set<Integer> integerSet = new HashSet<>();

        integerSet.add(23);
        integerSet.add(34);
        integerSet.add(123);
        integerSet.add(1);
        integerSet.add(8);

        System.out.println(integerSet);

        System.out.println(integerSet.remove(23));
        System.out.println(integerSet.remove(23));

        System.out.println(integerSet.isEmpty());

        System.out.println(integerSet.size());

        System.out.println(integerSet.contains(23));

        integerSet.clear();

        System.out.println(integerSet);


        // insertion order preserved
        Set<Integer> integerSet1 = new LinkedHashSet<>();

        integerSet1.add(23);
        integerSet1.add(34);
        integerSet1.add(123);
        integerSet1.add(1);
        integerSet1.add(8);

        System.out.println(integerSet1);


        // stored in sorted order
        Set<Integer> integerSet2 = new TreeSet<>(Comparator.reverseOrder());

        integerSet2.add(23);
        integerSet2.add(34);
        integerSet2.add(123);
        integerSet2.add(1);
        integerSet2.add(8);

        System.out.println(integerSet2);


        // Custom class with set

        Set<Student> studentSet = new HashSet<>();

        studentSet.add(new Student(12, "nikhil"));
        studentSet.add(new Student(234, "rakesh"));
        studentSet.add(new Student(12, "nikhil"));

        System.out.println(studentSet);

        System.out.println(new Student(12, "nikhil").equals(new Student(12, "nikhi34l")));


    }

}

class Student implements Comparable<Student> {

    private Integer rollNo;
    private String name;

    public Student(Integer rollNo, String name) {

        this.name = name;
        this.rollNo = rollNo;

    }

    @Override
    public String toString() {
        return "{name:" + name + ",rollNo:" + rollNo + "}";
    }


    @Override
    public boolean equals(Object student) {

        return student != null
                && student.getClass().equals(Student.class)
                && (this == student || Objects.equals(this.rollNo
                , ((Student) student).rollNo));

    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this.rollNo);
    }

    @Override
    public int compareTo(Student student) {
        int val = this.rollNo.compareTo(student.rollNo);
        return val == 0 ? this.name.compareTo(student.name) : val;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRollNo() {
        return rollNo;
    }

    public void setRollNo(Integer rollNo) {
        this.rollNo = rollNo;
    }
}
