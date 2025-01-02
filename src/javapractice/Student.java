package javapractice;

public class Student {
        private int student_id;
        private String student_name;
        private double grade;
        public Student() {
            this.grade = 0.0;
        }


        public int getStudentId() {
            return student_id;
        }
        public void setStudentId(int student_id) {
            this.student_id = student_id;
        }

        public String getStudentName() {
            return student_name;
        }
        public void setStudentName(String student_name) {
            this.student_name = student_name;
        }

        public double getGrade() {
            return grade;
        }

        public void addGrade(double grade) {
            if (grade >= 0 && grade <= 100) {
                this.grade = grade;  // Set the grade if valid
                System.out.println("Grade " + grade + " added successfully.");
            } else {
                System.out.println("Invalid grade. Grade must be between 0 and 100.");
            }
        }

        public void displayStudentInfo() {
            System.out.println("Student ID: " + student_id);
            System.out.println("Student Name: " + student_name);
            System.out.println("Grade: " + grade);
        }

        public static void main(String[] args) {
            Student student = new Student();

            student.setStudentId(101);
            student.setStudentName("Alice Johnson");
            student.addGrade(92.5);  // Valid grade

            student.displayStudentInfo();
        }
    }


