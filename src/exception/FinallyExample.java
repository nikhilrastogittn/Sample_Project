package exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// example and understanding of finally block in exception handling

public class FinallyExample {

     void test(){
        System.out.println("test");
    }


    public static void main(String[] args){

        BufferedReader reader=null;
        try{
            reader=new BufferedReader(new FileReader("abc.txt"));
        } catch (IOException e){
            System.out.println("IOException caught: "+e.getMessage());
        } finally {
            try{
                if(reader!=null){
                    reader.close();
                }
            } catch (IOException e){
                System.out.println("Error while closing reader:"+e.getMessage());
            }
        }


    }
}
