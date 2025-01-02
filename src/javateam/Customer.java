package javateam;
import java.io.Serializable;

//implementing serializable for customer class
public class Customer implements Serializable {
    int cid;
    String cName;
    public Customer(int cid,String cName)
    {
        this.cid=cid;
        this.cName=cName;
    }


}
