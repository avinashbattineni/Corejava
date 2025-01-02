package javateam;

public class StudentGrades
{
    enum Grades
    {
        A,
        B,
        C,
        D;
    }

    public static void main(String[] args) {
        Grades g=Grades.B;
        switch(g) {
            case A:{
                System.out.println("student secured greater than 90 marks");
                break;
            }
            case B:
            {
                System.out.println("student secured greater than 80 and less than 90 marks");
                break;
            }
            case C:
            {
                System.out.println("student secured greater than 70 and lessthan 60 marks");
                break;
            }

        }

    }
}
