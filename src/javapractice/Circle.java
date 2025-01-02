package javapractice;

public class Circle {
    private double radius=10;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double calculateArea()
    {
        return  (Math.PI * radius * radius);
    }
    public double calculatePerimeter()
    {
        return 2 * Math.PI * radius;
    }
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(5.0);

        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Perimeter : " + circle.calculatePerimeter());
}
}