package InputOutput;

import java.io.*;

public class BufferedWriterEx {
    public static void main(String[] args) throws IOException {
        File f = new File(".\\abc.txt");
        f.createNewFile();
        String s="good morning";
        BufferedWriter b=new BufferedWriter(new FileWriter(f));
         b.write(s);
         b.close();

    }
}
