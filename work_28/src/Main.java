// ==========================================
// ИНТЕРФЕЙСЫ И КЛАССЫ ДЛЯ ПРАКТИКИ #1
// ==========================================

interface MyInterface {
    // Неабстрактный метод (default метод экземпляра)
    default void defaultMethod() {
        System.out.println("Вызван default-метод из MyInterface");
    }

    // Статический метод интерфейса
    static void staticMethod() {
        System.out.println("Вызван статический метод из MyInterface (через имя интерфейса)");
    }
}

// Класс, реализующий интерфейс из Практики #1
class MyClass implements MyInterface {
    // Наследует defaultMethod() автоматически, но его можно и переопределить при желании
}


// ==========================================
// ИНТЕРФЕЙСЫ И КЛАССЫ ДЛЯ ПРАКТИКИ #2 (Решение конфликта)
// ==========================================

interface InterfaceA {
    default void show() {
        System.out.println("Метод show() из InterfaceA");
    }
}

interface InterfaceB {
    default void show() {
        System.out.println("Метод show() из InterfaceB");
    }
}

// Класс реализует оба интерфейса с конфликтующими default-методами
class CombinedClass implements InterfaceA, InterfaceB {

    // Обязательное переопределение для разрешения конфликта компиляции
    @Override
    public void show() {
        System.out.println("Конфликт разрешен в CombinedClass!");

        // Способ принудительно вызвать реализацию конкретного родительского интерфейса:
        InterfaceA.super.show();
        InterfaceB.super.show();
    }
}


// ==========================================
// ГЛАВНЫЙ КЛАСС ДЛЯ ЗАПУСКА
// ==========================================
public class Main {
    public static void main(String[] args) {
        System.out.println("--- Практика #1: Способы вызова методов ---");

        // 1. Способ вызова статического метода — строго по имени интерфейса
        MyInterface.staticMethod();

        // 2. Способ вызова неабстрактного (default) метода — через объект реализующего класса
        MyClass obj = new MyClass();
        obj.defaultMethod();

        System.out.println("\n--- Практика #2: Множественное наследование ---");

        CombinedClass combinedObj = new CombinedClass();
        combinedObj.show();
    }
}
