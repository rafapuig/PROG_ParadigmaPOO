package initializers;

import java.util.Random;

import static initializers.StaticInitializer.number;

public class StaticInitializer {

    private static final Random rand = new Random();

    static int number;
    int instanceNumber;

    //Inicializador estático (solamente se llama una vez en todo el programa)
    static {
        System.out.println("static initializer");
        System.out.println("Inicializando el numero compartido con un valor aleatorio...");
        number = rand.nextInt(1, 90 + 1);
        System.out.println("Inicializado con el valor: " + number);
    }

    // Inicializador de instancia (se llama cada vez que se crea una nueva instancia y antes de llamar al constructor)
    {
        System.out.println("Dentro del inicializador de instancia");
        System.out.println("Inicializando un numero aleatorio para la instancia...");
        instanceNumber = rand.nextInt(100, 200 + 1);
    }

    public StaticInitializer() {
        System.out.println("Dentro del Constructor");
        System.out.println("El numero generado es: " + instanceNumber);
    }
}

class StaticInitializerDemo {
    public static void main(String[] args) {
        System.out.println("Inicio del programa");
        System.out.println("Declarando una variable de tipo StaticInitializer...");
        StaticInitializer si;
        System.out.println("Accediendo al campo number del tipo StaticInitializer...");
        //Acceso al campo estático number
        System.out.println("En main(): #1. numero: " + StaticInitializer.number);
        new StaticInitializer();
        System.out.println("En main(): #2. numero: " + StaticInitializer.number);
        new StaticInitializer();
        System.out.println("En main(): #3. numero: " + StaticInitializer.number);
    }
}
