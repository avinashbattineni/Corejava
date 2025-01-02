package constructorpractice.fruitsinformation;

public class Fruitsconstructor
{
    String fruitName;
    int fruitPrice;
    String fruitColour;
    Fruitsconstructor()
    {
        fruitName = "apple";
        fruitPrice = 20;
        fruitColour = "red";
    }
   public void display()
    {
        System.out.println(fruitName+ "\n"+ fruitPrice+ "\n"+ fruitColour);

    }
    public static void main( String [] args)
    {
        Fruitsconstructor f=new  Fruitsconstructor();;
        f.display();

    }
}
