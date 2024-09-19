package shapeProject;

public class Rectangle extends Shape {

    @Override
    public double calculateArea() {
        System.out.println("Area of Rectangle:");
        return length * width;
    }

    @Override
    public double calculatePerimeter() {
        System.out.println("Perimeter of Rectangle:");
        return (length + width) * 2;
    }
}
