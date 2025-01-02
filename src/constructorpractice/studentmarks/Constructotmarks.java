package constructorpractice.studentmarks;

public class Constructotmarks
{
    String studentName;
    int studentMarks;
    char studentGrade;
    Constructotmarks()
    {
        studentName="abhi";
        studentMarks=96;
        studentGrade='A';
    }
    public void display()
    {
        System.out.println(studentName+ "\n"+ studentMarks+ "\n"+ studentGrade );

    }
    public static void main (String[] args)
   {
       Constructotmarks c= new Constructotmarks();
       c.display();
   }

}
