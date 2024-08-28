package app;

public class Main {
    public static void main(String[] args) {
        // Створення масиву фігур
        Shape[] shapes = new Shape[] {
                new Circle(5),
                new Triangle(4, 6),
                new Square(3)
        };

        // Обчислення і виведення сумарної площі
        double totalArea = calculateTotalArea(shapes);
        System.out.println("Сумарна площа всіх фігур: " + totalArea);
    }

    public static double calculateTotalArea(Shape[] shapes) {
        double totalArea = 0;
        for (Shape shape : shapes) {
            totalArea += shape.calculateArea();
        }
        return totalArea;
    }
}
