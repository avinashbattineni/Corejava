package constructorpractice.pensinformation;

public class Pensconstructor {
    String penBrand;
    String penColour;
    int penPrice;

    Pensconstructor()
    {
        penBrand="cello";
        penColour="red";
        penPrice=10;
    }
    public void display()
    {
        System.out.println(penBrand+ "\n"+ penColour+ "\n "+ penPrice);

    }
    public static void main(String []args)
    {
        Pensconstructor p= new  Pensconstructor();
        p.display();
    }
}
