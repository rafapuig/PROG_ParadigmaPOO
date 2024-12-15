package encapsulation;

import static java.io.IO.println;

public class EncapsulacionDemo {

    public static void main(String[] args) {
        Person amador =
                new Person(
                        "Amador",
                        "Denador",
                        "Escacharrao",
                        Person.Gender.MALE);

        //Podemos acceder directamente a la información
        // encapsulada en el objeto
        amador.name = "Perica";
        amador.apellido1 = "Palotes";
        amador.apellido2 = "Gutierrez";
        // No podemos modificar un campo final
        //amador.gender = Person.Gender.FEMALE;
        //Pero podemos leerlo directamente
        println(amador.gender);

    }
}
