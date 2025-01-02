package javaeight;

public class MessageDriver {
    public static void main(String[] args) throws InterruptedException{
        Message m=MessageImpl::new;
        m.getmessage(" Java");
    }
}
