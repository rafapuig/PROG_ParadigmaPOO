package classes;

// Definir una clase Human además de crear una plantilla para crear objetos de la clase
// Define un nuevo tipo de datos (referencias)
/* Se podrán crear variables de tipo Human que almacenarán una referencia de tipo Human */
/* La referencia sirve para controlar y manipular el objeto referenciado */
public class Human {

    static long count = 0;

    String name;
    int age;
}

class HumanDemo {
    public static void main(String[] args) {

        Human perico;   // Variable para guardar la referencia de tipo Human
        perico = new Human();

        // Acceso a los campos de instancia de un objeto mediante el operador punto
        // Usamos una variable que contenga una referencia al objeto a cuyos miembros queremos acceder
        perico.name = "Perico Palotes"; // Escritura
        String name = perico.name;      // Lectura

        // Acceso a los campos estáticos (de clase) mediante el operador punto
        // Usamos el nombre de la clase un punto y el nombre del miembro de clase al que accedemos
        Human.count = 1;                // Escritura
        long population = Human.count;  // Lectura
    }
}
