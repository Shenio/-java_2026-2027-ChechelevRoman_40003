import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        // ==========================================
        // Ситуация 1: Идентичная обработка нескольких исключений (Multi-Catch)
        // ==========================================
        System.out.println("--- Ситуация 1: Идентичная обработка ---");
        try {
            int chooser = 1;
            if (chooser == 1) {
                throw new ArithmeticException("Ошибка деления");
            } else {
                throw new ArrayIndexOutOfBoundsException("Индекс вне диапазона");
            }
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            // Исключения обрабатываются абсолютно идентично в одном блоке через |
            // Важно: они НЕ должны быть родственниками в иерархии (один не должен наследовать другой)
            System.out.println("[Multi-Catch] Произошла ошибка: " + e.getMessage());
        }


        // ==========================================
        // Ситуация 2: Исключения, образующие иерархию (Ex1 <-- Ex2 <-- Ex3)
        // Иерархия: Exception (Ex1) <-- IOException (Ex2) <-- FileNotFoundException (Ex3)
        // ==========================================
        System.out.println("\n--- Ситуация 2: Иерархия исключений ---");
        try {
            // Провоцируем самое специфичное исключение
            throw new FileNotFoundException("Файл 'data.txt' не найден на диске");
        }
        // 1. Сначала ловим самый глубокий подкласс (Ex3)
        catch (FileNotFoundException ex3) {
            System.out.println("Перехвачен самый специфичный подкласс (Ex3): " + ex3.getMessage());
        }
        // 2. Затем ловим его родителя (Ex2)
        catch (IOException ex2) {
            System.out.println("Перехвачен родительский класс (Ex2): " + ex2.getMessage());
        }
        // 3. В самом конце ловим корень иерархии (Ex1)
        catch (Exception ex1) {
            System.out.println("Перехвачен базовый класс Exception (Ex1): " + ex1.getMessage());
        }

        // ПРИМЕЧАНИЕ: Если поменять блоки catch местами и поставить Exception (Ex1) наверх, 
        // код не скомпилируется (ошибка "exception has already been caught").
    }
}
