package app;

public class Triangle implements Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        if (base <= 0 || height <= 0) {
            throw new IllegalArgumentException("Основа і висота мають бути позитивними числами.");
        }
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}
