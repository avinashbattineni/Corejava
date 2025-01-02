
    package Inheritance;

    public class Car extends Vechile{

        public void drive() {
            System.out.println("repairing a car");
        }

        public static void main(String[] args) {
            Vechile v=new Vechile();
            v.drive();

            Car c= new Car();
            c.drive();
        }
    }



