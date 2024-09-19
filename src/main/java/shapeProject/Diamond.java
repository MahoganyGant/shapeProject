package shapeProject;

//public class Diamond extends Shape{
   // package shapeProject;

 public class Diamond extends Shape {
        public double side;
        public Diamond (double side) {
            this.side = side; //assigning the value passed in to the variable radius (initializing)
        }
        @Override
        public double calculateArea() {
            System.out.println("This is the area of the Diamond");
            return side * side;
        }
        @Override
        public double calculatePerimeter() {
            System.out.println("This is the perimeter of the Diamond");
            return 4 * side;
        }
    }
   //1.
    //public void printArea(){
     //   System.out.println((diagonal1*diagonal2)/2);

    //    public void printPerimeter(){
       //    double perimeter = (length*4);
       //     System.out.println(perimeter);
      //  }
   // }
//}
