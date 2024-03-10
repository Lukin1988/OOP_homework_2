
public class Main {
    public static void main(String[] args) {
        // Створюемо обьект "Circle" за домопогою конструктора
        Circle circle = new Circle("Circle", 7.5);

        // Викликаемо перевизначений метод
        System.out.println(circle.toString());

        // Виклик перевентаженого метода
        double scaledArea = circle.calculateArea(2.5);
        System.out.println("Scaled Area: " + scaledArea);
    }
}