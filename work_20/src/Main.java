class Parent {
    String name = "Родитель";

    Parent() {
        System.out.println("1. Вызван конструктор Parent");
    }

    void printMessage() {
        System.out.println("Метод из класса Parent");
    }
}

class Child extends Parent {
    String name = "Потомок";

    Child() {
        super(); // Явный вызов конструктора родителя (обязательно первая строка)
        System.out.println("2. Вызван конструктор Child");
    }

    @Override
    void printMessage() {
        System.out.println("Метод из класса Child (переопределенный)");
    }

    void display() {
        // Демонстрация работы с полями
        System.out.println("this.name: " + this.name);   // Выведет "Потомок"
        System.out.println("super.name: " + super.name); // Выведет "Родитель"

        // Демонстрация работы с методами
        this.printMessage();  // Вызовет метод Child
        super.printMessage(); // Вызовет метод Parent
    }
}

public class Main {
    public static void main(String[] args) {
        Child child = new Child();
        System.out.println("--- Результаты вызовов ---");
        child.display();
    }
}
