package constructorpractice.studentinformation;

public class instanceblock
{
    int  studentId;
    String studentName;
    String studentDept;

    {
        studentId=123;
        studentName="abhi";
        studentDept="CSE";

    }
    public void display()
    {
        System.out.println(studentId+ "\n"+ studentName+ "\n"+ studentDept );

    }
    public static void main(String[]args)
    {
        instanceblock b=new instanceblock();
        b.display();
    }


}
