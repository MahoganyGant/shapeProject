package shapeProject;

    public class Square extends Shape {
        public double side;


        public Square(double side) {
            this.side = side; //assigning the value passed in to the variable radius (initializing)
        }


        @Override
        public double calculateArea() {
            System.out.println("This is the area of the Square");
            return side * side;
        }

        @Override
        public double calculatePerimeter() {
            System.out.println("This is the perimeter of the Square");
            return 4 * side;
        }
    }
