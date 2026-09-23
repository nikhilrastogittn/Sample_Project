package exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


// Example of try with resource where it works with autocloseable interface

public class TryWithResourceExample {

    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new FileReader("abc.txt"))) {
            String line;
            while ((line = reader.readLine()) != null)
                System.out.println(line);

        } catch (IOException e) {
            System.out.println("Exception in file reading:" + e.getMessage());
        }

    }
}
