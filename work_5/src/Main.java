public class Main {
    public static void main(String[] args) {

        // ==========================================
        // ПРАКТИКА #1: Демонстрация операторов
        // ==========================================
        System.out.println("--- Практика #1: Операторы ---");

        // 1. ( ) и [ ] — Круглые и квадратные скобки
        int complexCalc = (2 + 3) * 2; // Приоритет операций
        int[] array = {10, 20, 30};
        int element = array[1]; // Доступ по индексу

        // 2. ++ и --, ~, ! — Инкремент, декремент, инверсии
        int x = 5;
        // Постфиксная форма: сначала используется текущее значение, потом изменяется
        System.out.println("Постфиксный ++: " + (x++)); // Выведет 5, x станет 6
        // Префиксная форма: сначала изменяется, потом используется
        System.out.println("Префиксный ++: " + (++x));  // x станет 7, выведет 7

        int y = 5;
        System.out.println("Постфиксный --: " + (y--)); // Выведет 5, y станет 4
        System.out.println("Префиксный --: " + (--y));  // y станет 3, выведет 3

        boolean flag = false;
        System.out.println("Логическое НЕ (!): " + (!flag)); // true

        int bitwiseNum = 2; // В двоичной: 0000...0010
        System.out.println("Побитовое НЕ (~): " + (~bitwiseNum)); // -3 (инверсия всех бит)

        // 3. *, /, % — Умножение, деление, остаток
        int mult = 4 * 2;   // 8
        int div = 10 / 3;   // 3 (целочисленное)
        int mod = 10 % 3;   // 1 (остаток от деления)

        // 4. + и - — Сложение, вычитание, конкатенация String
        int sum = 5 + 5;
        int diff = 10 - 4;
        String str1 = "Hello ";
        String str2 = "World";
        String concat = str1 + str2; // Конкатенация строк

        // 5. >>, >>>, << — Побитовые сдвиги
        int shiftLeft = 2 << 1;  // Сдвиг влево (умножение на 2): 4
        int shiftRight = 4 >> 1; // Сдвиг вправо с сохранением знака: 2
        int unsignedShift = -4 >>> 1; // Беззнаковый сдвиг вправо

        // 6. >, >=, <, <= — Операторы сравнения
        boolean isGreater = 5 > 3;   // true
        boolean isLessOrEqual = 4 <= 4; // true

        // 7. ==, != — Равенство и неравенство
        boolean isEqual = (10 == 10);     // true
        boolean isNotEqual = ("A" != "B"); // true

        // 8. & — Побитовое / Логическое И (вычисляются оба операнда)
        int bitwiseAnd = 6 & 3; // В двоичной: 110 & 011 = 010 (2)

        // 9. ^ — Побитовый / Логическое ИСКЛЮЧАЮЩЕЕ ИЛИ (XOR)
        int bitwiseXor = 6 ^ 3; // В двоичной: 110 ^ 011 = 101 (5)

        // 10. | — Побитовое / Логическое ИЛИ
        int bitwiseOr = 6 | 3; // В двоичной: 110 | 011 = 111 (7)

        // 11. && — Условное (сокращенное) Логическое И
        boolean shortAnd = (5 > 3) && (2 < 4); // true

        // 12. || — Условное (сокращенное) Логическое ИЛИ
        boolean shortOr = (5 < 3) || (2 < 4); // true

        // 13. ?: — Тернарный оператор
        int score = 85;
        String result = (score >= 50) ? "Pass" : "Fail"; // "Pass"

        // 14. =, +=, -=, *=, /=, %= — Операторы присваивания
        int a = 10;
        a += 5; // Аналог: a = a + 5 (15)

        String greet = "Hi";
        greet += "!"; // Конкатенация при присваивании ("Hi!")


        // ==========================================
        // ПРАКТИКА #2: Оператор instanceof
        // ==========================================
        System.out.println("\n--- Практика #2: Оператор instanceof ---");

        String testStr = "Я строка";
        Object testObj = Integer.valueOf(42);
        String nullStr = null;

        // Обычные проверки экземпляров классов
        System.out.println("testStr является String? " + (testStr instanceof String)); // true
        System.out.println("testStr является Object? " + (testStr instanceof Object)); // true (любой класс наследуется от Object)
        System.out.println("testObj является String? " + (testObj instanceof String)); // false

        // Случай с null-объектом
        // Любая проверка 'null instanceof ИмяКласса' всегда возвращает false без генерации NullPointerException
        System.out.println("nullStr является String? " + (nullStr instanceof String)); // false
        System.out.println("nullStr является Object? " + (nullStr instanceof Object)); // false
    }
}