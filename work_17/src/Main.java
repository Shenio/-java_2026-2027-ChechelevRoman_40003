// Простой дженерик-класс контейнера
class Box<T> {
    private T item;
    public Box(T item) { this.item = item; }
}

public class Main {
    public static void main(String[] args) {
        Object myBox = new Box<String>("Привет");

        // Ошибка компиляции: Обычный дженерик-тип проверять нельзя
        // if (myBox instanceof Box<String>) { } 

        // Правильно: проверяем, является ли объект в принципе экземпляром Box
        if (myBox instanceof Box<?>) {
            System.out.println("Да, myBox является экземпляром класса Box (какого-то типа)");
        }

        // Начиная с Java 16 работает Pattern Matching для instanceof:
        if (myBox instanceof Box<?> checkedBox) {
            System.out.println("Объект успешно приведен к типу Box<?>");
        }
    }
}
