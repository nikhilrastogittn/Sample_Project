package collections;

import java.util.*;

public class CollectionClassExample {

    public static void main(String[] args){

        List<Integer> list=new ArrayList<>(List.of(12,34,5,345,67,33,5,5));

        System.out.println("min element:"+Collections.min(list));
        System.out.println("max element:"+Collections.max(list));

        System.out.println(Collections.frequency(list,5));
        Collections.rotate(list,3);
        System.out.println(list);

        List<Student> studentList=new ArrayList<>();

        studentList.add(new Student(12,"nikhil"));
        studentList.add(new Student(11,"aman"));
        studentList.add(new Student(1,"rohit"));

        Collections.sort(studentList);

        System.out.println(studentList);

        Collections.sort(studentList, Comparator.comparing(Student::getName));

        System.out.println(studentList);


    }

}
