package polymorfism.inclusion;

import java.util.Random;

import static java.io.IO.println;

public class InclusionPolymorphism {

    static Random random = new Random();

    /**
     * Genera un objeto que es una especialización de Animal, y que puede ser un Perro o un Gato
     * de manera aleatoria
     * @return una instancia concreta Perro o Gato que especializan la clase Animal
     */
    static Animal getRandomAnimal() {
        return random.nextBoolean() ? new Cat("Random Cat") : new Dog("Random Dog");
    }

    // Método polimórfico
    // El parámetro es de tipo Animal
    // Pero puede recibir argumentos de tipo Animal o de cualquier subtipo de Animal
    // El tipo animal (incluye a todos los subtipos que deriven directa o indirectamente de él)
    static void printAnimalName(Animal animal) {
        println(animal.getName());
    }


    // Método polimórfico
    // El parámetro es de tipo Animal
    // Pero puede recibir argumentos de tipo Animal o de cualquier subtipo de Animal
    static void doAnimalMakeSound(Animal animal) {
        // Los subtipos (clases derivadas) pueden haber reemplazado el comportamiento
        // de respuesta al mensaje makeSound
        // Java permite esto mediante los mecanismos de:
        //  - reemplazo (overriding)
        //  - y envío dinámico (dynamic dispatch), también denominado enlace tardío (late binding)
        // Todos estos mecanismos están diseñados para que:
        // La version del método makeSound que se ejecuta dependa del tipo real del objeto (Cat o Dog)
        // y no del tipo de la referencia (Animal) que se usa para llamar al método
        animal.makeSound();
    }


    static void testPoly1() {
        // Variable del supertipo Animal
        // (puede almacenar una referencia a un objeto de tipo animal ... o de cualquiera de sus subtipos)
        Animal animal;

        Dog dog;    // Variable del subtipo Dog (todo objeto Dog es también considerado (incluido) un objeto Animal)
        dog = new Dog("Pluto"); // Asignamos a la variable dog una referencia a una nueva instancia de tipo Dog
        Cat cat; // Variable del subtipo Cat (todo objeto Cat es también un objeto Animal)
        cat = new Cat("Tom"); // Asignamos a la variable cat una referencia a una nueva instancia de tipo Dog

        animal = dog; // Un valor (objeto) de tipo Dog se puede asignar a una variable de tipo Animal
        animal = cat; // Un valor (objeto) de tipo Dog se puede asignar a una variable de tipo Animal
    }


    static void testPoly2() {
        Dog dog = new Dog("Pluto");
        printAnimalName(dog);

        Cat cat = new Cat("Tom");
        printAnimalName(cat);
    }


    static void testPoly3() {
        for (int i = 0; i < 10; i++) {
            Animal animal = getRandomAnimal(); // No se si es un perro o un gato
            animal.makeSound(); // Que hace exactamente ??? Miau o Guau ?
        }
    }

    public static void main(String[] args) {
        Animal dog = new Dog("Pluto");
        doAnimalMakeSound(dog);

        Animal cat = new Cat("Tom");
        doAnimalMakeSound(cat);

        testPoly1();
        testPoly2();
        testPoly3();
    }
}
