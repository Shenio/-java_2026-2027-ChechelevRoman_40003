class OuterClass {
    private String outerPrivateField = "Секретное поле внешнего класса";

    // --- ПРАКТИКА #1: Демонстрация разных модификаторов доступа ---

    public class PublicInner {
        // --- ПРАКТИКА #2: Внутренний класс видит private внешнего ---
        public void printOuter() {
            System.out.println("PublicInner получил доступ к: " + outerPrivateField);
        }
    }

    private class PrivateInner {
        private String innerPrivateField = "Секретное поле внутреннего класса";

        private void secretMethod() {
            System.out.println("Вызван private метод PrivateInner");
        }
    }

    // Метод внешнего класса для работы с private внутренним классом
    public void testPrivateInnerAccess() {
        // --- ПРАКТИКА #3: Внешний класс видит private-поля внутреннего ---
        PrivateInner innerObj = new PrivateInner();

        System.out.println("OuterClass читает private поле внутреннего: " + innerObj.innerPrivateField);
        innerObj.secretMethod(); // Спокойно вызывает private-метод
    }
}

// ==========================================
// ГЛАВНЫЙ КЛАСС ДЛЯ ЗАПУСКА
// ==========================================
public class Main {
    public static void main(String[] args) {
        System.out.println("--- Практика #1 и #2 (Public класс и доступ наружу) ---");
        OuterClass outer = new OuterClass();

        // Создание public внутреннего класса извне
        OuterClass.PublicInner publicInner = outer.new PublicInner();
        publicInner.printOuter();

        System.out.println("\n--- Практика #3 (Доступ внешнего класса к private внутреннему) ---");
        outer.testPrivateInnerAccess();

        // --- ДЕМОНСТРАЦИЯ ОГРАНИЧЕНИЙ ПРАКТИКИ #1 (ЗАКОММЕНТИРОВАНО) ---
        // Если раскомментировать код ниже, компилятор выдаст ошибку, так как класс PrivateInner приватный:
        // 'OuterClass.PrivateInner' has private access in 'OuterClass'
        /*
        OuterClass.PrivateInner illegalInner = outer.new PrivateInner();
        */
    }
}
