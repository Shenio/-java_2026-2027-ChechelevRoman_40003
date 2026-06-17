// Объявляем интерфейс со вложенным статическим классом
interface MyInterface {

    // Абстрактный метод самого интерфейса (для примера)
    void interfaceMethod();

    // Класс, вложенный в интерфейс. Он автоматически является public static.
    class NestedClassInInterface {

        public void func() {
            System.out.println("Метод func() успешно вызван из класса, вложенного в интерфейс!");
        }
    }
}

// ==========================================
// ГЛАВНЫЙ КЛАСС ДЛЯ ЗАПУСКА
// ==========================================
public class Main {
    public static void main(String[] args) {
        System.out.println("--- Демонстрация работы со вложенным в интерфейс классом ---");

        // Способ создания объекта и вызова метода: 
        // Обращаемся напрямую через имя интерфейса, объект самого интерфейса не нужен
        MyInterface.NestedClassInInterface nestedObject = new MyInterface.NestedClassInInterface();

        // Вызываем метод вложенного класса
        nestedObject.func();
    }
}
