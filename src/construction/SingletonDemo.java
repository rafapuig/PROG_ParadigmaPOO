package construction;

import java.util.Random;

/**
Hay situaciones en las que nos interesa crear una única instancia de la clase y reutilizarla
Los motivos pueden ser diversos.
- Uno de ellos podría ser, que la creación de la instancia es muy costosa en recursos (CPU, IO, etc)
- Otro sería, centralizar toda la responsabilidad de control sobre un objeto dado que representa una entidad única
Para ello, contamos con el patrón de diseño SINGLETON
El singleton se refiere a la ánica instancia existente del objeto
 */
class Dios {

    // Campo estático que almacenará de referencia al singleton
    private static Dios instance;

    // El contructor es privado, de manera que se controla y evita la creación de instancias desde código externo a la clase
    private Dios() {
        System.out.println("Acabas de crear a Dios");
    }

    /**
     * El método estático getInstance comprueba si se ha creado el singleton. Si todavía no ha sido creado, lo crea.
     * Una vez creado, devuelve una referencia al objeto singleton.
     * @return referencia al singleton
     */
    public static Dios getInstance() {
        if (instance == null) {
            instance = new Dios(); // Solamente se va a llamar al constructor una vez en toda la ejecución del programa
        }
        return instance;
    }

    static Random rand = new Random();

    static String[] miracles = {
            "Dios te quiere hacer ganar la Lotería, pero por favor, compra el décimo",
            "Dios te resucita, pero no vuelvas a pillar otra como la de anoche",
            "Dios procede a multiplicar los panes y los peces, si tienes cero de cada, te fastidias",
            "Dios te cura de una enfermedad terminal, no tiene mucha prisa por verte"
    };

    public void performMiracle() {
        System.out.println(miracles[rand.nextInt(miracles.length)]);
    }

}


public class SingletonDemo {

    public static void main(String[] args) {

        Dios.getInstance().performMiracle(); // La primera llamada provoca la creacion del singleton
        Dios.getInstance().performMiracle();
        Dios.getInstance().performMiracle();
        Dios.getInstance().performMiracle();

        //Dios dios = new Dios(); // Blasfemiaaaaa

    }
}
