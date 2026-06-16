class OverloadVarargs {

    // 1. Метод с переменным числом параметров типа String
    public void display(String... words) {
        System.out.print("Вызван display(String...): ");
        for (String word : words) {
            System.out.print(word + " ");
        }
        System.out.println();
    }

    // 2. ПЕРЕГРУЗКА: Тот же метод, но с переменным числом параметров типа int
    public void display(int... numbers) {
        System.out.print("Вызван display(int...): ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // 3. ПЕРЕГРУЗКА: Метод с одним фиксированным параметром и varargs
    public void display(String prefix, int... numbers) {
        System.out.print("Вызван display(String, int...): " + prefix + " -> ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        OverloadVarargs demo = new OverloadVarargs();

        System.out.println("--- Демонстрация перегрузки Varargs ---");

        // Вызовется метод №1 (String...)
        demo.display("Java", "is", "awesome");

        // Вызовется метод №2 (int...)
        demo.display(1, 2, 3, 4, 5);

        // Вызовется метод №3 (String, int...)
        demo.display("Результаты", 10, 20, 30);

        demo.display(new int[0]);       // Вызовет метод для int...
        demo.display(new String[0]);    // Вызовет метод для String...

    }
}
