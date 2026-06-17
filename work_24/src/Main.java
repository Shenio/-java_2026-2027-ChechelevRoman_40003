import java.util.Objects;

// Придумаем класс "Книга" (Book)
class Book {
    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    // Переопределение метода equals() согласно всем соглашениям
    @Override
    public boolean equals(Object obj) {
        // 1. Проверка на идентичность ссылок (рефлексивность)
        if (this == obj) {
            return true;
        }

        // 5. Проверка на null и совпадение классов объектов
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        // Приведение типов для сравнения полей
        Book otherBook = (Book) obj;

        // Покомпонентное сравнение значимых полей класса
        return year == otherBook.year &&
                Objects.equals(title, otherBook.title) &&
                Objects.equals(author, otherBook.author);
    }

    // Обязательное переопределение hashCode при переопределении equals
    @Override
    public int hashCode() {
        return Objects.hash(title, author, year);
    }
}

// ==========================================
// ГЛАВНЫЙ КЛАСС ДЛЯ ЗАПУСКА
// ==========================================
public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Капитанская дочка", "А.С. Пушкин", 1836);
        Book book2 = new Book("Капитанская дочка", "А.С. Пушкин", 1836);
        Book book3 = new Book("Руслан и Людмила", "А.С. Пушкин", 1820);

        System.out.println("--- Проверка соглашений equals() ---");

        // Демонстрация эквивалентности (симметричность)
        System.out.println("book1.equals(book2): " + book1.equals(book2)); // true
        System.out.println("book2.equals(book1): " + book2.equals(book1)); // true

        // Демонстрация различия
        System.out.println("book1.equals(book3): " + book1.equals(book3)); // false

        // Проверка с null
        System.out.println("book1.equals(null): " + book1.equals(null));   // false
    }
}
