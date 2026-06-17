public class Main {
    public static void main(String[] args) {

        // ==========================================
        // ПРАКТИКА #1: 10 методов StringBuilder / StringBuffer
        // (Методы этих классов идентичны, разница лишь в потокобезопасности)
        // ==========================================
        System.out.println("=== Практика #1: Методы StringBuilder ===");

        StringBuilder sb = new StringBuilder("Java");

        // 1. append() — добавляет подстроку или символ в конец
        sb.append(" 2026");
        System.out.println("1. После append: " + sb);

        // 2. insert() — вставляет строку по указанному индексу
        sb.insert(4, " SE");
        System.out.println("2. После insert: " + sb);

        // 3. delete() — удаляет символы в диапазоне индексов [start, end)
        sb.delete(4, 7);
        System.out.println("3. После delete: " + sb);

        // 4. deleteCharAt() — удаляет ровно один символ по индексу
        sb.deleteCharAt(4); // Удалит пробел перед числом
        System.out.println("4. После deleteCharAt: " + sb);

        // 5. replace() — заменяет участок строки на новую подстроку
        sb.replace(0, 4, "Kotlin");
        System.out.println("5. После replace: " + sb);

        // 6. reverse() — переворачивает строку задом наперед
        sb.reverse();
        System.out.println("6. После reverse: " + sb);
        sb.reverse(); // Вернем обратно для следующих тестов

        // 7. setCharAt() — заменяет символ по конкретному индексу
        sb.setCharAt(0, 'k');
        System.out.println("7. После setCharAt: " + sb);

        // 8. capacity() — возвращает текущий объем выделенной памяти (буфера)
        System.out.println("8. Текущий capacity: " + sb.capacity());

        // 9. length() — возвращает реальную длину строки в символах
        System.out.println("9. Текущая длина: " + sb.length());

        // 10. setLength() — принудительно изменяет длину (усекает или дополняет нулями)
        sb.setLength(6);
        System.out.println("10. После setLength(6): " + sb);
        System.out.println();


        // ==========================================
        // ПРАКТИКА #2: Преобразование объектов друг в друга
        // ==========================================
        System.out.println("=== Практика #2: Взаимное преобразование ===");

        String originalStr = "Hello";

        // 1. Из String в StringBuilder и StringBuffer (через конструктор)
        StringBuilder fromStrtoBuilder = new StringBuilder(originalStr);
        StringBuffer fromStrtoBuffer = new StringBuffer(originalStr);
        System.out.println("Из String в StringBuilder/Buffer: " + fromStrtoBuilder + " / " + fromStrtoBuffer);

        // 2. Из StringBuilder/Buffer в String (через метод toString())
        String strFromBuilder = fromStrtoBuilder.toString();
        String strFromBuffer = fromStrtoBuffer.toString();
        System.out.println("Из StringBuilder/Buffer обратно в String: " + strFromBuilder + " / " + strFromBuffer);

        // 3. Из StringBuilder в StringBuffer и наоборот (через toString() или конструктор)
        // Вариант А: Передаем напрямую в конструктор (начиная с Java 5)
        StringBuffer bufferFromBuilder = new StringBuffer(fromStrtoBuilder);
        // Вариант Б: Через промежуточную строку
        StringBuilder builderFromBuffer = new StringBuilder(fromStrtoBuffer.toString());
        System.out.println("Преобразование между собой напрямую: " + bufferFromBuilder + " и " + builderFromBuffer);
    }
}
