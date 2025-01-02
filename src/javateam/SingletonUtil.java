package javateam;

public class SingletonUtil {
        private static Customer1 cust=null;
        private SingletonUtil()
        {

        }
        //factory method
        public static Customer1 getInstance()
        {
            if(cust==null)
            {
                cust=new Customer1();
            }
            return cust;
        }
    }


