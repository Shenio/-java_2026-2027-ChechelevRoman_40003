import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

// Класс для демонстрации Практики #4 (свой ресурс с поддержкой AutoCloseable)
class MyResource implements AutoCloseable {
    public void doWork() {
        System.out.println("Выполняется работа с кастомным ресурсом...");
    }

    @Override
    public void close() {
        System.out.println("Интерфейс AutoCloseable сработал: Кастомный ресурс автоматически закрыт!");
    }
}

public class Main {
    public static void main(String[] args) {

        // ==========================================
        // ПРАКТИКА #1: Демонстрация метода read() подкласса InputStream
        // ==========================================
        System.out.println("=== Практика #1: Чтение из InputStream ===");
        byte[] inputData = {74, 97, 118, 97}; // Байт-коды для символов 'J', 'a', 'v', 'a'

        try (ByteArrayInputStream inputStream = new ByteArrayInputStream(inputData)) {
            int byteData;
            // метод read() читает по 1 байту. Когда данные кончаются, он возвращает -1
            while ((byteData = inputStream.read()) != -1) {
                System.out.println("Прочитан байт: " + byteData + " (Символ: " + (char) byteData + ")");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println();


        // ==========================================
        // ПРАКТИКА #2: Демонстрация метода write(int) подкласса OutputStream
        // ==========================================
        System.out.println("=== Практика #2: Запись в OutputStream ===");

        try (ByteArrayOutputStream outputStream = new ByteArrayOutputStream()) {
            // Записываем по одному байту методом write(int)
            outputStream.write(72); // 'H'
            outputStream.write(105); // 'i'

            // Выводим накопленный результат работы потока
            System.out.println("Содержимое OutputStream: " + outputStream.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println();


        // ==========================================
        // ПРАКТИКА #4: Пример работы интерфейса AutoCloseable
        // ==========================================
        System.out.println("=== Практика #4: Демонстрация AutoCloseable ===");

        // Объект объявляется внутри круглых скобок try — конструкция try-with-resources
        try (MyResource resource = new MyResource()) {
            resource.doWork();
            // Метод close() вызовется автоматически прямо ТУТ, при выходе из блока скобок
        }

        System.out.println("Программа завершила работу корректно.");
    }
}
