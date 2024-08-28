package app;

public class Square implements Shape {
    private double side;

    public Square(double side) {
        if (side <= 0) {
            throw new IllegalArgumentException("Сторона має бути позитивним числом.");
        }
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }
}
