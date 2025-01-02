package InputOutput;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {
    public static void main(String[] args) throws IOException {
        File f = new File("D:\\JAVA\\inout\\resume.txt");
        FileReader reader=new FileReader(f);
        int asciicode;
        String text=new String();
        while((asciicode= reader.read())!=-1)
        {
            System.out.print((char)asciicode);
            text+=String.valueOf((char)asciicode);
        }
        System.out.println(text);
        reader.close();




    }
}
