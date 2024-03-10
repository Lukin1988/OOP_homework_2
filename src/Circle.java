// Розширюемо абстрактний клас
public final class Circle extends AbstractShape {

    // Додаткова змінна
    private final double radius;

    // Констр. з викоритсанням слова super
    public Circle(String shapeType, double radius) {
        super(shapeType);
        this.radius = radius;
    }

    // Перевизначений метод  для обчислення площи кола
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Ще один метод з іншою сигнтатурою
    public double calculateArea(double scaleFactor) {
        return Math.PI * radius * radius * scaleFactor;
    }
}
