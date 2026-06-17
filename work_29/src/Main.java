import java.util.StringJoiner;

public class Main {
    public static void main(String[] args) {

        // ==========================================
        // ПРАКТИКА #1: 10 методов класса String
        // ==========================================
        System.out.println("=== Практика #1: Методы класса String ===");

        String str = "  Привет, Юзер, изучаем Java!  ";

        // 1. length() — возвращает длину строки
        System.out.println("1. Длина строки: " + str.length());

        // 2. trim() — удаляет пробелы в начале и в конце строки
        String trimmed = str.trim();
        System.out.println("2. Без пробелов по краям: '" + trimmed + "'");

        // 3. toLowerCase() — переводит всю строку в нижний регистр
        System.out.println("3. Нижний регистр: " + trimmed.toLowerCase());

        // 4. toUpperCase() — переводит всю строку в верхний регистр
        System.out.println("4. Верхний регистр: " + trimmed.toUpperCase());

        // 5. charAt(index) — возвращает символ по указанному индексу
        System.out.println("5. Символ на индексе 0: " + trimmed.charAt(0));

        // 6. substring(begin, end) — извлекает подстроку с указанного по указанный индекс
        System.out.println("6. Подстрока (индексы 8-12): " + trimmed.substring(8, 12));

        // 7. contains(sequence) — проверяет, содержит ли строка указанную подстроку
        System.out.println("7. Содержит ли слово 'Java'?: " + trimmed.contains("Java"));

        // 8. replace(old, new) — заменяет одни символы или подстроки на другие
        System.out.println("8. Замена символов: " + trimmed.replace("Юзер", "Друг"));

        // 9. startsWith(prefix) — проверяет, начинается ли строка с определенного префикса
        System.out.println("9. Начинается с 'Прив'?: " + trimmed.startsWith("Прив"));

        // 10. split(regex) — разделяет строку на массив строк по заданному разделителю
        String[] words = trimmed.split(", ");
        System.out.print("10. Разделение по ', ': ");
        for (String word : words) {
            System.out.print("[" + word + "] ");
        }
        System.out.println("\n");


        // ==========================================
        // ПРАКТИКА #2: Примеры использования StringJoiner
        // ==========================================
        System.out.println("=== Практика #2: StringJoiner ===");

        // Пример 1: Объединение строк только через разделитель (запятая)
        StringJoiner sjSimple = new StringJoiner(", ");
        sjSimple.add("Красный").add("Зеленый").add("Синий");
        System.out.println("Простой StringJoiner: " + sjSimple);

        // Пример 2: Объединение с разделителем, префиксом (начало) и суффиксом (конец)
        StringJoiner sjComplex = new StringJoiner("; ", "[", "]");
        sjComplex.add("Раз").add("Два").add("Три");
        System.out.println("Сложный StringJoiner: " + sjComplex);
        System.out.println();


        // ==========================================
        // ПРАКТИКА #3: Текстовые блоки (три двойные кавычки)
        // ==========================================
        System.out.println("=== Практика #3: Текстовые блоки ===");

        // Объявление многострочного текста без использования + и \n
        String jsonBlock = """
                {
                    "name": "Иван",
                    "age": 20,
                    "skills": ["Java", "SQL"]
                }
                """;

        System.out.println("Пример форматированного текста через \"\"\":");
        System.out.println(jsonBlock);
    }
}
