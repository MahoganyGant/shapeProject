package shapeProject;

public abstract class Shape {
//attributes of the shape

    protected double length;
    protected double width;

/* Notes: abstract methods don't have a body they are meant to be overridden by subclasses for use
Abstract methods "define a contract that subclasses must follow" each subclass must provide a implementation
for these methods. This is beneficial because the formula to calculate the area and perimeter for each shape varies

using abstract makes it a declaration of a method, abstract just defines what methods must be provided */

    //method 1 blank-to be used according to the area formula for each shape
    public abstract double calculateArea();

    //method 2
    public abstract double calculatePerimeter();

//these method just print the results with a label
    public void printArea() {

        System.out.println("Area: " + calculateArea());
    }

    public void printPerimeter() {
        System.out.println("Perimeter: " + calculatePerimeter());
    }
}
