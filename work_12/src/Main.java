// Родительский класс для демонстрации переопределения и перегрузки
class Animal {
    // 1. Базовый метод, который мы будем переопределять в подклассе
    public void makeSound() {
        System.out.println("Животное издает неопределенный звук");
    }

    // 2. ПЕРЕГРУЗКА: тот же метод makeSound, но с параметром (изменилась сигнатура)
    public void makeSound(int count) {
        System.out.print("Животное издает звук " + count + " раз(а): ");
        for (int i = 0; i < count; i++) {
            System.out.print("Буп! ");
        }
        System.out.println();
    }
}

// Класс-наследник
class Dog extends Animal {
    // 3. ПЕРЕОПРЕДЕЛЕНИЕ: полностью меняем поведение метода родителя
    @Override
    public void makeSound() {
        System.out.println("Собака лает: Гав-гав!");
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Демонстрация ПЕРЕГРУЗКИ (Overloading) ---");
        Animal genericAnimal = new Animal();

        // Вызываются разные методы одного класса в зависимости от аргументов
        genericAnimal.makeSound();       // Метод без параметров
        genericAnimal.makeSound(3);      // Перегруженный метод с параметром int

        System.out.println("\n--- Демонстрация ПЕРЕОПРЕДЕЛЕНИЯ (Override) ---");
        Animal myDog = new Dog();

        // Вызовется переопределенный метод из класса Dog, а не из Animal
        myDog.makeSound();
    }
}
