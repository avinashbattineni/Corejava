package javateam;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriteEx {
    public static void main(String[] args)  throws IOException
    {
        String path="D://Sailpoint//resumes//input/sample.txt";
        //String msg="hello welcome to java";
        Customer c=new Customer(10,"vj");

        FileWriter f=new FileWriter(path);
        f.close();
        System.out.println("data pushed");


    }
}
