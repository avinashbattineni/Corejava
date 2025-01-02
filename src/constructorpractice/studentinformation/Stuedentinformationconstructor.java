package constructorpractice.studentinformation;

public class Stuedentinformationconstructor {
    int  studentId;
    String studentName;
    String studentDept;

    Stuedentinformationconstructor()
    {
        studentId = 123;
        studentName = "abhi";
        studentDept = "CSE";
    }
     public void display()
    {
        System.out.println(studentId+ "\n"+ studentName+ "\n"+ studentDept );

    }
    public static void main(String[]args)
    {
        Stuedentinformationconstructor s=new Stuedentinformationconstructor();
        s.display();
    }


}


