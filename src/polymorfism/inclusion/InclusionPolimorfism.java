package polymorfism.inclusion;

import java.util.Random;

public class InclusionPolimorfism {

    // Método polimórfico
    static void doAnimalMakeSound(Animal animal) {
        animal.makeSound();
    }

    static Random random = new Random();

    static void testPoly() {
        for (int i = 0; i < 10; i++) {
            Animal animal = getRandomAnimal(); // No se si un perro o un gato
            animal.makeSound(); // Que hace exactamente ??? Miau o Guau ?
        }

    }

    static Animal getRandomAnimal() {
        return random.nextDouble() > 0.5 ? new Cat() : new Dog();
    }


    public static void main(String[] args) {
        Animal dog = new Dog();
        doAnimalMakeSound(dog);

        Animal cat = new Cat();
        doAnimalMakeSound(cat);

        testPoly();
    }
}
