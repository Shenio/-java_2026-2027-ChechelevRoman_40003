public class Main {
    // Перечисление для демонстрации
    enum Day { MONDAY, FRIDAY }

    public static void main(String[] args) {
        // 1. Примитивы и их оболочки (на примере int / Integer)
        Integer number = 2;
        switch (number) {
            case 1 -> System.out.println("Один");
            case 2 -> System.out.println("Два");
        }

        // 2. Символьный тип (char / Character)
        char letter = 'B';
        switch (letter) {
            case 'A' -> System.out.println("Буква А");
            case 'B' -> System.out.println("Буква В");
        }

        // 3. Строки (String)
        String command = "START";
        switch (command) {
            case "START" -> System.out.println("Запуск программы");
            case "STOP" -> System.out.println("Остановка программы");
        }

        // 4. Перечисления (Enum)
        Day day = Day.FRIDAY;
        switch (day) {
            case MONDAY -> System.out.println("Начало недели");
            case FRIDAY -> System.out.println("Конец недели");
        }
    }
}
