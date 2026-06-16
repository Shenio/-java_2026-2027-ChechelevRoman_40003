class A {
    public void printNum(Integer i) {
        System.out.printf("Integer = %d\n", i);
    }
    public void printNum(int i) {
        System.out.printf("int = %d\n", i);
    }
    public void printNum(Float f) {
        System.out.printf("Float = %.4f\n", f);
    }
    public void printNum(Number n) {
        System.out.println("Number= " + n);
    }
}

public class Main {
    public static void main(String[] args) {
        A a = new A();
        Number[] num = { new Integer(1), 11, 1.11f, 11.11 };

        System.out.println("--- Вывод цикла for (1) ---");
        for (Number n : num) {
            a.printNum(n); // Компилятор знает только тип Number
        }

        System.out.println("\n--- Вывод прямых вызовов (2) ---");
        a.printNum(new Integer(1));
        a.printNum(11);
        a.printNum(1.11f);
        a.printNum(11.11);
    }
}
