package collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExample {

    public static void main(String[] args) {

        Map<String, Integer> numbers = new HashMap<>();

        numbers.put("one", 1);
        numbers.put("two", 2);
        numbers.put("three", 3);

        System.out.println(numbers);

        // override previous
        numbers.put("three", 34);


        // only work if not present
        numbers.putIfAbsent("four", 4);
        numbers.putIfAbsent("four", 33);

        System.out.println(numbers);


        for (Map.Entry<String, Integer> entry : numbers.entrySet())
            System.out.println("key:" + entry.getKey() + ",value:" + entry.getValue());

        for (String key : numbers.keySet())
            System.out.println("key:" + key);

        for (Integer value : numbers.values()) {
            System.out.println("value:" + value);


            // sorted based on keys
            Map<String,Integer> treeMap=new TreeMap<>();

            treeMap.put("one", 1);
            treeMap.put("two", 2);
            treeMap.put("three", 3);
            treeMap.put("abc",34);



            System.out.println(treeMap);



            // preserve insertion order
            Map<String,Integer> linkedMap=new LinkedHashMap<>();

            linkedMap.put("one", 1);
            linkedMap.put("two", 2);
            linkedMap.put("three", 3);
            linkedMap.put("abc",34);

            System.out.println(linkedMap);



        }


    }

}
