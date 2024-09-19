package shapeProject;

public class shapeProject {
//don't crowd the main class with subclasses use a new tab

    public static void main(String[] args) { //start of main method

//below im actually creating an instance of a circle, creating an object
        Shape circle = new Circle(15);
        //calling the methods of this shape and printing the results from them
        circle.printArea();
        circle.printPerimeter();
    }
}
