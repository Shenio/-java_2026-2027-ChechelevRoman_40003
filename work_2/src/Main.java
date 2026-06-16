import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Создаем объект Scanner для чтения из консоли
        Scanner scan = new Scanner(System.in);

        // Выводим приглашение для ввода
        System.out.print("Введите имя: ");

        // Считываем строку, введенную пользователем
        String name = scan.nextLine();

        // Выводим приветствие на консоль
        System.out.println("Привет, " + name + "!");

        // Закрываем сканер после использования (хорошая практика)
        scan.close();
    }
}
