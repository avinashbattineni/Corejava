package InputOutput;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {
    public static void main(String[] args) throws IOException {
        File f = new File(".\\sample.txt");
        f.createNewFile();
        FileWriter fw=new FileWriter(f);
        String s="hi all";
        String s1="how are you";
        fw.write(s);
        fw.write(s1.toCharArray());
        fw.close();


    }
}
