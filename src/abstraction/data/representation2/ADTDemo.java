package abstraction.data.representation2;

import static java.io.IO.println;

public class ADTDemo {

    public static void main(String[] args) {
        Person armando =
                new Person(
                        "Armando",
                        "Bronca",
                        "Segura",
                        Person.Gender.MALE
                );

        // Los cambios en la representación interna de la información
        // del estado de la clase Persona no afectan al código que la usa

        println(armando.getApellido1());
        println(armando.getApellido2());

        armando.setApellido1("Pérez");
        armando.setApellido2("Oso");

        println(armando.getFullName());
    }

}
