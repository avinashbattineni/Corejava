package constructorpractice.studentmarks;

public class Instancemarks {
    String studentName;
    int studentMarks;
    char studentGrade;
    {
        studentName="abhi";
        studentMarks=96;
        studentGrade='A';
    }
    public void display()
    {
        System.out.println(studentName+ "\n"+ studentMarks+ "\n"+ studentGrade );

    }
    public static void main(String[] args)
    {
        Instancemarks i= new Instancemarks();
        i.display();


    }

}
