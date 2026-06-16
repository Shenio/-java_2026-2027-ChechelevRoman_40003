// Класс-демонстратор уровней доступа
class Worker {
    // 1. private - доступен ТОЛЬКО внутри этого класса Worker
    private String secretSalary = "$5000";

    // 2. Без спецификатора (package-private) - доступен всем в этом же пакете
    String department = "IT Department";

    // 3. protected - доступен в этом пакете и всем классам-наследникам
    protected String status = "Active";

    // 4. public - доступен абсолютно всем
    public String name = "Иван";

    // Метод для демонстрации private доступа внутри самого класса
    public void showSecret() {
        // Внутри класса private поле доступно без проблем
        System.out.println("Внутренний метод видит private поле secretSalary: " + secretSalary);
    }
}

// Класс-наследник для демонстрации protected доступа
class Manager extends Worker {
    public void checkProtected() {
        // За счет наследования мы имеем прямой доступ к protected полю status
        System.out.println("Наследник видит protected поле status: " + status);
    }
}

public class Main {
    public static void main(String[] args) {
        Worker worker = new Worker();
        Manager manager = new Manager();

        System.out.println("--- Проверка уровней доступа ---");

        // ПУБЛИЧНЫЙ ДОСТУП (public)
        System.out.println("Доступ к public (name): " + worker.name);

        // ДОСТУП ПО УМОЛЧАНИЮ (package-private)
        System.out.println("Доступ без спецификатора (department): " + worker.department);

        // ЗАЩИЩЕННЫЙ ДОСТУП (protected)
        System.out.println("Доступ к protected из того же пакета (status): " + worker.status);
        manager.checkProtected();

        // ПРИВАТНЫЙ ДОСТУП (private)
        // Если раскомментировать строку ниже, программа НЕ СКОМПИЛИРУЕТСЯ:
        // System.out.println(worker.secretSalary); // Ошибка: secretSalary has private access in Worker

        // Но мы можем вызвать публичный метод, который внутри себя работает с приватным полем:
        worker.showSecret();
    }
}
