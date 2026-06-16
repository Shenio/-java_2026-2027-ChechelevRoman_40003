// Демонстрационный класс A
class A {
    // blank final переменная
    public final int a;

    // Вариант с конструктором: позволяет передавать значение при создании
    public A(int value) {
        this.a = value;
    }
}

// Демонстрационный класс B (для показа блока инициализации)
class B {
    public final int a;

    // Вариант с блоком инициализации экземпляра
    {
        a = 100;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Способ 1: Инициализация через конструктор ---");
        A obj1 = new A(5);
        A obj2 = new A(25);
        System.out.println("Значение 'a' в obj1: " + obj1.a); // Выведет 5
        System.out.println("Значение 'a' в obj2: " + obj2.a); // Выведет 25

        System.out.println("\n--- Способ 2: Через блок инициализации ---");
        B objB = new B();
        System.out.println("Значение 'a' в objB: " + objB.a); // Выведет 100
    }
}
