// ==========================================
// ПРАКТИКА #1: Невозможность переопределения final-метода
// ==========================================
class SuperClass {
    // Обычный метод можно переопределять
    void regularMethod() {
        System.out.println("Обычный метод в суперклассе");
    }

    // final-метод запрещено переопределять в подклассах
    final void finalMethod() {
        System.out.println("Этот метод final. Его нельзя изменить.");
    }
}

class SubClass extends SuperClass {
    @Override
    void regularMethod() {
        System.out.println("Успешно переопределили обычный метод!");
    }

    // ЕСЛИ РАСКОММЕНТИРОВАТЬ КОД НИЖЕ, БУДЕТ ОШИБКА КОМПИЛЯЦИИ:
    // 'finalMethod()' cannot override 'finalMethod()' in 'SuperClass'; overridden method is final
    /*
    @Override
    void finalMethod() {
        System.out.println("Пытаемся переопределить final-метод");
    }
    */
}


// ==========================================
// ПРАКТИКА #2: Невозможность наследования от final-класса
// ==========================================
final class FinalBaseClass {
    void show() {
        System.out.println("Метод внутри final-класса");
    }
}

// ЕСЛИ РАСКОММЕНТИРОВАТЬ КОД НИЖЕ, БУДЕТ ОШИБКА КОМПИЛЯЦИИ:
// Cannot inherit from final 'FinalBaseClass'
/*
class IllegalExtension extends FinalBaseClass {
    // Этот класс не может существовать, так как родитель помечен как final
}
*/


// ==========================================
// ГЛАВНЫЙ КЛАСС ДЛЯ ЗАПУСКА
// ==========================================
public class Main {
    public static void main(String[] args) {
        System.out.println("--- Демонстрация Практики #1 ---");
        SubClass sub = new SubClass();
        sub.regularMethod(); // Вызовет переопределенную версию
        sub.finalMethod();   // Вызовет оригинальный метод из SuperClass (наследовать его можно, переопределять — нет)

        System.out.println("\n--- Демонстрация Практики #2 ---");
        FinalBaseClass finalObj = new FinalBaseClass();
        finalObj.show(); // Создавать объекты final-класса можно без проблем

        System.out.println("\n[INFO] Попытки переопределить final-метод или отнаследовать final-класс закомментированы, так как они вызывают ошибку компиляции.");
    }
}
