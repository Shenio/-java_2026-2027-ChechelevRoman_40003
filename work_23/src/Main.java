// ==========================================
// КЛАССЫ ДЛЯ ДЕМОНСТРАЦИИ ВСЕХ ТРЕХ ПРАКТИК
// ==========================================

class Parent {
    // --- ПРАКТИКА #1: Перегрузка методов (Overloading) ---
    // Методы с одинаковым именем, но разным набором параметров (внутри одного класса)
    void printInfo(String message) {
        System.out.println("Сообщение: " + message);
    }

    void printInfo(int number) {
        System.out.println("Число: " + number);
    }


    // --- ПРАКТИКА #2 и #3: Переопределение методов (Overriding) ---
    void display() {
        System.out.println("Оригинальный метод в классе Parent");
    }
}

class Child extends Parent {
    // --- ПРАКТИКА #2: Пример переопределенного метода ---
    @Override
    void display() {
        System.out.println("Переопределенный метод в классе Child");
    }

    // --- ПРАКТИКА #2: Демонстрация ошибки типов возвращаемого значения (ЗАКОММЕНТИРОВАНО) ---
    /*
    @Override
    int display() { // ОШИБКА: 'display()' в 'Child' клонирует 'display()' в 'Parent', но возвращает несовместимый тип
        return 42;
    }
    */

    // --- ПРАКТИКА #3: Зачем нужна аннотация @Override ---
    // Ситуация: программист опечатался в имени и вместо "display" написал "displai".
    // Если аннотация @Override раскомментирована, компилятор СРАЗУ подсветит ошибку:
    // "Method does not override method from its superclass"

    // @Override 
    void displai() {
        System.out.println("Из-за опечатки этот метод стал новым, а не переопределил старый!");
    }
}

// ==========================================
// ГЛАВНЫЙ КЛАСС ДЛЯ ЗАПУСКА
// ==========================================
public class Main {
    public static void main(String[] args) {
        Parent p = new Parent();
        Child c = new Child();

        System.out.println("--- Практика #1: Перегрузка (Overloading) ---");
        p.printInfo("Привет, Java!"); // Вызов первой версии
        p.printInfo(2026);            // Вызов второй версии

        System.out.println("\n--- Практика #2: Переопределение (Overriding) ---");
        p.display(); // Вызов из родителя
        c.display(); // Вызов из потомка (полиморфизм в действии)

        System.out.println("\n--- Практика #3: Аннотация @Override ---");
        System.out.println("Аннотация @Override защищает от случайных ошибок в сигнатуре метода.");
        System.out.println("Если сигнатура (имя или параметры) не совпадет с родителем, код просто не скомпилируется.");
    }
}
