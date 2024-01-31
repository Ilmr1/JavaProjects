public class ShapeCalculator {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5.0, "Red");
        shapes[1] = new Rectangle(4.0, 6.0, "Blue");
        shapes[2] = new Triangle(3.0, 8.0, "Green");

        System.out.println("Shape Calculator\n");
        for (Shape shape : shapes) {
            System.out.println("Area of " + shape.getClass().getSimpleName() + " (Color: " + shape.color + "): " + shape.calculateArea());
        }
    }
}
