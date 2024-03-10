//Абстрактний клас
public abstract class AbstractShape {

    // Фіналізована змінна
    protected final String shapeType;

    // Конструктор
    public AbstractShape(String shapeType) {
        this.shapeType = shapeType;
    }

    // Абстрактний метод
    public abstract double calculateArea();

    // Перевизначений метод
    @Override
    public String toString() {
        return "Shape Type: " + shapeType;
    }
}
