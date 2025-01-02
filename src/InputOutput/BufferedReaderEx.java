package InputOutput;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderEx {
    public static void main(String[] args) throws IOException {
        File f = new File("D:\\JAVA\\inout\\resume.txt");
        FileReader fr=new FileReader(f);
        BufferedReader b=new BufferedReader(fr);
        String line=new String();
        String text=new String();
        while((line=b.readLine())!=null)
        {
            System.out.println(line);
            text+=line+"\n";
        }
        System.out.println(text);
        b.close();
    }
}
