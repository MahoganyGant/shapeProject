package shapeProject;

public abstract class Shape {

    protected double length;
    protected double width;

    public abstract double calculateArea();
    public abstract double calculatePerimeter();

    public void printArea() {

        System.out.println("Area: " + calculateArea());
    }

    public void printPerimeter() {
        System.out.println("Perimeter: " + calculatePerimeter());
    }
}
