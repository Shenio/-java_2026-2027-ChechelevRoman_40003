import java.util.ArrayList;
import java.util.List;

class Parent {
    public void printMessage() {
        System.out.println("Сообщение из родительского класса");
    }
}

class Child extends Parent {

    // 1. Пример @Override
    // Гарантирует, что мы точно переопределяем метод родителя.
    // Если бы мы опечатались в названии, компилятор выдал бы ошибку.
    @Override
    public void printMessage() {
        System.out.println("Переопределенное сообщение в подклассе");
    }

    // 2. Пример @Deprecated
    // Метод устарел. Мы советуем использовать вместо него 'newFastMethod()'.
    @Deprecated
    public void oldSlowMethod() {
        System.out.println("Этот метод старый и медленный.");
    }

    public void newFastMethod() {
        System.out.println("Этот метод новый и быстрый!");
    }

    // 3. Пример @SuppressWarnings
    // Подавляем предупреждения об использовании устаревших методов ("deprecation")
    // и о работе с коллекциями без указания дженериков ("unchecked").
    @SuppressWarnings({"deprecation", "unchecked"})
    public void processData() {
        // Вызываем устаревший метод — благодаря аннотации компилятор промолчит
        oldSlowMethod();

        // Используем сырой тип (Raw Type) коллекции без указания <String>
        List rawList = new ArrayList();
        rawList.add("Тест");
    }
}

// ==========================================
// ГЛАВНЫЙ КЛАСС ДЛЯ ЗАПУСКА
// ==========================================
public class Main {
    public static void main(String[] args) {
        Child child = new Child();
        child.printMessage();
        child.processData();
    }
}
