package InputOutput;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx {
    public static void main(String[] args) throws IOException {
        File f = new File("D:\\JAVA\\inout\\sample.txt");
        f.createNewFile();
        String s="hello world";
        FileOutputStream fos=new FileOutputStream(f);
        fos.write(72);
        fos.write(69);
        fos.write(76);
        fos.write(76);
        fos.write(79);
        for(char ch:s.toCharArray())
        {
            fos.write((int)ch);
        }
        fos.close();


    }
}
