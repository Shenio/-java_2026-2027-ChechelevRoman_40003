public class Main {
    public static void main(String[] args) {
        System.out.println("--- Старт программы ---");

        // ДЕМОНСТРАЦИЯ ПРАКТИКИ #1 (ОШИБКА КОМПИЛЯЦИИ)
        /*
        try {
            System.out.println("Код");
        }
        // Ошибка: 'try' без 'catch' или 'finally'
        */


        // ДЕМОНСТРАЦИЯ ПРАКТИКИ #2 (РАБОЧИЙ ВАРИАНТ)
        try {
            System.out.println("1. Выполняется блок try");
            // Провоцируем ошибку, чтобы показать, что finally всё равно сработает
            int x = 10 / 0;
        } finally {
            System.out.println("2. Выполняется блок finally (ресурсы закрыты)");
        }


        // ДЕМОНСТРАЦИЯ ПРАКТИКИ #3 (ОШИБКА КОМПИЛЯЦИИ)
        /*
        try {
            System.out.println("Код");
        } finally {
            System.out.println("Первый finally");
        } finally {
            System.out.println("Второй finally"); // Ошибка: Дублирование блока finally
        }
        */
    }
}
