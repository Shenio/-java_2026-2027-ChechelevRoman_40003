import java.util.ArrayList;
import java.util.List;

class Animal {}
class Dog extends Animal {}

public class Main_2 {

    // Пример PRODUCER (extends): Метод только читает данные
    public static void printAnimals(List<? extends Animal> list) {
        for (Animal animal : list) {
            System.out.println("Читаем животное: " + animal);
        }
        // list.add(new Dog()); // Ошибка компиляции! Запись запрещена
    }

    // Пример CONSUMER (super): Метод только записывает данные
    public static void addDogs(List<? super Dog> list) {
        list.add(new Dog()); // Успешно добавляем Dog
        // Animal animal = list.get(0); // Ошибка компиляции! Читается только как Object
    }

    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());

        // Благодаря <? extends Animal> мы можем передать сюда список List<Dog>
        printAnimals(dogs);

        List<Animal> animals = new ArrayList<>();
        // Благодаря <? super Dog> мы можем передать сюда список List<Animal>
        addDogs(animals);
    }
}
