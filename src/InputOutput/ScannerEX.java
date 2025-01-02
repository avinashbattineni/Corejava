package InputOutput;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ScannerEX {
    public static void main(String[] args) throws IOException {
        File f = new File("D:\\JAVA\\inout\\resume.txt");
        Scanner scr=new Scanner(f);
        String text=new String();
        while(scr.hasNext())
        {
            //By usimg this we can print directly
           System.out.println(scr.nextLine());
            //we can assign it to a string and print it.
            text+=scr.nextLine()+"\n";
        }
        System.out.println(text);
        scr.close();

    }
}
