// Объединяем практику #1 и практику #2 в одном перечислении
enum Planet {
    // Практика #1: Инициализируем элементы значениями (масса и радиус)
    MERCURY(3.303e+23, 2.4397e6),
    VENUS(4.869e+24, 6.0518e6),
    EARTH(5.976e+24, 6.37814e6);

    // Поля для хранения характеристик каждой константы
    private final double mass;   // в килограммах
    private final double radius; // в метрах

    // Конструктор перечисления (всегда private, ключевое слово можно опустить)
    Planet(double mass, double radius) {
        this.mass = mass;
        this.radius = radius;
    }

    // Геттеры для получения значений
    public double getMass() { return mass; }
    public double getRadius() { return radius; }

    // Гравитационная константа для вычислений
    private static final double G = 6.67300e-11;

    // Практика #2: Дополнительный метод экземпляра для расчета ускорения свободного падения
    public double surfaceGravity() {
        return G * mass / (radius * radius);
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Практика #1 и #2: Продвинутые Enum ---");

        // Перебираем все элементы перечисления
        for (Planet p : Planet.values()) {
            // Выводим имя, массу (инициализация) и результат вызова дополнительного метода
            System.out.printf("Планета: %s, Масса: %.2e кг, Ускорение g: %.2f м/с²\n",
                    p.name(), p.getMass(), p.surfaceGravity());
        }
    }
}
