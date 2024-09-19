package shapeProject;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        System.out.println("There area of this circle is ");
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        System.out.println("The perimeter of this circle is ");
        return 2 * Math.PI * radius;
    }
}

