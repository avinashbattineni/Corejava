package javapractice;

public class Rectangle {
    private int length=15;
    private int width=30;
    public int getLength() {
        return length;
    }

    public void setLength(int accountNumber) {
        this.length = accountNumber;
    }

    public int getwidth() {
        return width;
    }

    public void setWidth(int balance) {
        this.width = balance;
    }
    public void diaplay()
    {
        System.out.println("length is: "+length);

        System.out.println("width is: "+width);
    }

    public static void main(String[] args) {
        Rectangle r=new Rectangle();
        r.setLength(12);
        r.setWidth(24);
        r.diaplay();

    }
}
