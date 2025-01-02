package Inheritance;

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;  // Area of a rectangle = length * width
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5.0, 3.0);  // Length = 5.0, Width = 3.0
        System.out.println("Area of the rectangle: " + rectangle.getArea());
    }
}