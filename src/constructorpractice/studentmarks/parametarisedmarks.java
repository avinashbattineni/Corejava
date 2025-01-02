package constructorpractice.studentmarks;

public class parametarisedmarks
{
    String studentName;
    int studentMarks;
    char studentGrade;
    parametarisedmarks (String sname,int smarks, char sgrade )
    {
        studentName=sname;
        studentMarks=smarks;
        studentGrade=sgrade;
    }
    public void display()
    {
        System.out.println(studentName+ "\n"+ studentMarks+ "\n"+ studentGrade );

    }
    public static void main( String [] args)
    {
        parametarisedmarks p = new parametarisedmarks("abhi",92,'A');

        parametarisedmarks p1 = new parametarisedmarks("anjani",96,'A');
        p.display();
        p1.display();

    }
}
