package InputOutput;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputstreamEx {
    public static void main(String[] args) throws IOException {
        File f = new File("D:\\JAVA\\inout\\resume.txt");
        FileInputStream fis=new FileInputStream(f);
        int asciicode;
        String str=new String();
        while((asciicode=fis.read())!=-1)
        {
            System.out.print((char)asciicode);
            str+=String.valueOf((char)asciicode);
        }
        System.out.println(str);
        fis.close();
        //System.out.println(f.exists());
        //System.out.println(f.delete())
        //System.out.println(f.createNewFile());
    }
}