package constructorpractice.fruitsinformation;

public class Instancefruits {
    String fruitName;
    int fruitPrice;
    String fruitColour;

    {
        fruitName = "apple";
        fruitPrice = 20;
        fruitColour = "red";
    }
    public void display()
    {
        System.out.println(fruitName+ "\n"+ fruitPrice+ "\n"+ fruitColour);

    }
    public static void main(String[]args)
    {
        Instancefruits i=new Instancefruits();
        i.display();
    }


}
