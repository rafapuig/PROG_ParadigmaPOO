package intro;


import static java.io.IO.println;

public class Main {

    static void example1() {
        // La variable person es de tipo Person
        // En esta variable podemos almacenar una referencia (puntero) a la dirección
        // de memoria dinámica (HEAP) donde se ubican los datos del estado del objeto
        // En Java NO se almacenan NUNCA los objetos directamente en las variables
        // En realidad la variable es de tipo puntero a objeto Person (aunque en Java no ponemos * como en C++
        // porque queda sobreentendido)
        Person person;  // Por defecto su valor inicial es null

        // Los objetos (instancias) se crean mediante el operador new
        // A continuación del operador se indica la clase de objeto a crear
        // En realidad lo que se escribe es el constructor (que tiene el mismo nombre que la clase)
        // Y los paréntesis vacíos, que indican que no se pasa ningún valor inicial para configurar el objeto
        // El constructor que no recibe ningún argumento se denomina Constructor por defecto
        // El operador new reserva memoria en el HEAP para almacenar los datos del estado de la nueva instancia
        // El operador new "devuelve" la dirección de memoria donde ha reservado espacio para el estado del objeto
        // Dicha dirección de memoria en Java se denomina referencia
        person = new Person(); // La referencia devuelta por new es lo que verdaderamente se asigna en la variable

        // Mediante la referencia podemos manipular el objeto referenciado (enviar mensajes al objeto)

        // Si no hemos ocultado los campos de la clase Person podemos acceder DIRECTAMENTE al estado del objeto y modificarlo
        person.name = "Amador Denador";
        person.age = 22;

        // Mediante la referencia (que tenemos en la variable person) pedimos al objeto que salude
        person.greet();
    }

    static void example2() {
        Person person;

        person = new Person(); // Creamos una nueva instancia de tipo Person y guardamos la referencia en la variable person
        person.name = "Amador Denador";
        person.age = 22;
        person.greet();

        // Si desreferenciamos la variable person (asignando el valor null)
        person = null;
        // Perdemos la única referencia que teníamos al objeto !!!
        // Ya no podemos ponernos en contacto con él para pedirle que haga cosas (ya no podemos hacer referencia a él)
        // Ya no hay ninguna referencia que apunte al objeto, pero el objeto todavía permanece en la memoria dinámica
        // Un proceso en segundo plano, denominado recolector de basura se encarga de detectarlo y liberar la memoria

        //NOTA: En este ejemplo, aunque no hubiéramos asignado null a la variable, la propia variable desaparece cuando
        // termina la llamada al método y con ella la referencia que almacenaba
        // (el objeto sobrevivirá hasta que sea recolectado por el (GC) Garbage Collector)
    }


    static void example3() {
        Person person;
        person = new Person();
        person.name = "Amador Denador";
        person.age = 22;
        person.greet();

        // Otra cosa que puede pasar es que la variable person apunte (referencie a otro objeto)
        person = new Person(); // se actualiza el valor de la variable person, ahora apunta a la nueva instancia
        person.name = "Esther Malgin";
        person.age = 23;
        person.greet();
    }

    static void example4() {
        // Podemos inicializar la variable al declararla
        Person amador = new Person();
        amador.name = "Amador Denador";
        amador.age = 22;
        amador.greet();

        Person esther = new Person();
        esther.name = "Esther Malgin";
        esther.age = 23;
        esther.greet();

        Person person;

        person = amador;  // Copiamos la referencia almacenada en la variable amador en la variable person
        // Ahora tanto la variable person como la variable amador apuntan a la misma instancia
        // Ambas contienen referencias al mismo objeto (tenemos dos referencias al mismo objeto)
        person.greet(); // Saludará el objeto que se llama Amador
        amador.greet();

        person = esther;  // Copiamos la referencia almacenada en la variable esther en la variable person
        person.greet(); // Saludará el objeto que se llama Esther
    }


    static void example5() {
        Person amador = new Person();
        amador.name = "Amador Denador";
        amador.age = 22;
        amador.greet();

        Person esther = new Person();
        esther.name = "Esther Malgin";
        esther.age = 23;
        esther.greet();

        // Podemos intercambiar los valores de las referencias
        Person aux;
        aux = amador;
        amador = esther;
        esther = aux;

        // Tras el intercambio
        amador.greet(); // la variable amador contiene una referencia que apunta al objeto que tiene como nombre Esther
        esther.greet(); // la variable esther contiene una referencia que apunta al objeto que tiene como nombre Amador
    }

    static void example6() {
        Person person = null;
        // Podemos comprobar si una variable contiene una referencia nula (si la referencia asignada es null)
        if( person == null) {
             person = new Person();
        }

        // Si siempre comprobamos antes de acceder al objeto referenciado por la variable
        // si verdaderamente la variable contiene una referencia a un objeto o contiene la referencia null
        // Evitaremos que se produzca un error en tiempo de ejecución por intentar acceder a los miembros del objeto
        // mediante una referencia nula
        if(person != null) {
            person.name = "Lorenzo Penco";
            person.age = 45;
            person.greet();
        }

        // Los errores en tiempo de ejecución en Java se denominan EXCEPCIONES
        // Y son también al mismo tiempo objetos
        // Concretamente si intentamos acceder a un miembro del objeto mediante una referencia nula
        // se produce la excepción NullPointerException
        person = null;
        try {
            person.greet();
        } catch (NullPointerException e) {
            println("ERROR de tipo " + e.getClass().getSimpleName() + " : " + e.getMessage());
        }

    }


    public static void main(String[] args) {
        example1();
        example2();
        example3();
        example4();
        example5();
        example6();
    }

}
