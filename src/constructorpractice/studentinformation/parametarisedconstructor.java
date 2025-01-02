package constructorpractice.studentinformation;

public class parametarisedconstructor {
    int  studentId;
    String studentName;
    String studentDept;

    parametarisedconstructor(int  stdId,String stdName,String stdDept)
    {
        studentId = stdId;
        studentName = stdName;
        studentDept = stdDept;
    }
    public void display()
    {
        System.out.println(studentId+ "\n"+ studentName+ "\n"+ studentDept );

    }

    public static void main (String[]args)
    {
        parametarisedconstructor p=new parametarisedconstructor(123,"abhi","CSE");
        parametarisedconstructor p1=new parametarisedconstructor(1234,"anjani","CSE");
        parametarisedconstructor p2= new parametarisedconstructor(12345,"Hema", "CSE");

        p.display();
        p1.display();
        p2.display();

    }
}
