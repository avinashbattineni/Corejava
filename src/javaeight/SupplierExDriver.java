package javaeight;

import java.util.function.Supplier;

public class SupplierExDriver {
    public static void main(String[] args) {
        Supplier<Integer>s=()->
        {
            String str = "asdf";
            return str.length();
        };
        int result=s.get();
        System.out.println(result);
    }
}
