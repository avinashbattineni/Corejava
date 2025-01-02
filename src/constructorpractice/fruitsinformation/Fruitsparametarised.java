package constructorpractice.fruitsinformation;

public class Fruitsparametarised {
    String fruitName;
    int fruitPrice;
    String fruitColour;
    Fruitsparametarised( String fname, int fprice, String fcolour)
    {
        fruitName = fname;
        fruitPrice =fprice;
        fruitColour = fcolour;
    }
    public void display()
    {
        System.out.println(fruitName+ "\n"+ fruitPrice+ "\n"+ fruitColour);

    }
    public static void main(String [] args)
    {
        Fruitsparametarised f= new Fruitsparametarised("apple",10,"red");

        Fruitsparametarised f1= new Fruitsparametarised("mango",20,"yellow");
        f.display();
        f1.display();

    }
}
