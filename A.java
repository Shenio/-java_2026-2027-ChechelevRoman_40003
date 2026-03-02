public class ConditionalSum {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        int evenSum = 0;  // сумма четных
        int oddSum = 0;   // сумма нечетных
        
        for (int num : numbers) {
            if (num % 2 == 0) {
                evenSum += num;
            } else {
                oddSum += num;
            }
        }
        
        System.out.println("Сумма четных чисел: " + evenSum);
        System.out.println("Сумма нечетных чисел: " + oddSum);
        System.out.println("Общая сумма: " + (evenSum + oddSum));
    }
}