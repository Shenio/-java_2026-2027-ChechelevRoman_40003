class A {
    int a1 = 10;                   // По умолчанию (package-private)
    public int a2 = 20;            // public
    protected int a3 = 30;         // protected
    private int a4 = 40;           // private

    void method1() { System.out.println("Вызов default method1"); }
    public void method2() { System.out.println("Вызов public method2"); }
    protected void method3() { System.out.println("Вызов protected method3"); }
    private void method4() { System.out.println("Вызов private method4"); }
}

class B extends A {
    void showAccess() {
        System.out.println("=== Доступ из класса B ===");
        System.out.println("a1 (default): " + a1);
        System.out.println("a2 (public): " + a2);
        System.out.println("a3 (protected): " + a3);
        // System.out.println(a4); // Ошибка компиляции: a4 имеет private доступ в A

        method1();
        method2();
        method3();
        // method4(); // Ошибка компиляции: method4() имеет private доступ в A
    }
}

class C extends B {
    void showAccessFromC() {
        System.out.println("=== Доступ из класса C ===");
        // Класс C наследует все доступные члены через класс B
        System.out.println("Унаследованное public поле a2: " + a2);
        System.out.println("Унаследованное protected поле a3: " + a3);
        method3();
    }
}

public class Main_2 {
    public static void main(String[] args) {
        B b = new B();
        b.showAccess();

        C c = new C();
        c.showAccessFromC();
    }
}
