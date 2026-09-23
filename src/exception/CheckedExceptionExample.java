package exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

// In this example we see file not found exception which is part of Checked exception


public class CheckedExceptionExample {
    public static void main(String[] args) throws FileNotFoundException {
        try{
            method1();
        }catch (Exception e){
            for(StackTraceElement stackTraceElement:e.getStackTrace()){
                System.out.println(stackTraceElement);
            }
        }
        System.out.println("hello");
    }

    public static void method1() throws FileNotFoundException {
        method2();
    }
    public static void method2() throws FileNotFoundException {
        try{
            FileReader fileReader=new FileReader("abc.txt");
        } catch (FileNotFoundException e){
            System.out.println("File not found");
            throw new FileNotFoundException("file exception");
        }
    }
}
