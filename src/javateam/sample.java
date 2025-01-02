package javateam;

import java.io.IOException;
import java.sql.SQLException;

public class sample {
    public void disp(int n1,int n2) throws  SQLException {

        int result=n1/n2;
        throw new SQLException("sql exception");
    }
}
