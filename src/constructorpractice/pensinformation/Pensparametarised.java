package constructorpractice.pensinformation;

public class Pensparametarised {
    String penBrand;
    String penColour;
    int penPrice;
    Pensparametarised( String pbrand, String pcolour, int pprice)
    {
        penBrand=pbrand;
        penColour=pcolour;
        penPrice=pprice;
    }
    public void display()
    {
        System.out.println(penBrand+ "\n"+ penColour+ "\n "+ penPrice);

    }
    public static void main( String[] args)
    {
        Pensparametarised p= new Pensparametarised("cello","blue",10);
        Pensparametarised p1= new Pensparametarised("trio","red",20);

        p.display();
        p1.display();
    }
}
