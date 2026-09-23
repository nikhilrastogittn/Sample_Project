package collections;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// List collection example
public class ListExample {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        // adding elements in list
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(50);
        list.add(80);

        System.out.println(list);

        list.remove(3);

        System.out.println(list);

        list.add(3, 49);

        System.out.println(list);

        list.clear();

        System.out.println(list);

        // adding new elements
        list.addAll(List.of(1, 2, 3, 4, 5));

        System.out.println(list);

        list.remove((Integer) 5);

        System.out.println(list);

        list.add(4, 20);

        System.out.println(list);

        System.out.println(list.contains(40));

        for (Integer element : list) {
            System.out.println("element :" + element);
        }

        Iterator<Integer> iterator=list.iterator();

        while (iterator.hasNext()){
            System.out.println("iterator element:"+iterator.next());

        }


    }

}
