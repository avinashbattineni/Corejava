package javateam;

import java.io.*;

import static java.lang.System.in;
import static javax.management.Query.in;

public class Drive {
    public static void main(String[] args) throws IOException {
        //setting filepath
        String path = "D://Sailpoint//resumes//input/sample.txt";
        //creating object
        Customer c = new Customer(10, "vj");
        //file output stream
        FileOutputStream fileOut = new FileOutputStream(path);
        //file input stream
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(c);
        out.close();
        fileOut.close();

        //Customer c1=new Customer()
            FileInputStream filein = new FileInputStream(path);
            ObjectInputStream in = new ObjectInputStream(filein);
            try {
                Customer c1 = (Customer) in.readObject();
                System.out.println(c1.cid+ ","+ c.cName);
            }
        catch(IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
