
package collections;

import java.util.Arrays;

public class ArraysClassExample {

    public static void main(String[] args) {

        Integer[] numbers = {12, 31, 3, 42, 45, 34};

        for (int num : numbers)
            System.out.print(num+" ");

        Arrays.sort(numbers);

        System.out.println("\nNumbers after sorting:");
        for (int num : numbers)
            System.out.print(num+" ");

        Arrays.fill(numbers,12345);

        System.out.println();

        for (int num : numbers)
            System.out.print(num+" ");




    }

}
