// Собственный класс исключения, унаследованный от Exception
class InvalidAgeException extends Exception {

    // Конструктор 1: Без параметров
    public InvalidAgeException() {
        super();
    }

    // Конструктор 2: Принимает только текстовое сообщение об ошибке
    public InvalidAgeException(String message) {
        super(message);
    }

    // Конструктор 3: Принимает сообщение и другую причину (исключение-первопричину)
    public InvalidAgeException(String message, Throwable cause) {
        super(message, cause);
    }
}

// Тестовый класс для демонстрации
class User {
    private int age;

    // Метод объявляет, что может выбросить наше кастомное исключение через throws
    public void setAge(int age) throws InvalidAgeException {
        if (age < 0 || age > 150) {
            // Генерируем наше исключение с понятным сообщением
            throw new InvalidAgeException("Недопустимый возраст: " + age + ". Должен быть от 0 до 150.");
        }
        this.age = age;
        System.out.println("Возраст успешно установлен: " + age);
    }
}

// ==========================================
// ГЛАВНЫЙ КЛАСС ДЛЯ ЗАПУСКА
// ==========================================
public class Main {
    public static void main(String[] args) {
        System.out.println("--- Проверка собственного исключения ---");

        User user = new User();

        // Проверяем корректный сценарий
        try {
            user.setAge(25);
        } catch (InvalidAgeException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        // Проверяем некорректный сценарий (вызовет исключение)
        try {
            user.setAge(-10);
        } catch (InvalidAgeException e) {
            System.out.println("\n[ПЕРЕХВАЧЕНО] " + e.getClass().getSimpleName());
            System.out.println("Сообщение об ошибке: " + e.getMessage());
        }
    }
}
