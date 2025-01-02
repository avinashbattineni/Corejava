package constructorpractice.pensinformation;

public class instancepens {
    String penBrand;
    String penColour;
    int penPrice;

    {
        penBrand="cello";
        penColour="red";
        penPrice=10;
    }
       public void display()
       {
           System.out.println(penBrand+ "\n"+ penColour+ "\n "+ penPrice);

       }
    public static void main(String[] args)
    {
        instancepens i=new instancepens();
        i.display();
    }

}
