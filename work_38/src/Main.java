import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String fileName = "example.txt";

        // Предварительно создадим тестовый файл, чтобы код можно было запустить сразу
        try (PrintWriter writer = new PrintWriter(fileName)) {
            writer.println("Первая строка текстового файла");
            writer.println("Вторая строка текстового файла");
            writer.println("100 200"); // Пример с числами
        } catch (FileNotFoundException e) {
            System.err.println("Не удалось создать тестовый файл");
        }

        System.out.println("=== Чтение из файла с помощью Scanner ===");

        // --- ПРАКТИКА #1: Чтение данных из текстового файла ---
        File file = new File(fileName);

        // Передаем объект File в конструктор Scanner. Обернуто в try-with-resources для автозакрытия.
        try (Scanner fileScanner = new Scanner(file)) {

            // Цикл выполняется, пока в файле есть нераспространенные строки
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                System.out.println("Прочитано: " + line);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Ошибка: Указанный файл не найден! " + e.getMessage());
        }
    }
}
