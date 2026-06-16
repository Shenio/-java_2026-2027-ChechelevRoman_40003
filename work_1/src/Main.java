// Базовый класс, описывающий общий контракт для всех автомобилей
class Car {
    protected int speed = 0;

    public void accelerate() {
        speed += 10;
        System.out.println("Машина ускоряется. Текущая скорость: " + speed + " км/ч");
    }

    public int getSpeed() {
        return speed;
    }
}

// Подкласс, который замещает родителя без нарушения логики его работы
class ElectricCar extends Car {
    @Override
    public void accelerate() {
        // Электромобиль ускоряется быстрее, но логика "увеличения скорости" сохраняется
        speed += 20;
        System.out.println("Электромобиль бесшумно ускоряется. Текущая скорость: " + speed + " км/ч");
    }
}

public class Main {
    // Этот метод принимает базовый класс Car и ожидает, что после вызова accelerate() скорость увеличится
    public static void testDrive(Car car) {
        car.accelerate();

        // Проверка корректности: скорость должна стать больше 0
        if (car.getSpeed() > 0) {
            System.out.println("Тест пройден успешно! Логика контракта соблюдена.\n");
        } else {
            System.out.println("Ошибка! Нарушен контракт класса!\n");
        }
    }

    public static void main(String[] args) {
        Car ordinaryCar = new Car();
        System.out.println("--- Тестируем обычный автомобиль ---");
        testDrive(ordinaryCar); // Работает корректно

        // Подставляем подкласс ElectricCar вместо родительского класса Car
        Car myTesla = new ElectricCar();
        System.out.println("--- Тестируем электромобиль (подстановка по LSP) ---");
        // Метод testDrive продолжает работать абсолютно корректно и предсказуемо!
        testDrive(myTesla);
    }
}
