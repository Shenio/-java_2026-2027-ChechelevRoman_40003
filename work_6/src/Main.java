public class Main {
    public static void main(String[] args) {
        // ==========================================
        // Практика #1: Примеры использования метода decode()
        // ==========================================
        System.out.println("--- Практика #1: Метод decode() ---");

        // Десятичная система
        Integer dec = Integer.decode("123");
        System.out.println("Десятичная: " + dec);

        // Шестнадцатеричная система (префикс 0x)
        Integer hex1 = Integer.decode("0x1A");
        System.out.println("Шестнадцатеричная (0x): " + hex1);

        // Шестнадцатеричная система (префикс #)
        Integer hex2 = Integer.decode("#FF");
        System.out.println("Шестнадцатеричная (#): " + hex2);

        // Восьмеричная система (префикс 0)
        Integer oct = Integer.decode("010");
        System.out.println("Восьмеричная: " + oct);

        // Отрицательное число
        Integer negHex = Integer.decode("-0x10");
        System.out.println("Отрицательная Hex: " + negHex);

        System.out.println(); // Пустая строка для разделения вывода


        // ==========================================
        // Практика #2: Способы создания Boolean
        // ==========================================
        System.out.println("--- Практика #2: Создание Boolean ---");

        // Способ 1: Автоупаковка (Autoboxing) примитивного литерала
        Boolean bool1 = true;
        System.out.println("Способ 1 (Автоупаковка): " + bool1);

        // Способ 2: Использование статических констант класса
        Boolean bool2 = Boolean.TRUE;
        Boolean bool3 = Boolean.FALSE;
        System.out.println("Способ 2 (Константы): " + bool2 + ", " + bool3);

        // Способ 3: Метод Boolean.valueOf(boolean b)
        Boolean bool4 = Boolean.valueOf(false);
        System.out.println("Способ 3 (valueOf от примитива): " + bool4);

        // Способ 4: Метод Boolean.valueOf(String s)
        Boolean bool5 = Boolean.valueOf("true");
        Boolean bool6 = Boolean.valueOf("TrUe"); // Регистр не важен
        Boolean bool7 = Boolean.valueOf("not_true"); // Любая другая строка станет false
        System.out.println("Способ 4 (valueOf от строк): " + bool5 + ", " + bool6 + ", " + bool7);

        // Способ 5: Метод Boolean.parseBoolean(String s) с автоупаковкой
        Boolean bool8 = Boolean.parseBoolean("true");
        System.out.println("Способ 5 (parseBoolean): " + bool8);
    }
}
