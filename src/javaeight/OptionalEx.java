package javaeight;

import java.util.Optional;

public class OptionalEx {
    public static void main(String[] args) {
        String str="abc";
        Optional<String>op=Optional.ofNullable(str);
        if(op.isPresent())
        {
            System.out.println(op.get().toUpperCase());
        }
        else
        {
            System.out.println("pass a string");
        }
    }
}
