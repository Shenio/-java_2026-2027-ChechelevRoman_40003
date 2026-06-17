public class Main {
    public static void main(String[] args) {

        // 1. ArithmeticException
        // Возникает при недопустимых арифметических операциях, например, делении на ноль.
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("1. Перехвачено ArithmeticException: " + e.getMessage());
        }

        // 2. ArrayIndexOutOfBoundsException
        // Возникает при попытке обратиться к элементу массива по несуществующему индексу.
        try {
            int[] array = {1, 2, 3};
            int badElement = array[5]; // Индекса 5 не существует
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("2. Перехвачено ArrayIndexOutOfBoundsException: " + e.getMessage());
        }

        // 3. IllegalArgumentException
        // Выбрасывается вручную или методами API, когда в метод передан неподходящий или некорректный аргумент.
        try {
            setAge(-5); // Возраст не может быть отрицательным
        } catch (IllegalArgumentException e) {
            System.out.println("3. Перехвачено IllegalArgumentException: " + e.getMessage());
        }

        // 4. ClassCastException
        // Возникает при попытке неверного приведения типов объектов (динамическое приведение несовместимых классов).
        try {
            Object obj = "Я просто строка";
            Integer num = (Integer) obj; // Строку невозможно привести к Integer
        } catch (ClassCastException e) {
            System.out.println("4. Перехвачено ClassCastException: " + e.getMessage());
        }

        // 5. NullPointerException
        // Возникает при попытке вызвать метод или обратиться к полю объекта через ссылку, которая равна null.
        try {
            String text = null;
            int length = text.length(); // Вызов метода у null-ссылки
        } catch (NullPointerException e) {
            System.out.println("5. Перехвачено NullPointerException: Ссылка указывает на null!");
        }
    }

    // Вспомогательный метод для демонстрации IllegalArgumentException
    private static void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Возраст не может быть меньше нуля: " + age);
        }
    }
}
