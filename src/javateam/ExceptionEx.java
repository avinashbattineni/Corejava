package javateam;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class ExceptionEx {
    public static void main(String[] args) {
        sample s=new sample();
        try {
            s.disp(10,2);
        }
         catch (SQLException e) {
             System.out.println("exception handled");
        }
        finally {
            System.exit(0);
            System.out.println("this is finally block");
        }

    }
}


