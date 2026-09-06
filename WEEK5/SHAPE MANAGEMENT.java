public class ShapeManagementApp {

    static abstract class Shape {
        private String color;

        Shape(String color) {
            this.color = color;
        }

        String getColor() {
            return color;
        }

        abstract double area();
        abstract double perimeter();

        public String toString() {
            return getClass().getSimpleName() + " (" + color + ")  area = "
                    + String.format("%.2f", area()) + ", perimeter = "
                    + String.format("%.2f", perimeter());
        }
    }

    static class Circle extends Shape {
        double radius;

        Circle(String color, double radius) {
            super(color);
            if (radius <= 0) {
                throw new IllegalArgumentException("radius has to be positive");
            }
            this.radius = radius;
        }

        double area() {
            return Math.PI * radius * radius;
        }

        double perimeter() {
            return 2 * Math.PI * radius;
        }
    }

    static class Rectangle extends Shape {
        double length, breadth;

        Rectangle(String color, double length, double breadth) {
            super(color);
            if (length <= 0 || breadth <= 0) {
                throw new IllegalArgumentException("length/breadth has to be positive");
            }
            this.length = length;
            this.breadth = breadth;
        }

        double area() {
            return length * breadth;
        }

        double perimeter() {
            return 2 * (length + breadth);
        }
    }

    static class Triangle extends Shape {
        double a, b, c;

        Triangle(String color, double a, double b, double c) {
            super(color);
            if (a <= 0 || b <= 0 || c <= 0) {
                throw new IllegalArgumentException("sides has to be positive");
            }
            if (a + b <= c || b + c <= a || a + c <= b) {
                throw new IllegalArgumentException("these sides cant form a triangle");
            }
            this.a = a;
            this.b = b;
            this.c = c;
        }

        double perimeter() {
            return a + b + c;
        }

        double area() {
            double s = perimeter() / 2;
            return Math.sqrt(s * (s - a) * (s - b) * (s - c));
        }
    }

    static class Square extends Shape {
        double side;

        Square(String color, double side) {
            super(color);
            if (side <= 0) {
                throw new IllegalArgumentException("side has to be positive");
            }
            this.side = side;
        }

        double area() {
            return side * side;
        }

        double perimeter() {
            return 4 * side;
        }
    }

    public static void main(String[] args) {

        Shape[] shapes = new Shape[6];
        shapes[0] = new Circle("Red", 4);
        shapes[1] = new Rectangle("Blue", 5, 3);
        shapes[2] = new Triangle("Green", 3, 4, 5);
        shapes[3] = new Square("Yellow", 6);
        shapes[4] = new Circle("Black", 2.5);
        shapes[5] = new Rectangle("White", 7, 2);

        System.out.println("---- All Shapes ----");

        double totalArea = 0;
        double totalPerimeter = 0;

        for (int i = 0; i < shapes.length; i++) {
            System.out.println(shapes[i]);
            totalArea = totalArea + shapes[i].area();
            totalPerimeter = totalPerimeter + shapes[i].perimeter();
        }

        System.out.println();
        System.out.println("Total area of all shapes = " + String.format("%.2f", totalArea));
        System.out.println("Total perimeter of all shapes = " + String.format("%.2f", totalPerimeter));
        System.out.println("Average area = " + String.format("%.2f", (totalArea / shapes.length)));

        Shape biggest = shapes[0];
        Shape smallest = shapes[0];

        for (int i = 1; i < shapes.length; i++) {
            if (shapes[i].area() > biggest.area()) {
                biggest = shapes[i];
            }
            if (shapes[i].area() < smallest.area()) {
                smallest = shapes[i];
            }
        }

        System.out.println();
        System.out.println("Shape with biggest area  -> " + biggest);
        System.out.println("Shape with smallest area -> " + smallest);

        System.out.println();
        System.out.println("---- Extra Info ----");
        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] instanceof Circle) {
                Circle c = (Circle) shapes[i];
                System.out.println("Circle radius = " + c.radius);
            } else if (shapes[i] instanceof Square) {
                Square sq = (Square) shapes[i];
                System.out.println("Square side = " + sq.side);
            }
        }

        System.out.println();
        try {
            Shape wrong = new Rectangle("Pink", -5, 10);
        } catch (IllegalArgumentException e) {
            System.out.println("Got the error as expected: " + e.getMessage());
        }
    }
}

