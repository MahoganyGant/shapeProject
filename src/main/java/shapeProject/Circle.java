package shapeProject;

public class Circle extends Shape {

    //only necessary attribute of a circle
    private double radius;

    //constructor allowing me to take pass in a radius measurement in main
    public Circle(double radius) {
        this.radius = radius; //assigning the value passed in to the variable radius (initializing)
    }

    @Override
    public double calculateArea() { //implementing first required method
        System.out.println("Area of this circle ");
        //formula for area of a circle
        return Math.PI * radius * radius; //radius times radius squares it
    }

    @Override
    public double calculatePerimeter() { //implementing second required method
        System.out.println("Perimeter of this circle ");
        //formula for perimeter of a circle
        return 2 * Math.PI * radius;
    }
}

