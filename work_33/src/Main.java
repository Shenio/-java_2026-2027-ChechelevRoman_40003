public class Main {
    public static void main(String[] args) {
        System.out.println("=== Начало работы программы ===");

        // 1. Генерируем первое исключение, которое будет успешно ПЕРЕХВАЧЕНО
        try {
            System.out.println("Попытка деления на ноль...");
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("[ПЕРЕХВАЧЕНО] Обработано исключение: " + e.getMessage());
        } finally {
            System.out.println("Блок finally выполнился успешно.");
        }

        System.out.println("\nПрограмма продолжает работу после блока try-catch...\n");

        // 2. Генерируем второе исключение, которое приведет к АВАРИЙНОЙ ОСТАНОВКЕ
        System.out.println("Генерация исключения без обработки (выход за границы массива)...");
        int[] numbers = {1, 2, 3};
        int crash = numbers[10]; // Индекса 10 не существует, выбросит ArrayIndexOutOfBoundsException

        // Строка ниже никогда не выполнится из-за падения программы
        System.out.println("Этот текст никогда не напечатается.");
    }
}
