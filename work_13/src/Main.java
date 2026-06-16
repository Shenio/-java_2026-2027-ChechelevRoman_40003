// Класс из условия задачи
class A {
    public static int a = 1;
    public static int b;

    public static void printVars() {
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    // Внутренний метод для демонстрации прямого вызова
    public static void internalCall() {
        System.out.println("--- 2. Прямой вызов внутри класса А ---");
        printVars(); // Имя класса можно опустить
    }
}

public class Main {
    public static void main(String[] args) {
        // Способ 1: Через имя класса (Самый правильный вариант)
        System.out.println("--- 1. Вызов через имя класса (A.printVars()) ---");
        A.printVars();
        System.out.println();

        // Демонстрация Способа 2: Прямой вызов внутри контекста класса
        A.internalCall();
        System.out.println();

        // Способ 3: Через создание объекта (Допустимо синтаксисом, но не рекомендуется)
        System.out.println("--- 3. Вызов через экземпляр класса (obj.printVars()) ---");
        A obj = new A();
        obj.printVars();
    }
}
