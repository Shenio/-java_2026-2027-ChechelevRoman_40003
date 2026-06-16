import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = {5, 3, 9, 1};
        int[] arr2 = {5, 3, 9, 1};

        // 1. String toString(...) — красивый вывод содержимого массива строкой
        System.out.println("1. toString: " + Arrays.toString(arr1));
        // Выведет: [5, 3, 9, 1]

        // 5. void sort(...) — сортировка элементов массива по возрастанию
        // Вызываем перед поиском, так как binarySearch требует отсортированный массив!
        Arrays.sort(arr1);
        System.out.println("5. sort (после сортировки): " + Arrays.toString(arr1));
        // Выведет: [1, 3, 5, 9]

        // 2. int binarySearch(...) — быстрый двоичный поиск индекса элемента (массив должен быть отсортирован)
        int index = Arrays.binarySearch(arr1, 5);
        System.out.println("2. binarySearch (индекс элемента 5): " + index);
        // Выведет индекс: 2

        // 3. boolean equals(...) — сравнение содержимого двух массивов (длины и элементов на тех же позициях)
        boolean areEqual = Arrays.equals(arr1, arr2);
        System.out.println("3. equals (сравнение arr1 и arr2): " + areEqual);
        // Выведет false, так как arr1 мы отсортировали, а arr2 — нет

        // 4. boolean compare(...) (с Java 9) — лексикографическое сравнение массивов.
        // Возвращает 0, если массивы равны; отрицательное число, если первый "меньше"; положительное, если первый "больше".
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};
        int comparison = Arrays.compare(a, b);
        System.out.println("4. compare (сравнение одинаковых массивов): " + comparison);
        // Выведет: 0
    }
}
