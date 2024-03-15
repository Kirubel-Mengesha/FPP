package Assignment4;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[5];
        shapes[0] = new Rectangle(4.0, 5.0, "Blue");
        shapes[1] = new Circle(3.0, "Red");
        shapes[2] = new Square(2.0, "Green");
        shapes[3] = new Rectangle(2.0, 3.0, "Yellow");
        shapes[4] = new Circle(5.0, "Purple");

        printTotal(shapes);
    }

    public static void printTotal(Shape[] shapes) {
        double totalArea = 0.0;
        double totalPerimeter = 0.0;

        for (Shape shape : shapes) {
            totalArea += shape.calculateArea();
            totalPerimeter += shape.calculatePerimeter();
        }

        System.out.println("Total Area of all shapes: " + totalArea);
        System.out.println("Total Perimeter of all shapes: " + totalPerimeter);
    }
}
